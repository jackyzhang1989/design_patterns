package two_way_adaptor_linkedlist_lab3_1;

/**
 * Created by 984938 on 4/27/2016.
 */
public class Adapter implements Stack, Queue{
    private Adaptee adaptee;
    @Override
    public void push(String str) {
        adaptee.add(str);
    }
    @Override
    public String pop() {
        int end = adaptee.getEnd();
        String str = adaptee.get(end);
        adaptee.remove(end);
        return str;
    }

    @Override
    public void offer(String str) {
        adaptee.add(str);
    }

    @Override
    public String poll() {
        int start = adaptee.getStart();
        String str = adaptee.get(start);
        adaptee.remove(start);
        return str;
    }

    @Override
    public boolean isEmpty() {
        return adaptee.empty();
    }
}
