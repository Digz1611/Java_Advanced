module Book_Six {
    requires javafx.controls;
    requires javafx.fxml;

    exports Book_Six.Chapter_1;
    opens Book_Six.Chapter_1 to javafx.fxml;
    exports Book_Six.Chapter_2;
    opens Book_Six.Chapter_2 to javafx.fxml;
    exports Book_Six.Chapter_3;
    opens Book_Six.Chapter_3 to javafx.fxml;
    exports Book_Six.Chapter_4;
    opens Book_Six.Chapter_4 to javafx.fxml;
}



