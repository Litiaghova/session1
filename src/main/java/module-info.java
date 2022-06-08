module com.arina.session1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.naming;
    requires java.sql;
    requires org.hibernate.orm.core;

    opens com.arina.session1 to javafx.fxml;
    opens com.arina.session1.Controllers to javafx.fxml;
    opens com.arina.session1.ModalCheck to javafx.fxml;
    opens com.arina.session1.Databases.Hibernate;
    opens com.arina.session1.Databases;

    exports com.arina.session1.Databases.Hibernate;
    exports com.arina.session1.Databases;
    exports com.arina.session1;
    exports com.arina.session1.Controllers;
    exports com.arina.session1.ModalCheck;
}