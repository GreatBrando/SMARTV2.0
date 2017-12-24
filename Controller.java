package sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable{

    @FXML private RadioButton rb_MC;
    @FXML private RadioButton rb_SM;
    @FXML private RadioButton rb_EC;
    @FXML private TabPane def_pane;




    @FXML private ComboBox<String> combo_method;

    ObservableList<String> list = FXCollections.observableArrayList("Afgrow Generated", "Nasgro Generated", "User Generated");
    ObservableList<String> list2 = FXCollections.observableArrayList("Afgrow Generated", "Nasgro Generated", "Prerun");
    ObservableList<String> list3 = FXCollections.observableArrayList("Afgrow Generated", "Nasgro Generated");

    @FXML
    public void initialize(URL location, ResourceBundle resources){

    }

    //Menu - Looking for Input File
    public void handleActionInput(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("Input Files (*.dat)", "*.dat");
        fileChooser.getExtensionFilters().add(extFilter);
        File file = fileChooser.showOpenDialog(Main.getPrimaryStage());
    }

    //Menu - Close Application
    public void CloseApp(ActionEvent event){
        Platform.exit();
        System.exit(0);
    }

    //Menu - Open New Window
    public void newProject(ActionEvent event){
       try {

           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LaunchWindow.fxml"));
           Parent root1 = (Parent) fxmlLoader.load();

           //Second Window
           Stage stage = new Stage();
           stage.setTitle("SMART");
           stage.setScene(new Scene(root1));
           stage.show();
       } catch (Exception e){
           System.out.println("Can't load new Window");
       }
    }

    //Method - Select Radio Button
    public void radioSelect(ActionEvent event){
        if(rb_MC.isSelected()){
            combo_method.setItems(list);
        }
        else if(rb_SM.isSelected()){
            combo_method.setItems(list2);
        }
        else if(rb_EC.isSelected()){
            combo_method.setItems(list3);
        }
    }


    //Creates the different tabs for the Launch Window for MC, SM, EC
    public void tabCreate(ActionEvent event){

        if(rb_MC.isSelected() && (combo_method.getValue() == "Afgrow Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("Master Curve - Afgrow");
                tb.setContent(FXMLLoader.load(getClass().getResource("MasterCurveAfgrow.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        if(rb_MC.isSelected() && (combo_method.getValue() == "Nasgro Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("Master Curve - Nasgro");
                tb.setContent(FXMLLoader.load(getClass().getResource("MasterCurveNasgro.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        if(rb_MC.isSelected() && (combo_method.getValue() == "User Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("Master Curve - User");
                tb.setContent(FXMLLoader.load(getClass().getResource("MasterCurveUser.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        if(rb_SM.isSelected() && (combo_method.getValue() == "Afgrow Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("Surrogate Model - Afgrow");
                tb.setContent(FXMLLoader.load(getClass().getResource("SurrogateAfgrow.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }


        if(rb_SM.isSelected() && (combo_method.getValue() == "Nasgro Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("Surrogate Model - Nasgro");
                tb.setContent(FXMLLoader.load(getClass().getResource("SurrogateNasgro.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        if(rb_SM.isSelected() && (combo_method.getValue() == "Prerun")){
            try {

                Tab tb = new Tab();
                tb.setText("Surrogate Model - Prerun");
                tb.setContent(FXMLLoader.load(getClass().getResource("SurrogatePrerun.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }


        if(rb_SM.isSelected() && (combo_method.getValue() == "Prerun")){
            try {

                Tab tb = new Tab();
                tb.setText("Surrogate Model - Prerun");
                tb.setContent(FXMLLoader.load(getClass().getResource("SurrogatePrerun.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

        if(rb_EC.isSelected() && (combo_method.getValue() == "Afgrow Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("External Crack - Afgrow");
                tb.setContent(FXMLLoader.load(getClass().getResource("ExternalCrackAfgrow.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }


        if(rb_EC.isSelected() && (combo_method.getValue() == "Nasgro Generated")){
            try {

                Tab tb = new Tab();
                tb.setText("External Crack - Nasgro");
                tb.setContent(FXMLLoader.load(getClass().getResource("ExternalCrackNasgro.fxml")));
                def_pane.getTabs().add(tb);


            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }


    }

}