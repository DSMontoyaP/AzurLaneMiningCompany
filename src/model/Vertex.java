package model;

public class Vertex<K extends Comparable<K>> {
	
	private K value;
	
	public Vertex(K value) {
		this.value = value;
	}

	public K getValue() {
		return value;
	}

	public void setValue(K value) {
		this.value = value;
	}
}
