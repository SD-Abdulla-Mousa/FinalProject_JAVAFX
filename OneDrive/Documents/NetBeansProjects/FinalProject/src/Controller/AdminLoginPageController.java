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
public class AdminLoginPageController implements Initializable {

    @FXML
    private Button RegisterButton;
    @FXML
    private TextField usernameTF;
    @FXML
    private Button submitButton;
    @FXML
    private TextField passwordTF;
    @FXML
    private Button CancelButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ChangeSceneToRegisterPage(ActionEvent event) {
    }

    @FXML
    private void ChangeSceneToAdminDashboard(ActionEvent event) {
    }

    @FXML
    private void ChangeSceneToPatientLoginPage(ActionEvent event) {
    }
    
}
