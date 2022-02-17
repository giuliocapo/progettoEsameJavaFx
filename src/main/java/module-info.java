module com.example.progettoesamejavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.progettoesamejavafx to javafx.fxml;
    exports com.example.progettoesamejavafx;
}