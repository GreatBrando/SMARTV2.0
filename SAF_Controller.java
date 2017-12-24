package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SAF_Controller implements Initializable  {

    //Checkbox
    @FXML private CheckBox SAF_check_ac;
    @FXML private CheckBox SAF_check_frac;
    @FXML private CheckBox SAF_check_pcL;
    @FXML private CheckBox SAF_check_pcM;
    @FXML private CheckBox SAF_check_holediameter;
    @FXML private CheckBox SAF_check_yield;
    @FXML private CheckBox SAF_check_ultimate;
    @FXML private CheckBox SAF_check_holeoffset;

    //TextBox
    @FXML private TextField SAF_txt_ac;
    @FXML private TextField SAF_txt_frac;
    @FXML private TextField SAF_txt_pcL;
    @FXML private TextField SAF_txt_pcM;
    @FXML private TextField SAF_txt_holediameter;
    @FXML private TextField SAF_txt_yield;
    @FXML private TextField SAF_txt_ultimate;
    @FXML private TextField SAF_txt_holeoffset;

    //Buttons
    @FXML private Button SAF_btn_ac;
    @FXML private Button SAF_btn_frac;
    @FXML private Button SAF_btn_pcL;
    @FXML private Button SAF_btn_pcM;
    @FXML private Button SAF_btn_holediameter;
    @FXML private Button SAF_btn_yield;
    @FXML private Button SAF_btn_ultimate;
    @FXML private Button SAF_btn_holeoffset;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    //Handle checkboxes on Master Curve
    public void handleCheck(ActionEvent event){

        if(SAF_check_ac.isSelected()){
            SAF_txt_ac.setDisable(false);
            SAF_btn_ac.setDisable(false);
        } else {
            SAF_txt_ac.setDisable(true);
            SAF_btn_ac.setDisable(true);
        }

        if(SAF_check_frac.isSelected()){
            SAF_txt_frac.setDisable(false);
            SAF_btn_frac.setDisable(false);
        } else {
            SAF_txt_frac.setDisable(true);
            SAF_btn_frac.setDisable(true);
        }

        if(SAF_check_pcL.isSelected()){
            SAF_txt_pcL.setDisable(false);
            SAF_btn_pcL.setDisable(false);
        } else {
            SAF_txt_pcL.setDisable(true);
            SAF_btn_pcL.setDisable(true);
        }

        if(SAF_check_pcM.isSelected()){
            SAF_txt_pcM.setDisable(false);
            SAF_btn_pcM.setDisable(false);
        } else {
            SAF_txt_pcM.setDisable(true);
            SAF_btn_pcM.setDisable(true);
        }

        if(SAF_check_holediameter.isSelected()){
            SAF_txt_holediameter.setDisable(false);
            SAF_btn_holediameter.setDisable(false);
        } else {
            SAF_txt_holediameter.setDisable(true);
            SAF_btn_holediameter.setDisable(true);
        }

        if(SAF_check_yield.isSelected()){
            SAF_txt_yield.setDisable(false);
            SAF_btn_yield.setDisable(false);
        } else {
            SAF_txt_yield.setDisable(true);
            SAF_btn_yield.setDisable(true);
        }

        if(SAF_check_ultimate.isSelected()){
            SAF_txt_ultimate.setDisable(false);
            SAF_btn_ultimate.setDisable(false);
        } else {
            SAF_txt_ultimate.setDisable(true);
            SAF_btn_ultimate.setDisable(true);
        }

        if(SAF_check_holeoffset.isSelected()){
            SAF_txt_holeoffset.setDisable(false);
            SAF_btn_holeoffset.setDisable(false);
        } else {
            SAF_txt_holeoffset.setDisable(true);
            SAF_btn_holeoffset.setDisable(true);
        }

    }


}
