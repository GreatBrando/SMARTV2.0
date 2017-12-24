package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class MCU_Controller implements Initializable {

    //Combobox
    @FXML private ComboBox<String> user_combo_probability;

    //Checkbox
    @FXML private CheckBox user_check_ac;
    @FXML private CheckBox user_check_frac;
    @FXML private CheckBox user_check_pcL;
    @FXML private CheckBox user_check_pcM;
    @FXML private CheckBox user_check_holediameter;
    @FXML private CheckBox user_check_yield;
    @FXML private CheckBox user_check_ultimate;
    @FXML private CheckBox user_check_holeoffset;

    //TextBox
    @FXML private TextField user_txt_ac;
    @FXML private TextField user_txt_frac;
    @FXML private TextField user_txt_pcL;
    @FXML private TextField user_txt_pcM;
    @FXML private TextField user_txt_holediameter;
    @FXML private TextField user_txt_yield;
    @FXML private TextField user_txt_ultimate;
    @FXML private TextField user_txt_holeoffset;

    //Buttons
    @FXML private Button user_btn_ac;
    @FXML private Button user_btn_frac;
    @FXML private Button user_btn_pcL;
    @FXML private Button user_btn_pcM;
    @FXML private Button user_btn_holediameter;
    @FXML private Button user_btn_yield;
    @FXML private Button user_btn_ultimate;
    @FXML private Button user_btn_holeoffset;

    ObservableList<String> listProb =   FXCollections.observableArrayList("Initial Crack Size Deterministic", "Initial Crack Size Lognormal (µx,σx)", "Initial Crack Size Weibull (Scale(β),Shape(α))","Initial Crack Size Tabular");

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        user_combo_probability.setItems(listProb);

    }

    public void handleCheck(ActionEvent event){
        if(user_check_ac.isSelected()){
            user_txt_ac.setDisable(false);
            user_btn_ac.setDisable(false);
        } else {
            user_txt_ac.setDisable(true);
            user_btn_ac.setDisable(true);
        }

        if(user_check_frac.isSelected()){
            user_txt_frac.setDisable(false);
            user_btn_frac.setDisable(false);
        } else {
            user_txt_frac.setDisable(true);
            user_btn_frac.setDisable(true);
        }

        if(user_check_pcL.isSelected()){
            user_txt_pcL.setDisable(false);
            user_btn_pcL.setDisable(false);
        } else {
            user_txt_pcL.setDisable(true);
            user_btn_pcL.setDisable(true);
        }

        if(user_check_pcM.isSelected()){
            user_txt_pcM.setDisable(false);
            user_btn_pcM.setDisable(false);
        } else {
            user_txt_pcM.setDisable(true);
            user_btn_pcM.setDisable(true);
        }

        if(user_check_holediameter.isSelected()){
            user_txt_holediameter.setDisable(false);
            user_btn_holediameter.setDisable(false);
        } else {
            user_txt_holediameter.setDisable(true);
            user_btn_holediameter.setDisable(true);
        }

        if(user_check_yield.isSelected()){
            user_txt_yield.setDisable(false);
            user_btn_yield.setDisable(false);
        } else {
            user_txt_yield.setDisable(true);
            user_btn_yield.setDisable(true);
        }

        if(user_check_ultimate.isSelected()){
            user_txt_ultimate.setDisable(false);
            user_btn_ultimate.setDisable(false);
        } else {
            user_txt_ultimate.setDisable(true);
            user_btn_ultimate.setDisable(true);
        }

        if(user_check_holeoffset.isSelected()){
            user_txt_holeoffset.setDisable(false);
            user_btn_holeoffset.setDisable(false);
        } else {
            user_txt_holeoffset.setDisable(true);
            user_btn_holeoffset.setDisable(true);
        }

    }



}
