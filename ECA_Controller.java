package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ECA_Controller implements Initializable {

    //Checkbox
    @FXML private CheckBox ECA_check_ac;
    @FXML private CheckBox ECA_check_frac;
    @FXML private CheckBox ECA_check_pcL;
    @FXML private CheckBox ECA_check_pcM;
    @FXML private CheckBox ECA_check_holediameter;
    @FXML private CheckBox ECA_check_yield;
    @FXML private CheckBox ECA_check_ultimate;
    @FXML private CheckBox ECA_check_holeoffset;

    //TextBox
    @FXML private TextField ECA_txt_ac;
    @FXML private TextField ECA_txt_frac;
    @FXML private TextField ECA_txt_pcL;
    @FXML private TextField ECA_txt_pcM;
    @FXML private TextField ECA_txt_holediameter;
    @FXML private TextField ECA_txt_yield;
    @FXML private TextField ECA_txt_ultimate;
    @FXML private TextField ECA_txt_holeoffset;

    //Buttons
    @FXML private Button ECA_btn_ac;
    @FXML private Button ECA_btn_frac;
    @FXML private Button ECA_btn_pcL;
    @FXML private Button ECA_btn_pcM;
    @FXML private Button ECA_btn_holediameter;
    @FXML private Button ECA_btn_yield;
    @FXML private Button ECA_btn_ultimate;
    @FXML private Button ECA_btn_holeoffset;


    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    //Handle checkboxes on Master Curve
    public void handleCheck(ActionEvent event){

        if(ECA_check_ac.isSelected()){
            ECA_txt_ac.setDisable(false);
            ECA_btn_ac.setDisable(false);
        } else {
            ECA_txt_ac.setDisable(true);
            ECA_btn_ac.setDisable(true);
        }

        if(ECA_check_frac.isSelected()){
            ECA_txt_frac.setDisable(false);
            ECA_btn_frac.setDisable(false);
        } else {
            ECA_txt_frac.setDisable(true);
            ECA_btn_frac.setDisable(true);
        }

        if(ECA_check_pcL.isSelected()){
            ECA_txt_pcL.setDisable(false);
            ECA_btn_pcL.setDisable(false);
        } else {
            ECA_txt_pcL.setDisable(true);
            ECA_btn_pcL.setDisable(true);
        }

        if(ECA_check_pcM.isSelected()){
            ECA_txt_pcM.setDisable(false);
            ECA_btn_pcM.setDisable(false);
        } else {
            ECA_txt_pcM.setDisable(true);
            ECA_btn_pcM.setDisable(true);
        }

        if(ECA_check_holediameter.isSelected()){
            ECA_txt_holediameter.setDisable(false);
            ECA_btn_holediameter.setDisable(false);
        } else {
            ECA_txt_holediameter.setDisable(true);
            ECA_btn_holediameter.setDisable(true);
        }

        if(ECA_check_yield.isSelected()){
            ECA_txt_yield.setDisable(false);
            ECA_btn_yield.setDisable(false);
        } else {
            ECA_txt_yield.setDisable(true);
            ECA_btn_yield.setDisable(true);
        }

        if(ECA_check_ultimate.isSelected()){
            ECA_txt_ultimate.setDisable(false);
            ECA_btn_ultimate.setDisable(false);
        } else {
            ECA_txt_ultimate.setDisable(true);
            ECA_btn_ultimate.setDisable(true);
        }

        if(ECA_check_holeoffset.isSelected()){
            ECA_txt_holeoffset.setDisable(false);
            ECA_btn_holeoffset.setDisable(false);
        } else {
            ECA_txt_holeoffset.setDisable(true);
            ECA_btn_holeoffset.setDisable(true);
        }

    }

}
