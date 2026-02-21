###The functions of HashMaps

put(K key, V value)
get(Object key)
remove(Object key)
containsKey(Object key)
containsValue(Object value)
size()
isEmpty()
keySet()
values()
entrySet()

###The functions of Sets

add(E element)
remove(Object element)
contains(Object element)
size()
isEmpty()

###Order of insertion

A regular HashMap does not maintains the insertion order. It will be based on the hashing index which we cannot see. For to preserve order we have to use a LinkedHashMap.

HashMap<String, Integer> empId = new HashMap<>(); ---> Does not maintain order of insertion
LinkedHashMap<String, Integer> empId = new LinkedHashMap<S>(); ---> Maintains the order of insertion
