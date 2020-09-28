package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label labeltitulo;

    public void evento(ActionEvent event){
        int dias = Integer.parseInt(txtedad.getText())*365;
        labeltitulo.setText("Has vivido "+dias+" dias");
    }
}
