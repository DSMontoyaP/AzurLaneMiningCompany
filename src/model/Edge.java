package model;

public class Edge <E extends Comparable<E>>{

	private Vertex<E> v1;
	private Vertex<E> v2;
	private int weight;
	private boolean directed;
	
	public Edge(Vertex<E> v1, Vertex<E> v2, boolean directed) {
		this.v1 = v1;
		this.v2 = v2;
		this.setDirected(directed);
		
		if(directed) {
			v1.addEdge(this);
		}else {
			v1.addEdge(this);
			v2.addEdge(this);
		}
	}
	
	public Edge(Vertex v1, Vertex v2, int weight, boolean directed) {
		this.v1 = v1;
		this.v2 = v2;
		this.weight = weight;
		this.setDirected(directed);
	
		if(directed) {
			v1.addEdge(this);
		}else {
			v1.addEdge(this);
			v2.addEdge(this);
		}
	}
	
	public Vertex<E> getV1() {
		return v1;
	}
	
	public Vertex<E> getV2() {
		return v2;
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isDirected() {
		return directed;
	}

	public void setDirected(boolean directed) {
		this.directed = directed;
	}
}

