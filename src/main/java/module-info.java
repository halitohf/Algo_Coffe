module dev.uacm.coffe {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.uacm.coffe to javafx.fxml;
    exports dev.uacm.coffe;
}