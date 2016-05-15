package decorator_pattern_lab13_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Profiler<E> extends AListProfilerDecorator<E>{
	public Profiler (List<E>...lists) {
		super(lists);
	}
	@Override
	public boolean add(E e){
		for (List<E> list : listTobeProfiled) {
			long startTime=System.nanoTime();
			
			for (int i = 0; i < 50000; i++) {
				list.add(e);
			}
			
			long endTime=System.nanoTime();
			System.out.println(list.getClass() + " add running time: "+(endTime-startTime)+"ns"); 
		}
		return true;
	}
	
	@Override
	public boolean remove(Object o){
		for (List<E> list : listTobeProfiled) {
			long startTime=System.nanoTime();
			
			list.remove(o);
			
			long endTime=System.nanoTime();
			System.out.println(list.getClass() + " remove running time: "+(endTime-startTime)+"ns"); 
		}
		return true;		
	}
	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}	
	@Override
	public boolean contains(Object o) {
		for (List<E> list : listTobeProfiled) {
			long startTime=System.nanoTime();
			
			list.contains(o);
			
			long endTime=System.nanoTime();
			System.out.println(list.getClass() + " contains running time: "+(endTime-startTime)+"ns"); 
		}
		return true;
	}
	@Override
	public int size(){
		int res = 0;
		for (List<E> list : listTobeProfiled) {
			long startTime=System.nanoTime();
			
			res = list.size();
			
			long endTime=System.nanoTime();
			System.out.println(list.getClass() + " size running time: "+(endTime-startTime)+"ns"); 
		}
		return res;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
