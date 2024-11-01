package kyh_4_advanced2.reflection;

import kyh_4_advanced2.reflection.data.Team;
import kyh_4_advanced2.reflection.data.User;

public class FieldV4 {
    public static void main(String[] args) throws Exception {
        User user = new User("id1", null, null);
        Team team = new Team("team1", null);
        System.out.println("===== before =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);

        FieldUtil.nullFieldToDefault(user);
        FieldUtil.nullFieldToDefault(team);

        System.out.println("\n===== after =====");
        System.out.println("user = " + user);
        System.out.println("team = " + team);
    }
}