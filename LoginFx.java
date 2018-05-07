package minor.group;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginFx extends Application {

    @Override
    public void start(Stage Stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/minor/group/Login.fxml"));
        Scene scene = new Scene(root);
        Stage.setScene(scene);
        Stage.setTitle(" Welcome to CHAT APPLICATION ");
        Stage.show();

    }

}
