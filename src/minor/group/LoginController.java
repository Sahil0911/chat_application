/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minor.group;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bhatta
 */
public class LoginController implements Initializable {

    static String st, pw;
    static int r[] = new int[7];
    static String mainStr[] = new String[7];
    @FXML
    private Label l1, l2, l3;
    @FXML
    private TextField username, username_signup, phoneNumber_signup, email_signup;
    @FXML
    private PasswordField password, password_signup;
    @FXML
    private Label labelusername, labelpassword, labelusername_signup, labelpassword_signup;

    @FXML
    private void chat(ActionEvent event) throws Exception {
        ClientServer cl = new ClientServer();
        cl.letschat();
    }

    @FXML
    private void loginBtn(ActionEvent event) throws Exception {
//        sc = username.getText();
        if (username.getText().equals("")) {
            labelusername.setText(" Enter valid name!! ");
        } else {
            labelusername.setText("");
        }
        if (username.getText().equals("")) {
            labelpassword.setText(" Enter valid password !! ");
        } else {
            labelpassword.setText("");
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/minorproject", "root ", "");

            String select_sql = "Select user_name from minorproject.tbl_userdescrip where user_name='" + username.getText() + "'and user_password='" + password.getText() + "'";
            PreparedStatement stmt_select = conn.prepareStatement(select_sql);

            if (((stmt_select.executeQuery().next()) == true)) {                //            For valid username entered in database
                Parent pp = FXMLLoader.load(getClass().getResource("/minor/group/UserPage.fxml"));
                Scene ss = new Scene(pp);
                Stage stage = new Stage();
                stage.setScene(ss);
                st = username.getText();
                pw = password.getText();
//              String  sc= username.getText();
                stage.setTitle("Welcome to CHAT APPLICATION  '" + username.getText() + "'");

                stage.show();
//                System.out.println(sc);
                /*
                username.setText("");
                password.setText("");
                 */
                ((Node) (event.getSource())).getScene().getWindow().hide();

            } else {
                labelusername.setText(" Invalid Username  ");
            }
            stmt_select.executeQuery().beforeFirst();
        } catch (ClassNotFoundException | SQLException ce) {
            ce.printStackTrace();

        }

    }

    @FXML
    private void go_chat(ActionEvent event) throws Exception {
        ClientServer cl = new ClientServer();
        ClientServer.letschat();
    }

    @FXML
    private void go_findfriend(ActionEvent event) throws Exception {

        survey sv = new survey(st, pw);

        sv.findafriend();

    }

    @FXML
    private void SignUpBtn(ActionEvent event) throws Exception {

        Parent p = FXMLLoader.load(getClass().getResource("/minor/group/SignUp.fxml"));
        Scene s = new Scene(p);
        Stage stage1 = new Stage();
        stage1.setScene(s);
        stage1.setTitle("Sign Up to CHAT APLLICATION  ");
        stage1.show();
        ((Node) (event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    private void go_home(ActionEvent event) throws Exception {
        LoginFx loginfx_object = new LoginFx();
        Stage Stage = new Stage();
        loginfx_object.start(Stage);
        ((Node) (event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    private void ConfirmSignUp(ActionEvent event) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/minorproject", "root ", "");
            String select_sql = "Select user_name from minorproject.tbl_userlogin where user_name='" + username_signup.getText() + "'";

            String insert_sql = "Insert into minorproject.tbl_userdescrip  VALUES('" + username_signup.getText() + "','" + password_signup.getText() + "','abcab')";
            String insert_sql1 = "Insert into minorproject.tbl_useropt  VALUES('" + phoneNumber_signup.getText() + "','" + email_signup.getText() + "','" + username_signup.getText() + "')";
            st = username_signup.getText();
            pw = password_signup.getText();
            PreparedStatement stmt_select = conn.prepareStatement(select_sql);
            PreparedStatement stmt_insert1 = conn.prepareStatement(insert_sql1);
            if (stmt_insert1.executeUpdate() > 0) {
                System.out.println("Inserted in useropt ");
            }
            if (((stmt_select.executeQuery().next()) == false)) { //            For unique username entry in SignUp
                PreparedStatement stmt_insert = conn.prepareStatement(insert_sql);

                if (stmt_insert.executeUpdate() > 0) {

                    labelusername_signup.setText("Signed Up!! ");
                    survey survey_object = new survey(st, pw);
                    survey_object.setVisible(true);

                } else {

                    labelusername_signup.setText("Username already exists. Try different username!! ");
                    labelpassword_signup.setText(" ");

                }
                stmt_select.executeQuery().beforeFirst();

            } else {

                labelusername_signup.setText("Username already exists. Try different username!! ");
                labelpassword_signup.setText(" ");

            }

        } catch (ClassNotFoundException | SQLException ce) {
            ce.printStackTrace();

        }

    }

    @FXML
    private Label l0, l4;

    public void recommend(int[] c, String[] mainSt) throws Exception {
        Parent pxx = FXMLLoader.load(getClass().getResource("/minor/group/r1.fxml"));
        Scene sxx = new Scene(pxx);
        Stage stagexx = new Stage();
        stagexx.setScene(sxx);
        stagexx.setTitle(" Click Enter to get Recommendation ");
        stagexx.show();

        for (int k = 0; k < 4; k++) {
            System.out.println(c[k] + " ..... " + mainSt[k]);
            r[k] = c[k];
            mainStr[k] = mainSt[k];

        }

    }

    @FXML
    private void refresh(ActionEvent event) throws Exception {
        l0.setText("Recommended friends are: ");
        for (int k = 0; k < 4; k++) {
            System.out.println(r[k] + " ..... " + mainStr[k]);
            if (r[k] != 0) {

                if (k == 0) {
                    l1.setText(mainStr[k]);
                }
                if (k == 1) {
                    l2.setText(mainStr[k]);
                }
                if (k == 2) {
                    l3.setText(mainStr[k]);
                }
                if (k == 3) {
                    l4.setText(mainStr[k]);
                }

            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
