package endava;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {

    private static boolean conditionForActiveStatus(User u){
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);
        if(u.getStatus().equals(Status.NEW) && u.getLocalDateTime().isBefore(yesterday)){
            return true;
        }

        return false;
    }
    private static boolean conditionForBonusTask(User u){
        LocalDateTime oneMonthAgo = LocalDateTime.now().minusMonths(1);
        if(u.getStatus().equals(Status.INACTIVE) && u.getLocalDateTime().isBefore(oneMonthAgo)){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Rick", "Martin", 22, "@mail.ru", Status.NEW,
                LocalDateTime.now().minusDays(3) ));
        users.add(new User("Ion", "Martin", 21, "@mail.ru", Status.NEW,
                LocalDateTime.of(2020,9, 10, 0, 0 ) ));
        users.add(new User("Tom", "Martin", 33, "@mail.ru", Status.NEW,
                LocalDateTime.now() ));
        users.add(new User("Nicu", "Martin", 2, "@mail.ru", Status.NEW,
                LocalDateTime.now().minusDays(5) ));
        users.add(new User("Eugen", "Giku", 2, "@mail.ru", Status.BLOCKED,
                LocalDateTime.now().minusDays(10) ));

        users.add(new User("Cristi", "Giku", 2, "@mail.ru", Status.INACTIVE,
                LocalDateTime.now().minusMonths(3) ));
        users.add(new User("Alex", "Giku", 2, "@mail.ru", Status.INACTIVE,
                LocalDateTime.now().minusYears(1) ));
        users.add(new User("Dorel", "Giku", 2, "@mail.ru", Status.INACTIVE,
                LocalDateTime.now().minusDays(100) ));
        users.add(new User("Iulian", "Giku", 2, "@mail.ru", Status.INACTIVE,
                LocalDateTime.now().minusDays(10) ));

        for(int i=0; i<users.size(); i++){
            if(conditionForActiveStatus(users.get(i))){
                users.get(i).setStatus(Status.ACTIVE);
                System.out.println(String.format("%s set active.", users.get(i).toString()));
            }
        }

        System.out.println("\n\n");

        for(int i=0; i< users.size(); i++){
            if(conditionForBonusTask(users.get(i))){
                users.get(i).setStatus(Status.BLOCKED);
                System.out.println(String.format("%s set blocked.", users.get(i).toString()));

            }
        }




    }
}
