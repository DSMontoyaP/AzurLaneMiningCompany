package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Node<K extends Comparable<K>, E> implements Serializable{

	private E element;
	private K key;

	public Node(K key, E element) {
		this.element = element;
		this.key = key;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}
}