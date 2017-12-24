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

public class MC_Controller implements Initializable {

    //ComboBox
    @FXML private ComboBox<String> combo_afgrow;
    @FXML private ComboBox<String> combo_probability;

    //Checkbox
    @FXML private CheckBox check_CSL;
    @FXML private CheckBox check_ac;
    @FXML private CheckBox check_frac;
    @FXML private CheckBox check_pcL;
    @FXML private CheckBox check_pcM;
    @FXML private CheckBox check_holediameter;
    @FXML private CheckBox check_yield;
    @FXML private CheckBox check_ultimate;
    @FXML private CheckBox check_holeoffset;

    //TextBox
    @FXML private TextField txt_CSL;
    @FXML private TextField txt_ac;
    @FXML private TextField txt_frac;
    @FXML private TextField txt_pcL;
    @FXML private TextField txt_pcM;
    @FXML private TextField txt_holediameter;
    @FXML private TextField txt_yield;
    @FXML private TextField txt_ultimate;
    @FXML private TextField txt_holeoffset;

    //Buttons
    @FXML private Button btn_ac;
    @FXML private Button btn_frac;
    @FXML private Button btn_pcL;
    @FXML private Button btn_pcM;
    @FXML private Button btn_holediameter;
    @FXML private Button btn_yield;
    @FXML private Button btn_ultimate;
    @FXML private Button btn_holeoffset;

    ObservableList<String> listAfgrow = FXCollections.observableArrayList("Single Coroner Crack at Hole (1030)", "Double Coroner Crack at Hole (1050)", "Single Edge Coroner Crack (1070)",
                                                                                  "Single Through Crack at Hole (2020)","Single Edge Through Crack (4020)","Single Coroner Crack in Lug (1080)","Single Edge Crack in Lug (2070)");
    ObservableList<String> listProb =   FXCollections.observableArrayList("Initial Crack Size Deterministic", "Initial Crack Size Lognormal (µx,σx)", "Initial Crack Size Weibull (Scale(β),Shape(α))","Initial Crack Size Tabular");


    @FXML
    public void initialize(URL location, ResourceBundle resources){
        combo_probability.setItems(listProb);
        combo_afgrow.setItems(listAfgrow);

    }


    //Handle checkboxes on Master Curve
    public void handleCheck(ActionEvent event){

        if(check_CSL.isSelected()){
            txt_CSL.setDisable(false);
        } else {
            txt_CSL.setDisable(true);
        }

        if(check_ac.isSelected()){
            txt_ac.setDisable(false);
            btn_ac.setDisable(false);
        } else {
            txt_ac.setDisable(true);
            btn_ac.setDisable(true);
        }

        if(check_frac.isSelected()){
            txt_frac.setDisable(false);
            btn_frac.setDisable(false);
        } else {
            txt_frac.setDisable(true);
            btn_frac.setDisable(true);
        }

        if(check_pcL.isSelected()){
            txt_pcL.setDisable(false);
            btn_pcL.setDisable(false);
        } else {
            txt_pcL.setDisable(true);
            btn_pcL.setDisable(true);
        }

        if(check_pcM.isSelected()){
            txt_pcM.setDisable(false);
            btn_pcM.setDisable(false);
        } else {
            txt_pcM.setDisable(true);
            btn_pcM.setDisable(true);
        }

        if(check_holediameter.isSelected()){
            txt_holediameter.setDisable(false);
            btn_holediameter.setDisable(false);
        } else {
            txt_holediameter.setDisable(true);
            btn_holediameter.setDisable(true);
        }

        if(check_yield.isSelected()){
            txt_yield.setDisable(false);
            btn_yield.setDisable(false);
        } else {
            txt_yield.setDisable(true);
            btn_yield.setDisable(true);
        }

        if(check_ultimate.isSelected()){
            txt_ultimate.setDisable(false);
            btn_ultimate.setDisable(false);
        } else {
            txt_ultimate.setDisable(true);
            btn_ultimate.setDisable(true);
        }

        if(check_holeoffset.isSelected()){
            txt_holeoffset.setDisable(false);
            btn_holeoffset.setDisable(false);
        } else {
            txt_holeoffset.setDisable(true);
            btn_holeoffset.setDisable(true);
        }

    }





}
