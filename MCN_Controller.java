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

public class MCN_Controller implements Initializable {

    //Combobox
    @FXML private ComboBox<String> nas_combo_probability;
    @FXML private ComboBox<String> nas_combo_referencefracture;
    @FXML private ComboBox<String> nas_combo_referenceyielding;

    //Checkbox
    @FXML private CheckBox nas_check_ac;
    @FXML private CheckBox nas_check_frac;
    @FXML private CheckBox nas_check_pcL;
    @FXML private CheckBox nas_check_pcM;
    @FXML private CheckBox nas_check_holediameter;
    @FXML private CheckBox nas_check_yield;
    @FXML private CheckBox nas_check_ultimate;
    @FXML private CheckBox nas_check_holeoffset;

    //TextBox
    @FXML private TextField nas_txt_ac;
    @FXML private TextField nas_txt_frac;
    @FXML private TextField nas_txt_pcL;
    @FXML private TextField nas_txt_pcM;
    @FXML private TextField nas_txt_holediameter;
    @FXML private TextField nas_txt_yield;
    @FXML private TextField nas_txt_ultimate;
    @FXML private TextField nas_txt_holeoffset;

    //Buttons
    @FXML private Button nas_btn_ac;
    @FXML private Button nas_btn_frac;
    @FXML private Button nas_btn_pcL;
    @FXML private Button nas_btn_pcM;
    @FXML private Button nas_btn_holediameter;
    @FXML private Button nas_btn_yield;
    @FXML private Button nas_btn_ultimate;
    @FXML private Button nas_btn_holeoffset;

    ObservableList<String> listProb =   FXCollections.observableArrayList("Initial Crack Size Deterministic", "Initial Crack Size Lognormal (µx,σx)", "Initial Crack Size Weibull (Scale(β),Shape(α))","Initial Crack Size Tabular");
    ObservableList<String> listFrac =   FXCollections.observableArrayList("S0", "S1", "S2", "S3");
    ObservableList<String> listYield =   FXCollections.observableArrayList("Sy", "Sult", "SFlow");

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        nas_combo_probability.setItems(listProb);
        nas_combo_referencefracture.setItems(listFrac);
        nas_combo_referenceyielding.setItems(listYield);
    }

    public void handleCheck(ActionEvent event){
        if(nas_check_ac.isSelected()){
            nas_txt_ac.setDisable(false);
            nas_btn_ac.setDisable(false);
        } else {
            nas_txt_ac.setDisable(true);
            nas_btn_ac.setDisable(true);
        }

        if(nas_check_frac.isSelected()){
            nas_txt_frac.setDisable(false);
            nas_btn_frac.setDisable(false);
        } else {
            nas_txt_frac.setDisable(true);
            nas_btn_frac.setDisable(true);
        }

        if(nas_check_pcL.isSelected()){
            nas_txt_pcL.setDisable(false);
            nas_btn_pcL.setDisable(false);
        } else {
            nas_txt_pcL.setDisable(true);
            nas_btn_pcL.setDisable(true);
        }

        if(nas_check_pcM.isSelected()){
            nas_txt_pcM.setDisable(false);
            nas_btn_pcM.setDisable(false);
        } else {
            nas_txt_pcM.setDisable(true);
            nas_btn_pcM.setDisable(true);
        }

        if(nas_check_holediameter.isSelected()){
            nas_txt_holediameter.setDisable(false);
            nas_btn_holediameter.setDisable(false);
        } else {
            nas_txt_holediameter.setDisable(true);
            nas_btn_holediameter.setDisable(true);
        }

        if(nas_check_yield.isSelected()){
            nas_txt_yield.setDisable(false);
            nas_btn_yield.setDisable(false);
        } else {
            nas_txt_yield.setDisable(true);
            nas_btn_yield.setDisable(true);
        }

        if(nas_check_ultimate.isSelected()){
            nas_txt_ultimate.setDisable(false);
            nas_btn_ultimate.setDisable(false);
        } else {
            nas_txt_ultimate.setDisable(true);
            nas_btn_ultimate.setDisable(true);
        }

        if(nas_check_holeoffset.isSelected()){
            nas_txt_holeoffset.setDisable(false);
            nas_btn_holeoffset.setDisable(false);
        } else {
            nas_txt_holeoffset.setDisable(true);
            nas_btn_holeoffset.setDisable(true);
        }

    }

}
