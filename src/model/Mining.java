package model;

public class Mining {
	
	private MatrixGraph<String> mGraph;
	private ListGraph<String> lGraph;
	private boolean isMatrixGraph;
	
	public Mining () {
		mGraph = new MatrixGraph<>(true, true);
		lGraph = new ListGraph<>(true, true);
	}
	
	public boolean addCave(String name) {
		if(isMatrixGraph) {
			mGraph.addVertex(name);
		}
		else {
			lGraph.addVertex(name);
		}
		
		return true;
	}
	
	public boolean removeCave(String name) {
		if(isMatrixGraph) {
			mGraph.removeVertex(name);
		}
		else {
			lGraph.removeVertex(name);
		}
		return true;
	}
	
	public boolean updateCave(String name, String newName) {
		return true;
	}
	
	public boolean addTunnel(String origin, String end, int weight) {
		return true;
	}
	
	public boolean removeTunnel(String origin, String end, int weight) {
		return true;
	}
	
	public boolean updateTunnel(String origin, String end, int weight, int newWeight) {
		return true;
	}
	
	public String travelDifficultyBetween(String origin, String end) {
		return "";
	}
	
	public String travelDifficultyAll(String origin) {
		return "";
	}
}
