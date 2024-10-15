package kyh_4_advanced2.examples.reflection;

import reflection.data.Team;
import reflection.data.User;

public class FieldV4 {

    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);
        System.out.println("===== before =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);

        reflection.FieldUtil.nullFieldToDefault(user);
        reflection.FieldUtil.nullFieldToDefault(team);
        System.out.println("===== after =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}
