package com.example.timetable;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.File;

public class HelloController {


    @FXML
    GridPane gridPane;

    @FXML
    TableView tableView;
    public HelloController(){
        System.out.println("Something");

    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.getChildren().removeAll();

        for (int r=0; r<3; r++){
        for (int i =0; i<7; i++){
          DynamicObjects(gridPane,i+" "+r, "MOVIE NAME "+i+" "+r, i,r, "C:\\Users\\s.djuraev\\IdeaProjects\\TimeTable\\src\\main\\resources\\photos\\photo.jpg");
        }
        }
}

private void DynamicObjects(GridPane gridPane1, String ID, String labelText, int i, int j, String imageURL){
    ImageView imageView=new ImageView();
    imageView.setImage(new Image(imageURL));
    imageView.setFitHeight(100);
    imageView.setFitWidth(120);
    imageView.setStyle("-fx-background-color: YELLOW");
    imageView.setId(ID);
    imageView.setOnMouseExited(event -> changePhoto(imageView,"C:\\Users\\s.djuraev\\IdeaProjects\\TimeTable\\src\\main\\resources\\photos\\photo.jpg" ));
    imageView.setOnMouseClicked(event -> changePhoto(imageView,"C:\\Users\\s.djuraev\\IdeaProjects\\TimeTable\\src\\main\\resources\\photos\\123.jpg"));
    Label label=new Label(labelText);
    VBox vBox=new VBox();
    vBox.getChildren().add(imageView);
    vBox.getChildren().add(label);
    gridPane1.add(vBox,i,j);

    }
    private void changePhoto(ImageView imageView, String link){

        imageView.setImage(new Image(link));
    }

private void readMessage(String ID){
    System.out.println(ID);

}
}
//  System.out.println(i+" "+r);
//          TextArea  textArea=new TextArea("Computer Science");
//          textArea.setPrefHeight(100);
//          textArea.setPrefWidth(100);
//          textArea.autosize();
//          textArea.setId(i+""+r);
//          textArea.setOnMouseClicked(event -> readMessage(textArea.getId()));
//          gridPane.add(textArea, i,r);
//          System.out.println(textArea.getId());