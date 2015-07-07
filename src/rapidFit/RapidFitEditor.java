package rapidFit;

import java.util.*;
import java.util.List;
import java.awt.*;

import javax.swing.*;

import rapidFit.controller.AbstractAttributeTableController;
import rapidFit.controller.AbstractDataTableController;
import rapidFit.controller.AttributeTableController;
import rapidFit.controller.DataTableController;
import rapidFit.controller.MainController;
import rapidFit.model.AbstractClassModel;
import rapidFit.model.AbstractListModel;
import rapidFit.model.ClassModel;
import rapidFit.model.MultiFieldsListModel;
import rapidFit.rpfit.*;

@SuppressWarnings("serial")
public class RapidFitEditor extends JFrame {
	private final int width = 1000;
	private final int height = 800;
	
	private JTabbedPane tabs;
	
	//all panels
	private DataTablePanel<PhysicsParameterType> paramSetPanel;
	private CommonPropertiesPanel commonPhaseSpacePanel;
	private FittingPanel fitPanel;
	private FitConstraintPanel fitConstraintPanel;
	private FitDataSetPanel fitDataSetPanel;
	private OutputScanPanel outputScanPanel;
	private DataListViewer<ComponentProjectionType> outputProjectionPanel;
	
	private JTextArea txtNoData;
	
	private static RapidFitEditor editor = null;
	
	private MainController mainController;
	
	private RapidFitEditor(){
		init();
	}
	
	public static RapidFitEditor getInstance(){
		if (editor == null){
			editor = new RapidFitEditor();
		}
		return editor;
	}
	
	public void init(){
		setTitle("Rapid Fit Editor");
		setSize(new Dimension(width, height));
		setPreferredSize(new Dimension(width, height));
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txtNoData = new JTextArea("No data is loaded. Choose File/Import "
				+ "in the menu bar to import a RapidFit XML file or "
				+ "choose File/New to create a new RapidFit XML file.");
		txtNoData.setEditable(false);
		txtNoData.setBackground(getBackground());
		txtNoData.setLineWrap(true);
		
		Container content = getContentPane();
		content.add(txtNoData, BorderLayout.CENTER);
		
		setJMenuBar(RapidFitEditorMenuBar.getInstance());
	}
	
	
	public void showFit(RapidFitType root, String fileName){
		//set title
		setTitle("Rapid Fit Editor - " + fileName);
		
		//remove previously displayed contents
		Container content = getContentPane();
		content.removeAll();
		
		//create panels
		paramSetPanel = new DataTablePanel<PhysicsParameterType>(
				PhysicsParameterType.class,
				root.getParameterSet().getPhysicsParameter(), null,
				"Add Parameter", "Remove Parameter(s)", "Duplicate Parameter(s)");

		fitPanel = new FittingPanel(root);

		commonPhaseSpacePanel = new CommonPropertiesPanel(
				root.getParameterSet().getPhysicsParameter(),
				root.getCommonPhaseSpace().getPhaseSpaceBoundary(),
				root.getCommonPDF());

		//separate actual fit and fit constraints
		List<ToFitType> toFits = root.getToFit();
		ToFitType constraintFit = null;
		ArrayList<ToFitType> actualFits = new ArrayList<ToFitType>();
		
		for (ToFitType fit : toFits){
			if (fit.getConstraintFunction() == null){
				actualFits.add(fit);
				
			/*
			 * there should only be one constraint function. All constraint
			 * functions are combined into a single constraint function in 
			 * the factory
			 */
			} else {
				constraintFit = fit;
			}
		}

		fitConstraintPanel = new FitConstraintPanel(constraintFit.getConstraintFunction());
		fitDataSetPanel = new FitDataSetPanel(
				root.getParameterSet().getPhysicsParameter(),
				toFits, actualFits, "Available Data Sets", "Data_Set");
		outputScanPanel = new OutputScanPanel(root.getOutput());
		
		List<ComponentProjectionType> projectionList = root.getOutput().getComponentProjection();
		outputProjectionPanel = new DataListViewer<ComponentProjectionType>(
				ComponentProjectionType.class, projectionList , projectionList, 
				"Available Projections", "Comp_Proj", "Projection Details");
		
		//new MVC design part
		mainController = new MainController();
		
		//create the parameter set panel
		AbstractListModel<PhysicsParameterType> physicsParams = 
				new MultiFieldsListModel<PhysicsParameterType>(PhysicsParameterType.class,
						root.getParameterSet().getPhysicsParameter(), null);
		AbstractDataTableController physicsParamsTableController = new 
				DataTableController<PhysicsParameterType>(mainController, physicsParams,
						"Add Parameter", "Remove Parameter(s)", "Duplicate Parameter(s)");
		
		//create the fit option panel
		AbstractClassModel<FitFunctionType> fitFunction = 
				new ClassModel<FitFunctionType>(FitFunctionType.class,
						root.getFitFunction(), null);
		AbstractClassModel<MinimiserType> minimiser = 
				new ClassModel<MinimiserType>(MinimiserType.class,
						root.getMinimiser(), null);
		AbstractClassModel<PrecalculatorType> precalculator = 
				new ClassModel<PrecalculatorType>(PrecalculatorType.class,
						root.getPrecalculator(), null);
		AbstractAttributeTableController fitFunctionTableController = 
				new AttributeTableController<FitFunctionType>(mainController, fitFunction, "Fit Function");
		AbstractAttributeTableController minimiserTableController = 
				new AttributeTableController<MinimiserType>(mainController, minimiser, "Miminiser");
		AbstractAttributeTableController precalculatorTableController = 
				new AttributeTableController<PrecalculatorType>(mainController, precalculator, "Precalculator");
		
		JPanel fitOptionsPanel = new JPanel();
		fitOptionsPanel.setLayout(new GridLayout(2,2));
		fitOptionsPanel.add(fitFunctionTableController.getViewComponent());
		fitOptionsPanel.add(minimiserTableController.getViewComponent());
		fitOptionsPanel.add(precalculatorTableController.getViewComponent());
		
		AbstractListModel<ObservableType> observables = 
				new MultiFieldsListModel<ObservableType>(ObservableType.class, 
						root.getCommonPhaseSpace().getPhaseSpaceBoundary().getObservable(), null);
		AbstractDataTableController observablesTableController = new 
				DataTableController<ObservableType>(mainController, observables,
						"Add Observable", "Remove Observable(s)", "Duplicate Observable(s)");
		
		RapidFitEditorMenuBar.getInstance().setMainController(mainController);
		
		tabs = new JTabbedPane();
		tabs.addTab("Parameter Set", paramSetPanel);
		tabs.addTab("Fitting Options", fitPanel);
		tabs.addTab("Common Properties", commonPhaseSpacePanel);
		tabs.addTab("Fit Constraints", fitConstraintPanel);
		tabs.addTab("Data Sets", fitDataSetPanel);
		tabs.addTab("Output - Scans", outputScanPanel);
		tabs.addTab("Output - Projections", outputProjectionPanel);
		tabs.addTab("Trial Parameter Set", physicsParamsTableController.getViewComponent());
		tabs.addTab("Trial Fitting Options", fitOptionsPanel);
		tabs.addTab("Trial Parameter Set", observablesTableController.getViewComponent());
		
		content.add(tabs, BorderLayout.CENTER);
		validate();
		setVisible(true);
	}
	
	public static void main (String [] args){
		RapidFitEditor.getInstance().setVisible(true);;
	}
	
}
