package rapidFit.view.bldblocks;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;

import rapidFit.controller.IDataTableController;


@SuppressWarnings("serial")
public class DataTable extends Table {	
	
	@SuppressWarnings("unchecked")
	public DataTable(IDataTableController<?> controller, DataTableViewModel viewModel) {
		super(controller, viewModel);

		//display enum attributes as combo box
		for (int i = 0; i < viewModel.getColumnCount(); i++){
			Class<?> clazz = viewModel.getColumnClass(i);
			if (clazz.isEnum()){
				getColumnModel().getColumn(i).setCellEditor(
						new DefaultCellEditor(new JComboBox<Enum<?>>(
								((Class<? extends Enum<?>>) clazz).getEnumConstants())));
			}
		}
		
	}
}
