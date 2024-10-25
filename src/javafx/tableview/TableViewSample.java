package javafx.tableview;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TableViewSample extends Application{
    
    private TableView table = new TableView();
    
    public static void main(String[] args) {
        launch(args);   
    }
    
    @Override
    public void start (Stage stage) throws Exception{
        
        Scene Scene = new Scene(new Group());

        stage.setTitle("TableViewSample");
        stage.setWidth(500);
        stage.setHeight(500);
        
        final Label label = new Label("adressbook");
        label.setFont(new Font ("Arial", 20));
        
        table.setEditable(true);
        
        TableColumn firstNameCo1 = new TableColumn("Firs Name");
        TableColumn lastNameCo1 = new TableColumn("Last Name");
        TableColumn emailCo1 = new TableColumn("Email");
        
        table.getColumns().addAll(firstNameCo1,lastNameCo1,emailCo1);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table);
        
        ((Group) Scene.getRoot()).getChildren().addAll(vbox);
        
        stage.setScene(Scene);

        stage.show();
    }
   
}