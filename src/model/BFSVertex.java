package model;

import java.util.ArrayList;

public class BFSVertex implements Comparable<BFSVertex>{
	
	public static final int WHITE = 0;
	public static final int GRAY = 1;
	public static final int BLACK = 2;
	
	private ArrayList<BFSVertex> relations;
	private int color;
	private int distance;
	private BFSVertex predecessor;
	
	public BFSVertex(int color, int distance, BFSVertex predecessor) {
		this.relations = new ArrayList<>();
		this.color = color;
		this.distance = distance;
		this.predecessor = predecessor;
	}

	public void addEdge(BFSVertex destiny) {
		relations.add(destiny);
	}
	
	public ArrayList<BFSVertex> getRelations() {
		return relations;
	}

	public void setRelations(ArrayList<BFSVertex> relations) {
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

	public BFSVertex getPredecessor() {
		return predecessor;
	}

	public void setPredecessor(BFSVertex predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public int compareTo(BFSVertex other) {
		
		return this.distance - other.getDistance();
	}
}
