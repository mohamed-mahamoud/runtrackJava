
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

public class jobs03 extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Nom :");
        TextField textField = new TextField();
        FlowPane flowerPane = new FlowPane();
        Button button = new Button("Envoyer");
        button.setOnAction(e -> {
            String name = textField.getText();
            label.setText("Bonjour " + name + " !");
        });
        flowerPane.getChildren().add(label);
        flowerPane.getChildren().add(textField);
        flowerPane.getChildren().add(button);
        Scene scene = new Scene(flowerPane, 400, 200);
        stage.setScene(scene);
        stage.show();
    }
    
}
