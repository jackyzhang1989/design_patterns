package two_way_adaptor_linkedlist_lab3_1;

/**
 * Created by 984938 on 4/27/2016.
 */
public class Adaptee {
    private String[] data;
    private int start;
    private int end;
    public String startString(){
        return data[start];
    }
    public String endString(){
        return data[end];
    }
    public boolean empty(){
        return ( end == -1 );
    }
    public void add(String str){
        data[end] = str;
        end++;
    }
    public void remove(int pos){
//remove the String object at position 'pos' and bring
//forward all items after it
        for ( int i = pos; i < end; i++ ){
            data[i] = data[i+1];
        }
        end--;
    }
    public String get(int pos){
        return data[pos];
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
