package zumito_alz.ejercicio1.tabla_multiplicar;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML TextField txtNumero;
    @FXML TextArea txtAResultado;
    
    @FXML
    private void btnCalcular_click() throws IOException {
        String res = "";
        int numero = Integer.parseInt(txtNumero.getText());
        int mult;
        
        for (int i = 1; i <= 10; i++) {
            mult = numero * i;
            res += numero + "x" + i + "=" + mult + "\n";
            
        }
        txtAResultado.setText(res);
        
    }
    
    @FXML
    private void btnLimpiar_click() throws IOException {
        txtNumero.setText("");
        txtAResultado.setText("");
    }
}
