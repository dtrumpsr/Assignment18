import java.util.LinkedList;
	
	
	public class HashLinkedChaining<K, V> implements Hash<K,V> {
	private Object[] mTable;
	
	HashLinkedChaining() {
	mTable = (new Object[2]);
	for (int i = 0; i < mTable.length; i++) {
	mTable[i] = new LinkedList<HashNode<K,V>>();
	}
	}
	
	@SuppressWarnings("rawtypes")
	public void put(K key, V value) {
	if (key == null || value == null){
	return;
	}
	
	@SuppressWarnings("unchecked")
	LinkedList<HashNode<K,V>> list = (LinkedList<HashNode<K,V>>)
	mTable[Math.abs(key.hashCode()) % mTable.length];
	
	list.add(new HashNode(key, value));
	}
	
	public V get(K key) {
	V ret;
	if (key == null) {
	return null;
	}
	
	@SuppressWarnings("unchecked")
	LinkedList<HashNode<K,V>> list = (LinkedList<HashNode<K,V>>)
	mTable[Math.abs(key.hashCode()) % mTable.length];
	
	ret = list.getFirst().getValue();
	
	return ret;
	}
	
	public int size() {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	}