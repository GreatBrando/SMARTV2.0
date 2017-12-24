package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SNA_Controller implements Initializable {

    //Checkbox
    @FXML private CheckBox SNA_check_ac;
    @FXML private CheckBox SNA_check_frac;
    @FXML private CheckBox SNA_check_pcL;
    @FXML private CheckBox SNA_check_pcM;
    @FXML private CheckBox SNA_check_holediameter;
    @FXML private CheckBox SNA_check_yield;
    @FXML private CheckBox SNA_check_ultimate;
    @FXML private CheckBox SNA_check_holeoffset;

    //TextBox
    @FXML private TextField SNA_txt_ac;
    @FXML private TextField SNA_txt_frac;
    @FXML private TextField SNA_txt_pcL;
    @FXML private TextField SNA_txt_pcM;
    @FXML private TextField SNA_txt_holediameter;
    @FXML private TextField SNA_txt_yield;
    @FXML private TextField SNA_txt_ultimate;
    @FXML private TextField SNA_txt_holeoffset;

    //Buttons
    @FXML private Button SNA_btn_ac;
    @FXML private Button SNA_btn_frac;
    @FXML private Button SNA_btn_pcL;
    @FXML private Button SNA_btn_pcM;
    @FXML private Button SNA_btn_holediameter;
    @FXML private Button SNA_btn_yield;
    @FXML private Button SNA_btn_ultimate;
    @FXML private Button SNA_btn_holeoffset;


    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    //Handle checkboxes on Master Curve
    public void handleCheck(ActionEvent event){

        if(SNA_check_ac.isSelected()){
            SNA_txt_ac.setDisable(false);
            SNA_btn_ac.setDisable(false);
        } else {
            SNA_txt_ac.setDisable(true);
            SNA_btn_ac.setDisable(true);
        }

        if(SNA_check_frac.isSelected()){
            SNA_txt_frac.setDisable(false);
            SNA_btn_frac.setDisable(false);
        } else {
            SNA_txt_frac.setDisable(true);
            SNA_btn_frac.setDisable(true);
        }

        if(SNA_check_pcL.isSelected()){
            SNA_txt_pcL.setDisable(false);
            SNA_btn_pcL.setDisable(false);
        } else {
            SNA_txt_pcL.setDisable(true);
            SNA_btn_pcL.setDisable(true);
        }

        if(SNA_check_pcM.isSelected()){
            SNA_txt_pcM.setDisable(false);
            SNA_btn_pcM.setDisable(false);
        } else {
            SNA_txt_pcM.setDisable(true);
            SNA_btn_pcM.setDisable(true);
        }

        if(SNA_check_holediameter.isSelected()){
            SNA_txt_holediameter.setDisable(false);
            SNA_btn_holediameter.setDisable(false);
        } else {
            SNA_txt_holediameter.setDisable(true);
            SNA_btn_holediameter.setDisable(true);
        }

        if(SNA_check_yield.isSelected()){
            SNA_txt_yield.setDisable(false);
            SNA_btn_yield.setDisable(false);
        } else {
            SNA_txt_yield.setDisable(true);
            SNA_btn_yield.setDisable(true);
        }

        if(SNA_check_ultimate.isSelected()){
            SNA_txt_ultimate.setDisable(false);
            SNA_btn_ultimate.setDisable(false);
        } else {
            SNA_txt_ultimate.setDisable(true);
            SNA_btn_ultimate.setDisable(true);
        }

        if(SNA_check_holeoffset.isSelected()){
            SNA_txt_holeoffset.setDisable(false);
            SNA_btn_holeoffset.setDisable(false);
        } else {
            SNA_txt_holeoffset.setDisable(true);
            SNA_btn_holeoffset.setDisable(true);
        }

    }


}
