import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Rectangles extends Application {
    public void start(Stage primaryStage){
        // set up stage and initailize Scanner object
        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        Scanner scanner = new Scanner(System.in);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        // declare each rectangle characteristic
        int rectangle1X;
        int rectangle1Y;
        int rectangle1Height;
        int rectangle1Width;
        int rectangle2X;
        int rectangle2Y;
        int rectangle2Height;
        int rectangle2Width;

        // obtain data about rectangle 1 from user
        System.out.println("Enter rectangle1 center x coordinate: ");
        rectangle1X = scanner.nextInt();
        System.out.println("Enter rectangle1 center y coordinate: ");
        rectangle1Y = scanner.nextInt();
        System.out.println("Enter rectangle1 center height: ");
        rectangle1Height = scanner.nextInt();
        System.out.println("Enter rectangle1 center width: ");
        rectangle1Width = scanner.nextInt();
        rectangle1X = rectangle1X - (rectangle1Width / 2);
        rectangle1Y = rectangle1Y - (rectangle1Height / 2);

        // obtain data about rectangle 2 from user
        System.out.println("Enter rectangle2 center x coordinate: ");
        rectangle2X = scanner.nextInt();
        System.out.println("Enter rectangle2 center y coordinate: ");
        rectangle2Y = scanner.nextInt();
        System.out.println("Enter rectangle2 center height: ");
        rectangle2Height = scanner.nextInt();
        System.out.println("Enter rectangle2 center width: ");
        rectangle2Width = scanner.nextInt();
        rectangle2X = rectangle2X - (rectangle2Width / 2);
        rectangle2Y = rectangle2Y - (rectangle2Height / 2);


        // create text object condition and resolve the condition the two rectangles are in
        Text condition = new Text("The rectangles do not overlap");
        condition.setX(10);
        condition.setY(450);
        if (rectangle2X >= rectangle1X && rectangle2X <= rectangle1X + rectangle1Width){
            if (rectangle2Y >= rectangle1Y && rectangle2Y <= rectangle1Y + rectangle1Height){
                if (rectangle2X + rectangle2Width <= rectangle1X + rectangle1Width && rectangle2Y + rectangle2Height <= rectangle1Y + rectangle1Height) {
                    condition.setText("Rectangle 2 is within rectangle 1.");
                }
                else{condition.setText("The rectangles overlap.");
                }
            }
        }
        else if (rectangle1X >= rectangle2X && rectangle1X <= rectangle2X + rectangle2Width) {
            if (rectangle1Y >= rectangle2Y && rectangle1Y <= rectangle2Y + rectangle2Height) {
                if (rectangle1X + rectangle1Width <= rectangle2X + rectangle2Width && rectangle1Y + rectangle1Height <= rectangle2Y + rectangle2Height) {
                    condition.setText("Rectangle 1 is within rectangle 2.");

                } else {
                    condition.setText("Rectangles overlap");
                }
            }
        }

        // create rectangle Objects, add rectangle Objects to pane, show primaryStage
        Rectangle rectangle1 = new Rectangle(rectangle1X, rectangle1Y, rectangle1Width, rectangle1Height );
        rectangle1.setStroke(Color.BLACK);
        rectangle1.setFill(Color.TRANSPARENT);

        Rectangle rectangle2 = new Rectangle(rectangle2X, rectangle2Y, rectangle2Width, rectangle2Height );
        rectangle2.setStroke(Color.BLACK);
        rectangle2.setFill(Color.TRANSPARENT);

        pane.getChildren().add(rectangle2);
        pane.getChildren().add(rectangle1);
        pane.getChildren().add(condition);
        primaryStage.show();
    }
}
