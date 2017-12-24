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

public class SPR_Controller implements Initializable {

    @FXML private ComboBox<String> SPR_combo_probability;

    //Checkbox
    @FXML private CheckBox SPR_check_ac;
    @FXML private CheckBox SPR_check_frac;
    @FXML private CheckBox SPR_check_pcL;
    @FXML private CheckBox SPR_check_pcM;
    @FXML private CheckBox SPR_check_holediameter;
    @FXML private CheckBox SPR_check_yield;
    @FXML private CheckBox SPR_check_ultimate;
    @FXML private CheckBox SPR_check_holeoffset;

    //TextBox
    @FXML private TextField SPR_txt_ac;
    @FXML private TextField SPR_txt_frac;
    @FXML private TextField SPR_txt_pcL;
    @FXML private TextField SPR_txt_pcM;
    @FXML private TextField SPR_txt_holediameter;
    @FXML private TextField SPR_txt_yield;
    @FXML private TextField SPR_txt_ultimate;
    @FXML private TextField SPR_txt_holeoffset;

    //Buttons
    @FXML private Button SPR_btn_ac;
    @FXML private Button SPR_btn_frac;
    @FXML private Button SPR_btn_pcL;
    @FXML private Button SPR_btn_pcM;
    @FXML private Button SPR_btn_holediameter;
    @FXML private Button SPR_btn_yield;
    @FXML private Button SPR_btn_ultimate;
    @FXML private Button SPR_btn_holeoffset;

    ObservableList<String> listProb =   FXCollections.observableArrayList("Initial Crack Size Deterministic", "Initial Crack Size Lognormal (µx,σx)", "Initial Crack Size Weibull (Scale(β),Shape(α))","Initial Crack Size Tabular");


    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    //Handle checkboxes on Master Curve
    public void handleCheck(ActionEvent event){

        if(SPR_check_ac.isSelected()){
            SPR_txt_ac.setDisable(false);
            SPR_btn_ac.setDisable(false);
        } else {
            SPR_txt_ac.setDisable(true);
            SPR_btn_ac.setDisable(true);
        }

        if(SPR_check_frac.isSelected()){
            SPR_txt_frac.setDisable(false);
            SPR_btn_frac.setDisable(false);
        } else {
            SPR_txt_frac.setDisable(true);
            SPR_btn_frac.setDisable(true);
        }

        if(SPR_check_pcL.isSelected()){
            SPR_txt_pcL.setDisable(false);
            SPR_btn_pcL.setDisable(false);
        } else {
            SPR_txt_pcL.setDisable(true);
            SPR_btn_pcL.setDisable(true);
        }

        if(SPR_check_pcM.isSelected()){
            SPR_txt_pcM.setDisable(false);
            SPR_btn_pcM.setDisable(false);
        } else {
            SPR_txt_pcM.setDisable(true);
            SPR_btn_pcM.setDisable(true);
        }

        if(SPR_check_holediameter.isSelected()){
            SPR_txt_holediameter.setDisable(false);
            SPR_btn_holediameter.setDisable(false);
        } else {
            SPR_txt_holediameter.setDisable(true);
            SPR_btn_holediameter.setDisable(true);
        }

        if(SPR_check_yield.isSelected()){
            SPR_txt_yield.setDisable(false);
            SPR_btn_yield.setDisable(false);
        } else {
            SPR_txt_yield.setDisable(true);
            SPR_btn_yield.setDisable(true);
        }

        if(SPR_check_ultimate.isSelected()){
            SPR_txt_ultimate.setDisable(false);
            SPR_btn_ultimate.setDisable(false);
        } else {
            SPR_txt_ultimate.setDisable(true);
            SPR_btn_ultimate.setDisable(true);
        }

        if(SPR_check_holeoffset.isSelected()){
            SPR_txt_holeoffset.setDisable(false);
            SPR_btn_holeoffset.setDisable(false);
        } else {
            SPR_txt_holeoffset.setDisable(true);
            SPR_btn_holeoffset.setDisable(true);
        }

    }


}
