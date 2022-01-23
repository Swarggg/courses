package learning.java.stepik.serialization;

import java.io.Serializable;

public class SerializClass implements Serializable {

    private int[] accounts;
    private String[] cities;

    public SerializClass (int[] accounts, String[] cities) {
        this.accounts=accounts;
        this.cities=cities;
    }

    public int[] getAccounts() {
        return accounts;
    }

    public String[] getCities () {
        return cities;
    }


}
