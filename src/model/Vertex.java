package model;

import java.util.ArrayList;

public class Vertex <E extends Comparable<E>>{

	private E element;
	private ArrayList<Edge<E>> edges;
	
	public Vertex(E element) {
		this.element = element;
		edges = new ArrayList<>();
	}
	
	public ArrayList<Edge<E>> getEdges() {
		return edges;
	}
	
	public boolean addEdge(Edge<E> e) {
		return edges.add(e);
	}
	
	public boolean removeEdge(Edge<E> e) {
		return edges.remove(e);
	}
	
	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}
}
