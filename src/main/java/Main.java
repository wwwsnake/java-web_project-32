import db.DBServices;
import entity.Discipline;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBServices services = new DBServices();
        services.createDiscipline("Java программирование");

    }
}
