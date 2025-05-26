/*
* File: module-info.java
* Author: Kövesdi Ákos
* Copyright: 2025, Kövesdi Ákos
* Group: Szoft I-N
* Date: 2025-05-26
* Github: https://github.com/Akreez/
* Licenc: MIT
*/
module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.example to javafx.fxml;
    exports com.example;
}
