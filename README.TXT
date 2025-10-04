TechSupport - the DodgySoft Technical support system, version #2.

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling

This project is discussed in chapter 6.


This project implements a second version of the technical support system 
example. It is an intermediate version intended to demonstrate the first
few changes discussed in this book chapter.


To start this program, create a SupportSystem object and execute the "start" 
method.

Then start describing your problem by typing in the terminal window.

---------------------------------
24. The HashMap class contructs an empty HashMap with the default initial capacity and the default load factor. 
25. Type Parameters: K-the type of keys maintained by this map. V-the type of mapped values.
Method that depends on these types:
 get(Object key)
 compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
 computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)
 computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)
 merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)
 put(K key, V value)
 remove(Object key)
26. We use the size() method to check how many entries are contained in a map.
27. Created class MapTester
28. It replaces the old value with the new one.
29. They both exist in the map.
30. if (phonebook.containsKey("Asma")
       System.out.println("Asma")
31. It returns null.
32.
 for (String key : phoneBook.keySet()) {
     System.out.println(key);
 }
33. added the code in the Responder class
34. They both store collections of elements and allow iteration. They're differences: HashSet stores unique elements, ArrayList allows duplicates and maintains insertion order.
35. HashSet->words are unordered. ArrayList->words are returned in insertion order.
36. Use String.split("")
37. 
38.
39
40.
41.
42.
