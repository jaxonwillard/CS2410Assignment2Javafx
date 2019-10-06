import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class inClass extends Application {
    public void start(Stage primaryStage){
        Pane pane = new Pane();
//        Circle circle = new Circle(200);
//        circle.setCenterX(200);
//        circle.setCenterY(200);
//        circle.setStroke(Color.BLACK);
//        circle.setFill(Color.WHITE);
//        primaryStage.heightProperty().addListener(ov ->{
//            primaryStage.setWidth(primaryStage.getHeight());
//        });
//
//        pane.widthProperty().addListener(ov -> {
//            circle.setRadius(pane.getWidth() / 2);
//        });

//        Button button = new Button("Press for circle width");
//        pane.getChildren().add(circle);
        TextField text = new TextField("f");
//        Text text = new Text("j");
//        text.setX(200);
//        text.setY(200);
//        String txt = "";
        text.setOnKeyPressed(e -> {
            Text txt = new Text(text.getText());
            txt.setX(200);
            txt.setY(200);
            pane.getChildren().add(txt);

        });
        pane.getChildren().add(text);
        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.show();
    }


}
