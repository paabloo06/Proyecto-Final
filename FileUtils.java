package controller;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    // create file
    public static void createFileIfNotExists(String file) {
        try {
            File f = new File(file);
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // write object
    public static void writeToFile(String file, Object object) {
        createFileIfNotExists(file);
        try {
            FileOutputStream fs = new FileOutputStream(file);
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(object);
            os.close();
            fs.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // read object
    public static Object readFromFile(String file) {
        createFileIfNotExists(file);
        Object object = null;
        try {
            FileInputStream fs = new FileInputStream(file);
            ObjectInputStream os = new ObjectInputStream(fs);
            object = os.readObject();
            os.close();
            fs.close();
        } catch (Exception e) {
            // si el archivo está vacío, devuelve un arraylist vacío
            object = new ArrayList<>();
        }
        return object;
    }
}
