package learning.java.stepik.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainToSerializ {

    public static void main(String[] args) throws IOException {



    String fileForSaveClass = "src\\learning\\java\\stepik\\serialization\\SavedClass";

    int[] accounts = {123, 456, 7890};
    String[] cities = {"SPB", "MSC", "NYC"};

    SerializClass sc = new SerializClass(accounts, cities);

        int[] accountsrestore= sc.getAccounts();
        System.out.println("acc rest="+accountsrestore[2]);

    FileOutputStream fos = new FileOutputStream(fileForSaveClass);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    //save object to file
    oos.writeObject(sc);

    oos.close();

    } //main close

}// MainToSerializ close
