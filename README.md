# Java Quiz Week 11 Day 1
## Overview
* This quiz has sections regarding:
	
    - **Generics**
        * `MyStack`
        * `Group`
        * `SortedGroup`
        * `GenericUtils` - Difficult
        * `ComparableTreeSet` - Very Difficult




<hr><hr>

## Sections: Generics
### MyStack<T>
* **Description**
	* The purpose of this class is to implement a _proper_ `Stack`.
* **Methods to Complete**
	* `void push(T value)`
	* `T peek()`
	* `T pop()`
	* `Boolean isEmpty()`

### Group<T>
* **Description**
	* The purpose of this class is to create a generic wrapper for a `List` object
* **Methods to Complete**
	* `Integer count()`
	* `void insert(T value)`
	* `Boolean has(T value)`
	* `T fetch(int indexOfValue)`
	* `void delete(T value)`
	* `void clear()`
	* `Iterator<T> iterator()`

### SortedGroup<T>
* **Description**
	* The purpose of this class is to create a generic wrapper for sorted `List` object.
* **Methods to Complete**
	* `insert(T value)`
	* `delete(T value)`
	* `Integer indexOf(T value)`

### GenericUtils
* **Description**
	* The purpose of this class is to create a procedure to generate the [power set](https://www.mathsisfun.com/sets/power-set.html) of an `Set` of objects.
* **Methods to Complete**
	* `<T extends Comparable> Iterable<? extends Iterable<T>> powerSet(Set<T> originalSet)`
	* `<T extends Comparable> Iterable<? extends Iterable<T>> powerSet(T... originalSet)`

### ComparableTreeSet<T>
* **Description**
	* The purpose of this class is to create subclass of a `TreeSet<T>` which can `compareTo` other objects of the same type.
	* This shit is hard.
* **Methods to Complete**
	* `int compareTo(ComparableTreeSet<T> o)`
	
