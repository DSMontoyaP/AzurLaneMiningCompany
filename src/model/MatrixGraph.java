package model;

import java.util.ArrayList;

public class MatrixGraph<K extends Comparable<K>> implements IGraph<K>{
	//Fuck generics all my homies use arraylist inside arraylist inside arraylist
	private ArrayList<Vertex<K>> vertices;
	private ArrayList<ArrayList<Integer>> relations;
	private ArrayList<ArrayList<ArrayList<Integer>>> weights;
	private boolean isWeighted;
	private boolean isDirected;
	
	public MatrixGraph(boolean isWeighted, boolean isDirected) {
		vertices = new ArrayList<>();
		relations = new ArrayList<>();
		weights = new ArrayList<>();
		this.isWeighted = isWeighted;
		this.isDirected = isDirected;
	}

	@Override
	public void addVertex(K value) {
		
	}

	@Override
	public Vertex<K> removeVertex(K value) {
		
		return null;
	}

	@Override
	public void editVertex(K oldValue, K newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEdge(Vertex<K> origin, Vertex<K> end, int weight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEdge(Vertex<K> origin, Vertex<K> end, int weight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editEdge(Vertex<K> origin, Vertex<K> end, int oldWeight, int newHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String floydWarshall(Vertex<K> origin, Vertex<K> end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dijsktra(Vertex<K> origin, Vertex<K> end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String bfs(Vertex<K> origin, Vertex<K> end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String dfs(Vertex<K> origin, Vertex<K> end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String prim(Vertex<K> origin, Vertex<K> end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String kruskal(Vertex<K> origin, Vertex<K> end) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Vertex<K>> getVertices() {
		return vertices;
	}

	public void setVertices(ArrayList<Vertex<K>> vertices) {
		this.vertices = vertices;
	}

	public boolean isWeighted() {
		return isWeighted;
	}

	public void setWeighted(boolean isWeighted) {
		this.isWeighted = isWeighted;
	}

	public boolean isDirected() {
		return isDirected;
	}

	public void setDirected(boolean isDirected) {
		this.isDirected = isDirected;
	}
}
