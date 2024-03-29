import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcome extends Application {

    public void start(Stage primaryStage){
        //Set up stage
        Pane fp = new Pane();
        Scene scene = new Scene(fp);
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);


        // Create message, set position of each character, and set rotation of each character.
        String text = "Welcome To Java ";
        for (int i=0; i < text.length(); i++){
            Character character = text.charAt(i);
            String charToString = character.toString();
            Text letter = new Text(charToString);
            double radius = 50;
            double theta = (Math.PI * 2 / text.length()) * i;
            double x = Math.cos(theta) * radius;
            double y = Math.sin(theta) * radius;
            letter.setX(x + 100);
            letter.setY(y + 100);
            letter.setRotate((360 / text.length() * i) + 90);
            fp.getChildren().add(letter);

        }
        //display
        primaryStage.setScene(scene);
        primaryStage.show();



    }



}
