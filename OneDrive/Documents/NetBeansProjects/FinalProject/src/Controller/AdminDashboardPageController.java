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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author abdul
 */
public class AdminDashboardPageController implements Initializable {

    @FXML
    private Button ShowRegisteredPatient;
    @FXML
    private Button SearchByFNAME;
    @FXML
    private TextField FIrstNAMETF1;
    @FXML
    private Button CreatePatient;
    @FXML
    private Button UpdatePatient;
    @FXML
    private Button DeletePatient;
    @FXML
    private TableView<?> PatientTableView;
    @FXML
    private TableColumn<?, ?> ID_Column;
    @FXML
    private TableColumn<?, ?> usernameColumn;
    @FXML
    private TableColumn<?, ?> FnameColumn;
    @FXML
    private TableColumn<?, ?> LnameColumn;
    @FXML
    private TableColumn<?, ?> passwordColumn;
    @FXML
    private TableColumn<?, ?> emailColumn;
    @FXML
    private TableColumn<?, ?> phoneColumn;
    @FXML
    private TableColumn<?, ?> ageColumn;
    @FXML
    private TableColumn<?, ?> genderColumn;
    @FXML
    private TableColumn<?, ?> RoleColumn;
    @FXML
    private Button ShowFreeAPPointments;
    @FXML
    private Button SearchAppointmentByFNAME;
    @FXML
    private TextField FirstNameTF2;
    @FXML
    private Button CreateAppointment;
    @FXML
    private Button updateAppointment;
    @FXML
    private Button DeleteAppointment;
    @FXML
    private TableView<?> FreeAppointmentsTableView;
    @FXML
    private TableColumn<?, ?> IDColumn;
    @FXML
    private TableColumn<?, ?> APDDATEColumn;
    @FXML
    private TableColumn<?, ?> APDDColumn;
    @FXML
    private TableColumn<?, ?> APDTColumn;
    @FXML
    private TableColumn<?, ?> statusColumn;
    @FXML
    private Button ShowAllBookedAppointment;
    @FXML
    private TableView<?> BookedAppontmentsTableView;
    @FXML
    private TableColumn<?, ?> IDB_Column;
    @FXML
    private TableColumn<?, ?> Appointment_IDColumn;
    @FXML
    private TableColumn<?, ?> User_IDColumn;
    @FXML
    private TableColumn<?, ?> StatusColumn;
    @FXML
    private TableColumn<?, ?> Doctor_CommentColumn;
    @FXML
    private Button logoutButton;
    @FXML
    private Button WriteCommentButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ShowREGISTEREDPATIENT(ActionEvent event) {
    }

    @FXML
    private void SearchByFirstNAME(ActionEvent event) {
    }

    @FXML
    private void CreateNEWPatient(ActionEvent event) {
    }

    @FXML
    private void UpdateExistPAtient(ActionEvent event) {
    }

    @FXML
    private void DeleteExistPatient(ActionEvent event) {
    }

    @FXML
    private void ShowAllFreeAPPoinmtnems(ActionEvent event) {
    }

    @FXML
    private void SearchAppointmentByFirstname(ActionEvent event) {
    }

    @FXML
    private void CreateNewAppoinment(ActionEvent event) {
    }

    @FXML
    private void UpdatenewAppointment(ActionEvent event) {
    }

    @FXML
    private void DeleteExistAppointment(ActionEvent event) {
    }

    @FXML
    private void ShowBookedAppointments(ActionEvent event) {
    }

    @FXML
    private void LogOutFunction(ActionEvent event) {
    }

    @FXML
    private void WriteCommentFunction(ActionEvent event) {
    }
    
}
