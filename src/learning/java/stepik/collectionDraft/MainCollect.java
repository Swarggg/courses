package learning.java.stepik.collectionDraft;

import java.util.*;

public class MainCollect {

    public  void testOldCollection_Java7() {
        //data
        Collection<User> users = Arrays.asList(
                new User(21, "Vasya", Role.USER),
                new User(1, "Admin", Role.ADMIN),
                new User(123, "Pupik", Role.GUEST),
                new User(234, "Lupik", Role.GUEST),
                new User(2342, "Dupik", Role.GUEST)
        );

        System.out.println("Guests: "+users.size());



        List<User> guestsFromUsers = new LinkedList<>();

        for (User user : users) {

            if (user.getRole() == Role.GUEST) {

                guestsFromUsers.add(user);

            }
        }

        Collections.sort (guestsFromUsers, new Comparator<User>() {
            @Override
            public int compare (User u1, User u2) {
                return Long.compare(u2.getId(), u1.getId());
            }
        });


       /* //map - применить ко всем
        List <String> names = new LinkedList<>();
        for (User user: guestsFromUsers) {
            names.add(user.getName());
        }
*/

    } //testOldCollection closing

    public static void main(String[] args) {

        MainCollect mc = new MainCollect();
        mc.testOldCollection_Java7();

    }

}

