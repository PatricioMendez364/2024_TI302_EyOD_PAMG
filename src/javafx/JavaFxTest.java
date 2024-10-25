package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFxTest extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start (Stage stage) throws Exception{
        Button button = new Button("hola q ta chendo");
        button.setOnAction(eh -> {
            Alert alert = new Alert(AlertType.INFORMATION, "tachendo frio");
            alert.showAndWait();
                });
        
        StackPane root = new StackPane();
        
        root.getChildren().add(button);
        
        Scene scene = new Scene(root, 200, 200);
        stage.setScene(scene);
        stage.show();
        
    }
    
}