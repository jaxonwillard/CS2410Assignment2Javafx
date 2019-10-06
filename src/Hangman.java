import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Hangman extends Application {
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        primaryStage.setHeight(500);
        primaryStage.setWidth(400);


        Line pole = new Line(100, 100, 100, 350);
        Line poleTop = new Line(100, 100, 250, 100);
        Line poleBar = new Line(250, 100, 250, 125);
        Circle head = new Circle(250, 150, 25, Color.WHITE);
        head.setStroke(Color.BLACK);
        Line leftArm = new Line(250, 150, 205, 220);
        Line rightArm = new Line(250, 150, 295, 220);
        Line body = new Line(250, 175, 250, 250);
        Line rightLeg = new Line(body.getEndX(), body.getEndY(), 275, 300);
        Line leftLeg = new Line(body.getEndX(), body.getEndY(), 225, 300);
        Arc poleBase = new Arc(pole.getEndX(), pole.getEndY() + 75, 75, 75, 35, 110);
        poleBase.setFill(Color.WHITE);
        poleBase.setStroke(Color.BLACK);


        pane.getChildren().add(poleTop);
        pane.getChildren().add(poleBar);
        pane.getChildren().add(leftArm);
        pane.getChildren().add(rightArm);
        pane.getChildren().add(body);
        pane.getChildren().add(rightLeg);
        pane.getChildren().add(leftLeg);
        pane.getChildren().add(poleBase);
        pane.getChildren().add(head);
        pane.getChildren().add(pole);


        primaryStage.setTitle("hangman!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
