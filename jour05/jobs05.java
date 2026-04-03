import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class jobs05 extends Application {
    
    @Override
    public void start(Stage stage) {
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Submit");
        button.setOnAction(e -> {
            String name = textField.getText();
            System.out.println("Hello " + name + " !");
        });

        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.getChildren().addAll(label, textField, button);
        flowPane.setStyle("-fx-background-color: #121212; -fx-padding: 20;");

        label.setStyle("-fx-text-fill: #e6e6e6; -fx-font-size: 14px;");
        textField.setStyle("-fx-background-color: #1f1f1f; -fx-text-fill: #f2f2f2; -fx-prompt-text-fill: #8e8e8e; -fx-border-color: #3c3c3c;");
        button.setStyle("-fx-background-color: #2e7d32; -fx-text-fill: white; -fx-font-weight: bold;");
        
        button.setOnAction(e -> {
            String name = textField.getText();
            System.out.println("Hello " + name + " !");
        });

        Scene scene = new Scene(flowPane, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Test JavaFX");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
