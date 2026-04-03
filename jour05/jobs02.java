
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class jobs02 extends Application { 
    
    @Override
    public void start(Stage stage) { 
        Label label = new Label("Hello JavaFX !");     
        BorderPane borderPane = new BorderPane();
        Button button = new Button("Quitter");
        button.setOnAction(e -> stage.close());
        borderPane.setCenter(label);
        borderPane.setBottom(button);  
        Scene scene = new Scene(borderPane, 400, 200);
        stage.setScene(scene);
        stage.setTitle("Test JavaFX");
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}