package kyh_4_advanced2.examples.reflection;

import kyh_4_advanced2.examples.reflection.data.Team;
import kyh_4_advanced2.examples.reflection.data.User;

public class FieldV4 {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);
        System.out.println("===== before =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);

        FieldUtil.nullFieldToDefault(user);
        FieldUtil.nullFieldToDefault(team);
        System.out.println("===== after =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}