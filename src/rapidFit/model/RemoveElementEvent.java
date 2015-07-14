package rapidFit.model;

public class RemoveElementEvent implements DataEvent {
	
	private IDataModel<?> model;
	private int index;
	
	public RemoveElementEvent(IDataModel<?> model, int index){
		this.model = model;
		this.index = index;
	}
	
	@Override
	public IDataModel<?> getDataModel() {
		return model.getActualModel();
	}
	
	public int getIndex() {
		return index;
	}
	
}