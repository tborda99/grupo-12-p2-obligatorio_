import Entities.Reader;
import Interfaces.Reportes;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        Reader reader = new Reader();
        reader.readCSV("/Users/tomasbordaberry/Desktop/Desktop/UM/S9 (Last Dance)/Programacion II/Intellij/Obligatorio/grupo-12-p2-main/src/Resources/f1_dataset_test.csv");

    }
}