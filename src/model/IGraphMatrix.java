package model;

import java.util.ArrayList;

public interface IGraphMatrix<V, E extends Comparable<E>> {
	
	public void addVertex(E element);
	public boolean removeVertex(E element);
	public void addEdge(V source, V destination);
	public E searchVertex(E element);
	public boolean updateVertex(E element, E updatedElement);
	public void removeEdge(E element);
	public ArrayList<Integer> djikstra (V origin);
	public ArrayList<V> BFS (V origin);
}
