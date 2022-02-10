package learning.java.stepik.collectionDraft;

public class User {
    private int id;
    private String name;
    private Role role;

    User (int id, String name, Role role) {
    }

    public int getId() {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public Role getRole () {
        return this.role;
    }

}
