module zumito_alz.ejercicio1.tabla_multiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens zumito_alz.ejercicio1.tabla_multiplicar to javafx.fxml;
    exports zumito_alz.ejercicio1.tabla_multiplicar;
}
