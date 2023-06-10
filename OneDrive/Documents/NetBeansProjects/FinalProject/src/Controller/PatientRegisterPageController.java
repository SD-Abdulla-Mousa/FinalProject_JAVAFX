/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author abdul
 */
public class PatientRegisterPageController implements Initializable {

    @FXML
    private TextField usernameTF;
    @FXML
    private TextField passTF;
    @FXML
    private TextField EmailTF;
    @FXML
    private TextField IDTF;
    @FXML
    private TextField FNTF;
    @FXML
    private TextField LNTF;
    @FXML
    private TextField phoneTF;
    @FXML
    private RadioButton maler;
    @FXML
    private RadioButton femlaeR;
    @FXML
    private RadioButton adminR;
    @FXML
    private RadioButton PatientR;
    @FXML
    private Button registerButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changeSceneToLoginPage(ActionEvent event) {
    }
    
}
