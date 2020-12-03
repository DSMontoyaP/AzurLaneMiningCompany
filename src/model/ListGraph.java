package model;

import java.util.ArrayList;

public class ListGraph<K extends Comparable<K>> implements IGraph<K>{
	
	private ArrayList<ListVertex<K>> vertices;
	private boolean isWeighted;
	private boolean isDirected;
	
	public ListGraph(boolean isWeighted, boolean isDirected) {
		this.isWeighted = isWeighted;
		this.isDirected = isDirected;
	}

	@Override
	public void addVertex(K value) {
		boolean repeated = false;
		for (int i = 0; i < vertices.size() && !repeated; i++) {
		
			if (value.equals(vertices.get(i).getValue())) {
				repeated = true;
			}
		}
		
		if (!repeated) {
			vertices.add(new ListVertex<K>(value));
		}
	}

	@Override
	public Vertex<K> removeVertex(K value) {
		boolean found = false;
		for (int i = 0; i < vertices.size() && !found; i++) {
		
			if (value.equals(vertices.get(i).getValue())) {
				vertices.remove(i);
				found = true;
			}
		}
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

	public ArrayList<ListVertex<K>> getVertices() {
		return vertices;
	}

	public void setVertices(ArrayList<ListVertex<K>> vertices) {
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
