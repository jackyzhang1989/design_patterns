package copy_on_write_hash_map_lab3_2_choice_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 984938 on 4/27/2016.
 */
public class CopyOnWriteHashMap<K, V> implements Map<K,V> {
    final transient ReentrantLock lock = new ReentrantLock();

    private transient volatile Map<K, V> data = new HashMap<>();
    // no lock
	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		return data.get(key);
	}

    // all following method use lock
    @Override
    public V put(K key, V value) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            //clone is stub function TO BE DONE
            Map<K, V> newMap = data.clone();
            newMap.put(key,value);
            data = newMap;
            return value;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public V remove(Object key) {
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {

            //clone is stub function TO BE DONE
            Map<K, V> newMap = data.clone();
            V value = newMap.get(key);
            newMap.remove(key);
            data = newMap;
            return value;
        } finally {
            lock.unlock();
        }
    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}





	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}
