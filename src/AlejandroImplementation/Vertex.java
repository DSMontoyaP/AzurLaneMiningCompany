package AlejandroImplementation;

import java.util.ArrayList;

public class Vertex implements Comparable<Vertex>{
	
	public static final int WHITE = 0;
	public static final int GRAY = 1;
	public static final int BLACK = 2;
	
	private ArrayList<Vertex> relations;
	private int color;
	private int distance;
	private Vertex predecessor;
	
	public Vertex(int color, int distance, Vertex predecessor) {
		this.relations = new ArrayList<>();
		this.color = color;
		this.distance = distance;
		this.predecessor = predecessor;
	}

	public void addEdge(Vertex destiny) {
		relations.add(destiny);
	}
	
	public ArrayList<Vertex> getRelations() {
		return relations;
	}

	public void setRelations(ArrayList<Vertex> relations) {
		this.relations = relations;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Vertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(Vertex predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public int compareTo(Vertex other) {
		
		return this.distance - other.getDistance();
	}
}
