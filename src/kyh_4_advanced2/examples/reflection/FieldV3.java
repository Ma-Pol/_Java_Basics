package kyh_4_advanced2.examples.reflection;

import kyh_4_advanced2.examples.reflection.data.Team;
import kyh_4_advanced2.examples.reflection.data.User;

public class FieldV3 {

    public static void main(String[] args) {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);
        System.out.println("===== before =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);

        if (user.getId() == null) {
            user.setId("");
        }
        if (user.getName() == null) {
            user.setName("");
        }
        if (user.getAge() == null) {
            user.setAge(0);
        }

        if (team.getId() == null) {
            team.setId("");
        }
        if (team.getName() == null) {
            team.setName("");
        }

        System.out.println("===== after =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}
