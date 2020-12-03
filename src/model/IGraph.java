package model;

public interface IGraph<K extends Comparable<K>> {
	
	public void addVertex(K value);
	public Vertex<K> removeVertex(K value);
	public void editVertex(K oldValue, K newValue);
	public void addEdge(Vertex<K> origin, Vertex<K> end, int weight);
	public void removeEdge(Vertex<K> origin, Vertex<K> end, int weight);
	public void editEdge(Vertex<K> origin, Vertex<K> end, int oldWeight, int newHeight);
	public String floydWarshall(Vertex<K> origin, Vertex<K> end);
	public String dijsktra(Vertex<K> origin, Vertex<K> end);
	public String bfs(Vertex<K> origin, Vertex<K> end);
	public String dfs(Vertex<K> origin, Vertex<K> end);
	public String prim(Vertex<K> origin, Vertex<K> end);
	public String kruskal(Vertex<K> origin, Vertex<K> end);
}
