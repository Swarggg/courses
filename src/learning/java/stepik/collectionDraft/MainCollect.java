package learning.java.stepik.collectionDraft;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toList;

public class MainCollect {

    //data
    static List<User> users = Arrays.asList(
            new User(21, "Vasya", Role.USER),
            new User(31, "Darya", Role.USER),
            new User(1, "Admin", Role.ADMIN),
            new User(123, "Pupik", Role.GUEST),
            new User(234, "Lupik", Role.GUEST),
            new User(23052, "Dupik", Role.GUEST),
            new User(23942, "Mupik", Role.GUEST)
    );

    public  void testOldCollection_Java7() {


        System.out.println("Guests: "+users.size());



        List<User> guestsFromUsers = new LinkedList<>();

        for (User user : users) {

            if (user.getRole() == Role.GUEST) {

                guestsFromUsers.add(user);

            }
        }

    } //testOldCollection closing


    public static void testCollection_Java8 (List<User> users) {
        System.out.println("Results of testCollection_Java8:");
        System.out.println("users size: "+users.size());


        long namesOfGuestsSRM =users.stream()
                .filter(user -> user.getRole()==Role.GUEST)
                // .sorted((obj1, obj2) -> Integer.compare(obj1.getId(), obj2.getId()))
                .map(user -> user.getName())
                //.collect(Collectors.toList())
                .count()
                ;

        System.out.println("namesOfGuests size: "+namesOfGuestsSRM);

        users.stream()
                .filter(u->u.getRole()==Role.USER)
                .map(u->u.getName()+":"+u.getId())
                .forEach(System.out::println);

        System.out.println("List sorted by ID:");
        users.stream()
                //.sorted()
                .map(n->n.getName())
                .forEach(n->System.out.print(n+" "));
        System.out.println();

    }


    public static void main(String[] args) {

         List<String> usersNames = new ArrayList<>();
                usersNames.add("Vasya");
                usersNames.add("Valoba");
                usersNames.add("Lasya");
                usersNames.add("Biba");
                usersNames.add("Boba");
                usersNames.add("Bobb");


        System.out.println(usersNames.size());
        System.out.println("Source usersNames: "+usersNames);

        Stream<String> usNaStrm = usersNames.stream();

        Stream<String> sortedUsNaStrm = usNaStrm.sorted()
                .filter(n->n.contains("o"))
                .filter(n->n.length()==6)
                ;


        System.out.print("Sorted stream: ");
        sortedUsNaStrm.forEach(n-> System.out.print(n + " "));
        System.out.println(" ");

        System.out.println("==========================================================");
        testCollection_Java8(users);

        System.out.println("==========================================================");


    }

}

