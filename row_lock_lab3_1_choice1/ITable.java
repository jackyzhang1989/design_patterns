package row_lock_lab3_1_choice1;

/**
 * Created by 984938 on 4/27/2016.
 */
public interface ITable {
    public int numOfRows();
    public IRow getRow(int rowNum);
    public void addRow(IRow row, int rowNum);
    public void modifyRow(int rowNum, IRow row);
    public void deleteRow(int rowNum);
}
