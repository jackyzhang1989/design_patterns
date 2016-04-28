package row_lock_lab3_1_choice1;

import java.util.HashMap;
import java.util.Map;

public class TableProxy implements ITable{
	private Map<Integer, Object> locks = new HashMap<>();
	
	//real subject
	private ITable data = new Table(); 
	@Override
	public int numOfRows() {
		return data.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		return data.getRow(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		locks.put(rowNum, new Object());
		data.addRow(row, rowNum);
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		Object lock = locks.get(rowNum);
		synchronized (lock) {
			data.modifyRow(rowNum, row);
		}
	}

	@Override
	public void deleteRow(int rowNum) {
		Object lock = locks.get(rowNum);
		synchronized (lock) {
			data.deleteRow(rowNum);
		}		
	}

}
