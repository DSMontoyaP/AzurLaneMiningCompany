package AlejandroImplementation;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {
	
	private Vertex[][] graph;
	
	public Graph(int rowSize, int columnSize) {
		
		graph = new Vertex[rowSize][columnSize];
	}
	
	//Fills the graph with empty, neutral vertices
	public void createGraph(char[][] status) {
		for (int i = 0; i < graph.length; i++) {
			
			for (int j = 0; j < graph[i].length; j++) {
				
				if (status[i][j] == 'O') {

					graph[i][j] = new Vertex(Vertex.WHITE, -1, null);
				}
			}
		}
	
		for (int i = 0; i < graph.length; i++) {
			
			for (int j = 0; j < graph[i].length; j++) {
				
				if (graph[i][j] != null) {
					
					assignRelations(i,j);
				}
			}
		}
		
	}
	
	
	public void assignRelations(int i, int j) {
		//Up
		if (i - 1 >= 0 && graph[i - 1][j] != null) {
			graph[i][j].addEdge(graph[i - 1][j]);
		}
		//Down
		if (i + 1 < graph.length && graph[i + 1][j] != null) {
			graph[i][j].addEdge(graph[i + 1][j]);
		}
		//Left
		if (j - 1 >= 0 && graph[i][j - 1] != null) {
			graph[i][j].addEdge(graph[i][j - 1]);
		}
		//Right
		if (j + 1 < graph[i].length && graph[i][j + 1] != null) {
			graph[i][j].addEdge(graph[i][j + 1]);
		}
	}
	
	
	public void bfs (int x, int y) {
		
		PriorityQueue<Vertex> q = new PriorityQueue<>();
		
		for (int i = 0; i < graph.length; i++) {
			
			for (int j = 0; j < graph[i].length; j++) {
				
				if (graph[i][j] != null) {
					
					graph[i][j].setColor(Vertex.WHITE);
					graph[i][j].setDistance(-1);
					graph[i][j].setPredecessor(null);
				}
			}
		}
		
		Vertex source = graph[x][y];
		source.setColor(Vertex.GRAY);
		source.setDistance(0);
		source.setPredecessor(null);
		q.add(source);
		
		while (q.size() != 0) {
			
			Vertex actual = q.poll();
			ArrayList<Vertex> relations = actual.getRelations();
			
			for (int i = 0; i < relations.size(); i++) {
				if (relations.get(i) != null && relations.get(i).getColor() == Vertex.WHITE) {
					Vertex temp = relations.get(i);
					temp.setColor(Vertex.GRAY);
					temp.setDistance(actual.getDistance() + 1);
					temp.setPredecessor(actual);
					q.add(temp);
				}
			}
			
			actual.setColor(Vertex.BLACK);
		}
	}
	
	public int getRows() {
		return graph.length;
	}
	
	public int getColumns() {
		return graph[0].length;
	}

	public Vertex[][] getGraph() {
		return graph;
	}
	
	public Vertex getVertex(int x, int y) {
		return graph[x][y];
	}
}
