package learning.java.stepik.collectionDraft;

import java.util.ArrayList;
import java.util.List;


public class WhyNot {

    public static class UserIn {
        private int id;
        private String name;
        private Role role;

        UserIn (int id, String name, Role role) {
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


    public static void main(String[] args) {
//listA
        List<UserIn> listA = new ArrayList<>();
        listA.add(new UserIn(23,"Admin",Role.ADMIN));

        UserIn element1 =  listA.get(0);

        String name = listA.get(0).getName();
        System.out.println("name = "+ name);


//listB
        List<String> listB = new ArrayList<>();
        listB.add("fooooorik");

        String firstEl= listB.get(0);

        int length = listB.get(0).length();
        System.out.println("firstEl = "+firstEl+" and length = "+length);

    }


}
