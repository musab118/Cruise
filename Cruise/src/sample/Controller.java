package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class Controller implements Initializable {

    @FXML
    private Label lbl1,lbl2;

    private  double Room,Activities,Dis,Act1,Act2,Act3,Act4,Act5,Act6,Act7,Act8,Act9,Act10,Act11;

    @FXML
    private CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11;

    @FXML
    private ToggleButton r1,r2,r3,r4;

    @FXML
    private Button NoB,Cal,YesB;


    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;


        if(event.getSource()==YesB)
        {
            stage = (Stage) YesB.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("Selection.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource()==Cal)
        {
            if(c11.isSelected()== true)
            {Activities = (Act1+Act2+Act3+Act4+Act5+Act6+Act7+Act8+Act9+Act10);
            Dis= (Room-(Room*.10));
                AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Total Cost",
                        "Your Total cost is: $"+Dis+" with VIP discount applied and $"+Activities+" per day");
                return; }
            else{
                Activities = Act1+Act2+Act3+Act4+Act5+Act6+Act7+Act8+Act9+Act10;
                AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Total Cost",
                        "Your Total cost is: $"+Room+" with $"+Activities+" per day");
                return;}

        }

        if(event.getSource()==NoB)
        {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Call to our Agency!",
                    "This on-line form will help you to buy ticket for family of two people only");
            return;
        }
    }

    @FXML
    private void radioAction (ActionEvent event) throws Exception {

        if(event.getSource()==r1)
        {
            r2.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);

            Room =765;

        }
        if(event.getSource()==r2)
        {
            r1.setSelected(false);
            r3.setSelected(false);
            r4.setSelected(false);
            Room =810;
        }
        if(event.getSource()==r3)
        {
            r2.setSelected(false);
            r1.setSelected(false);
            r4.setSelected(false);
            Room =1090;
        }
        if(event.getSource()==r4)
        {
            r2.setSelected(false);
            r3.setSelected(false);
            r1.setSelected(false);
            Room =1560;
        }
    }

    @FXML
    private void checkAction (ActionEvent event) throws Exception {
        if(c1.isSelected()== true) { Act1 = 25; }
        else{Act1 =0;}
        if(c2.isSelected()== true) { Act2 = 100; }
        else{Act2 =0;}
        if(c3.isSelected()== true) { Act3 = 168; }
        else{Act3 =0;}
        if(c4.isSelected()== true) { Act4 = 10; }
        else{Act4 =0;}
        if(c5.isSelected()== true) { Act5 = 30; }
        else{Act5 =0;}
        if(c6.isSelected()== true) { Act6 = 10; }
        else{Act6 =0;}
        if(c7.isSelected()== true) { Act7 = 20; }
        else{Act7 =0;}
        if(c8.isSelected()== true) { Act8 = 20; }
        else{Act8 =0;}
        if(c9.isSelected()== true) { Act9 = 10; }
        else{Act10 =0;}
        if(c10.isSelected()== true) { Act10 = 10; }
        else{Act10 =0;}

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}