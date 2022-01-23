package learning.java.stepik.serialization;

import java.io.*;

public class MainToDeserializ {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


    String fileForLoadClass = "src\\learning\\java\\stepik\\serialization\\SavedClass";

    FileInputStream fis = new FileInputStream(fileForLoadClass);

        ObjectInputStream ois = new ObjectInputStream(fis);

        SerializClass deSerialisObj = (SerializClass) ois.readObject();

        int[] desAccounts = deSerialisObj.getAccounts();
        System.out.println("desAccounts[2]="+desAccounts[2]);

        byte[] b= {23, 23,23};
        InputStream is = new ByteArrayInputStream(b);


    }

}
