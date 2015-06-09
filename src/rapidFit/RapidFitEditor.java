package rapidFit;

import java.util.*;
import java.util.List;
import java.awt.*;

import javax.swing.*;

import rapidFit.rpfit.*;

@SuppressWarnings("serial")
public class RapidFitEditor extends JFrame {
	private int width = 700;
	private int height = 500;
	private RapidFitEditorMenuBar menuBar;
	private JTabbedPane tabs;
	
	//all panels
	private ParameterSetPanel paramSetPanel;
	private CommonPropertiesPanel commonPhaseSpacePanel;
	private FittingPanel fitPanel;
	private FitConstraintPanel fitConstraintPanel;
	private FitDataSetPanel fitDataSetPanel;
	private OutputPanel outputPanel;
	
	protected RapidFitType root;
	
	private JTextArea txtNoData;
	
	public RapidFitEditor (){
		setTitle("Rapid Fit Editor");
		setSize(width,height);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txtNoData = new JTextArea("No data is loaded. Choose File/Import in the menu bar to import a RapidFit XML file or "
				+ "choose File/New to create a new RapidFit XML file.");
		txtNoData.setEditable(false);
		txtNoData.setBackground(getBackground());
		txtNoData.setLineWrap(true);
		
		
		Container content = getContentPane();
		content.add(txtNoData, BorderLayout.CENTER);
		
		menuBar = new RapidFitEditorMenuBar(this);
		this.setJMenuBar(menuBar);
		setVisible(true);
	}
	
	public void showFit(RapidFitType root){
		//remove previously displayed contents
		Container content = getContentPane();
		content.removeAll();
		
		this.root = root;
		
		//create panels
		paramSetPanel = new ParameterSetPanel(root.getParameterSet());

		fitPanel = new FittingPanel(root.getFitFunction(), 
				root.getMinimiser(), root.getPrecalculator());

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
				toFits, actualFits);
		outputPanel = new OutputPanel();
		
		tabs = new JTabbedPane();
		tabs.addTab("Parameter Set", paramSetPanel);
		tabs.addTab("Fitting Options", fitPanel);
		tabs.addTab("Common Properties", commonPhaseSpacePanel);
		tabs.addTab("Fit Constraints", fitConstraintPanel);
		tabs.addTab("Data Sets", fitDataSetPanel);
		tabs.addTab("Output Options", outputPanel);
		
		
		content.add(tabs, BorderLayout.CENTER);
		pack();
		validate();
		setVisible(true);
	}
	
	public static void main (String [] args){
		new RapidFitEditor();
	}
	
}
