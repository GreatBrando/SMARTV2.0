package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ECN_Controller implements Initializable {

    //Checkbox
    @FXML private CheckBox ECN_check_ac;
    @FXML private CheckBox ECN_check_frac;
    @FXML private CheckBox ECN_check_pcL;
    @FXML private CheckBox ECN_check_pcM;
    @FXML private CheckBox ECN_check_holediameter;
    @FXML private CheckBox ECN_check_yield;
    @FXML private CheckBox ECN_check_ultimate;
    @FXML private CheckBox ECN_check_holeoffset;

    //TextBox
    @FXML private TextField ECN_txt_ac;
    @FXML private TextField ECN_txt_frac;
    @FXML private TextField ECN_txt_pcL;
    @FXML private TextField ECN_txt_pcM;
    @FXML private TextField ECN_txt_holediameter;
    @FXML private TextField ECN_txt_yield;
    @FXML private TextField ECN_txt_ultimate;
    @FXML private TextField ECN_txt_holeoffset;

    //Buttons
    @FXML private Button ECN_btn_ac;
    @FXML private Button ECN_btn_frac;
    @FXML private Button ECN_btn_pcL;
    @FXML private Button ECN_btn_pcM;
    @FXML private Button ECN_btn_holediameter;
    @FXML private Button ECN_btn_yield;
    @FXML private Button ECN_btn_ultimate;
    @FXML private Button ECN_btn_holeoffset;


    @FXML
    public void initialize(URL location, ResourceBundle resources) {

    }

    //Handle checkboxes on Master Curve
    public void handleCheck(ActionEvent event){

        if(ECN_check_ac.isSelected()){
            ECN_txt_ac.setDisable(false);
            ECN_btn_ac.setDisable(false);
        } else {
            ECN_txt_ac.setDisable(true);
            ECN_btn_ac.setDisable(true);
        }

        if(ECN_check_frac.isSelected()){
            ECN_txt_frac.setDisable(false);
            ECN_btn_frac.setDisable(false);
        } else {
            ECN_txt_frac.setDisable(true);
            ECN_btn_frac.setDisable(true);
        }

        if(ECN_check_pcL.isSelected()){
            ECN_txt_pcL.setDisable(false);
            ECN_btn_pcL.setDisable(false);
        } else {
            ECN_txt_pcL.setDisable(true);
            ECN_btn_pcL.setDisable(true);
        }

        if(ECN_check_pcM.isSelected()){
            ECN_txt_pcM.setDisable(false);
            ECN_btn_pcM.setDisable(false);
        } else {
            ECN_txt_pcM.setDisable(true);
            ECN_btn_pcM.setDisable(true);
        }

        if(ECN_check_holediameter.isSelected()){
            ECN_txt_holediameter.setDisable(false);
            ECN_btn_holediameter.setDisable(false);
        } else {
            ECN_txt_holediameter.setDisable(true);
            ECN_btn_holediameter.setDisable(true);
        }

        if(ECN_check_yield.isSelected()){
            ECN_txt_yield.setDisable(false);
            ECN_btn_yield.setDisable(false);
        } else {
            ECN_txt_yield.setDisable(true);
            ECN_btn_yield.setDisable(true);
        }

        if(ECN_check_ultimate.isSelected()){
            ECN_txt_ultimate.setDisable(false);
            ECN_btn_ultimate.setDisable(false);
        } else {
            ECN_txt_ultimate.setDisable(true);
            ECN_btn_ultimate.setDisable(true);
        }

        if(ECN_check_holeoffset.isSelected()){
            ECN_txt_holeoffset.setDisable(false);
            ECN_btn_holeoffset.setDisable(false);
        } else {
            ECN_txt_holeoffset.setDisable(true);
            ECN_btn_holeoffset.setDisable(true);
        }

    }

}
