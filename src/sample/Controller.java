package sample;

import conversiones.Conversion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txtedad;
    @FXML Label labeltitulo;

    public void evento(ActionEvent event){
        Conversion td = new Conversion();
        int numero = Integer.parseInt(txtedad.getText());
        String res = td.binario(numero);

        labeltitulo.setText(res);
    }
}
