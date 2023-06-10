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
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author abdul
 */
public class PatientDashboardPageController implements Initializable {

    @FXML
    private Button showFreeAppointmentsB;
    @FXML
    private Button BookingFreeAppointemntsB;
    @FXML
    private Button showFinishedBookedAppointmentsB;
    @FXML
    private Button logoutButton;
    @FXML
    private TableColumn<?, ?> ID_column;
    @FXML
    private TableColumn<?, ?> Appointment_Date_Column;
    @FXML
    private TableColumn<?, ?> Appointment_Day_column;
    @FXML
    private TableColumn<?, ?> Appointment_Time_Column;
    @FXML
    private TableColumn<?, ?> Status_column;
    @FXML
    private TableColumn<?, ?> ID2_column;
    @FXML
    private TableColumn<?, ?> Appointment_ID_Column;
    @FXML
    private TableColumn<?, ?> User_ID_Column;
    @FXML
    private TableColumn<?, ?> Status_Column;
    @FXML
    private TableColumn<?, ?> Doctor_Comment_Column;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ShowAllFreeAppointments(ActionEvent event) {
    }

    @FXML
    private void BookingFreeAppointments(ActionEvent event) {
    }

    @FXML
    private void ShowFinishedBookedAppointments(ActionEvent event) {
    }

    @FXML
    private void ChangeSceneToPatientLoginPage(ActionEvent event) {
    }
    
}
