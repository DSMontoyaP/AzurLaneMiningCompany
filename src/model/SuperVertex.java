package model;

public class SuperVertex <K extends Comparable<K>, E> {

	private Node<K,E> node;
	
	public SuperVertex (K key, E value) {
		this.node = new Node<K,E>(key, value);
	}
	
	public Node<K,E> getNode() {
		return node;
	}
	
	public void setNode(Node<K,E> node) {
		this.node = node;
	}
}
