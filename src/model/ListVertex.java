package model;

import java.util.ArrayList;

public class ListVertex<K extends Comparable<K>> extends Vertex{

	private ArrayList<Vertex<K>> edges;
	private ArrayList<Integer> weights;
	
	public ListVertex(K value) {
		super(value);
		edges = new ArrayList<>();
		weights = new ArrayList<>();
	}
}
