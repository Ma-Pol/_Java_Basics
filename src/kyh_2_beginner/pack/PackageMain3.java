package kyh_2_beginner.pack;

import kyh_2_beginner.examples.pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        // 이름이 같으면 하나만 임포트 가능. 나머지는 직접 경로 입력 필요
        kyh_2_beginner.examples.pack.b.User userB = new kyh_2_beginner.examples.pack.b.User();
    }
}
