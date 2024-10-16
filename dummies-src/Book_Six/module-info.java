//module Book_Six {
//    requires javafx.controls;
//    requires javafx.fxml;
//
//    exports Chapter_1;
//    opens Chapter_1 to javafx.fxml;
//    exports Chapter_2;
//    opens Chapter_2 to javafx.fxml;
//    exports Chapter_3;
//    opens Chapter_3 to javafx.fxml;
//    exports Chapter_4;
//    opens Chapter_4 to javafx.fxml;
//}

module Book_Six {
        requires javafx.controls; // Add other JavaFX modules if needed
        requires javafx.fxml;
        exports Chapter_1;
        exports Chapter_2;
        exports Chapter_3;
        exports Chapter_4;
}

