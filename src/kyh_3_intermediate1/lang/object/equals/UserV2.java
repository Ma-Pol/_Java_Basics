package kyh_3_intermediate1.lang.object.equals;

import java.util.Objects;

public class UserV2 {
    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj;
        // String 클래스에서 오버라이딩 한 equals 메서드를 사용함.
        return (this.id).equals(user.id);
    }
    */

    // 변경 - 정확한 equals 구현, IDE 자동 생성
    @Override
    public boolean equals(Object obj) {
        // 인스턴스의 참조값이 동일한 경우, 무조건 true
        if (this == obj)
            return true;

        // 대상이 null 이거나, 서로 같은 클래스가 아닌 경우, 무조건 false
        if (obj == null || getClass() != obj.getClass())
            return false;

        UserV2 userV2 = (UserV2) obj;
        return Objects.equals(id, userV2.id);
        /*
            Objects.equals(a, b);
            => return (a == b) || (a != null && a.equals(b));
        */
    }
}
