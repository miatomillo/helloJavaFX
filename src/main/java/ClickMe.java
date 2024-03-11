import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;

public class ClickMe extends Application
{
 public static void main(String[] args)
 {
 launch(args);
 }
 Button btn;

 @Override public void start(Stage primaryStage)
 {
 // Create the button
 // Add the button to a layout pane
 VBox layout = new VBox();
 btn = new Button();
 btn.setText("Click me to see my favorite color >:)!");
 VBox sublayout = new VBox(10,btn);
 btn.setOnAction(e -> buttonClick(layout,primaryStage));
 layout.getChildren().addAll(sublayout);
 // Add the layout pane to a scene
 Scene scene = new Scene(layout, 300, 250);
 layout.setStyle("-fx-background-color: blue");
// layout.setAlignment(Pos.CENTER);
 layout.setAlignment(Pos.CENTER_LEFT);
 // Finalize and show the stage
 primaryStage.setTitle("The Click Me App");
 primaryStage.setScene(scene);
 primaryStage.show();
 }

 public void buttonClick(VBox layout, Stage primaryStage)
 {
 if (btn.getText() == "Click me to see my favorite color >:)!")
 {
 btn.setText("Okay you can go back now :)");
 layout.setAlignment(Pos.TOP_RIGHT);
 layout.setStyle("-fx-background-color: red");
 }
 else
 {
 btn.setText("Click me to see my favorite color >:)!");
 layout.setAlignment(Pos.CENTER_LEFT);
 layout.setStyle("-fx-background-color: blue");
 }
 }
}