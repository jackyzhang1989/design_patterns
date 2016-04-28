package row_lock_lab3_1_choice1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 984938 on 4/27/2016.
 */
public class Table implements ITable{
//    private int rows = 0;
    private Map<Integer, IRow> data = new HashMap<>();
    @Override
    public int numOfRows() {
        return data.size();
    }

    @Override
    public IRow getRow(int rowNum) {
        return data.get(rowNum);
    }

    @Override
    public void addRow(IRow row, int rowNum) {
    	data.put(rowNum, row);
    }

    @Override
    public void modifyRow(int rowNum, IRow row) {
    	data.put(rowNum, row);
    }

    @Override
    public void deleteRow(int rowNum) {
    	data.remove(rowNum);
    }
}
