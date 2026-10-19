module com.joctan.ejercicio_3_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joctan.ejercicio_3_2 to javafx.fxml;
    exports com.joctan.ejercicio_3_2;
}
