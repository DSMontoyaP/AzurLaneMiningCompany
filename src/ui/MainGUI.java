package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import model.Mining;

public class MainGUI {
	
	private Mining mining;
	
    @FXML
    private TextField txtInput2;

    @FXML
    private TextField txtInput1;

    @FXML
    private Circle vertexBall1;

    @FXML
    private Circle vertexBall3;

    @FXML
    private Circle vertexBall5;

    @FXML
    private Circle vertexBall2;

    @FXML
    private Circle vertexBall4;

    @FXML
    private Circle vertexBall7;

    @FXML
    private Circle vertexBall8;

    @FXML
    private Circle vertexBall9;

    @FXML
    private Circle vertexBall6;

    @FXML
    private Label vertexName3;

    @FXML
    private Label vertexName4;

    @FXML
    private Label vertexName5;

    @FXML
    private Label vertexName9;

    @FXML
    private Label vertexName6;

    @FXML
    private Label vertexName8;

    @FXML
    private Label vertexName7;

    @FXML
    private Label vertexName2;

    @FXML
    private Label vertexName1;

    public MainGUI (Mining mining) {
    	this.mining = mining;
    }
    @FXML
    void addCave(ActionEvent event) {

    }

    @FXML
    void addTunnel(ActionEvent event) {

    }

    @FXML
    void calculateTravelDifficultyBetweenAll(ActionEvent event) {

    }

    @FXML
    void calculateTravelDifficultyBetweenTwo(ActionEvent event) {

    }

    @FXML
    void removeCave(ActionEvent event) {

    }

    @FXML
    void removeTunnel(ActionEvent event) {

    }

    @FXML
    void updateCave(ActionEvent event) {

    }

    @FXML
    void updateTunnel(ActionEvent event) {

    }

}
