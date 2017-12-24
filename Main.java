package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage_primary;

    @Override
    public void start(Stage primaryStage) throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("LaunchWindow.fxml"));
        primaryStage.setTitle("SMART - Small Aircraft Risk Technology");
        primaryStage.setScene(new Scene(root, 1015, 695));
        primaryStage.show();
        primaryStage.setResizable(false);
        setPrimarystage(primaryStage);
    }


    public void setPrimarystage(Stage stage){
        stage_primary = stage;
    }

    public static Stage getPrimaryStage(){
        return stage_primary;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
