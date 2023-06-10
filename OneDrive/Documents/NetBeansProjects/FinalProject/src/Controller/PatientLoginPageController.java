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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author abdul
 */
public class PatientLoginPageController implements Initializable {

    @FXML
    private Button submitButton;
    @FXML
    private Button regsterButton;
    @FXML
    private TextField patientusernameTf;
    @FXML
    private TextField passwordTf;
    @FXML
    private Button ADMINLOGINBUTTON;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changeSceneToPatientDashboard(ActionEvent event) {
        
    }

    @FXML
    private void changeSceneToRegisterationPage(ActionEvent event) {
        
    }

    @FXML
    private void ChangeSceneToAdminLoginPage(ActionEvent event) {
    }
    
}
