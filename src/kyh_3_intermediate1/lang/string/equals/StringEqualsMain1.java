package kyh_3_intermediate1.lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals() 비교: " + str1.equals(str2));


        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals() 비교: " + str3.equals(str4));
        /*
         * String str3 = "hello"; 와 같이, 문자열 리터럴을 사용하는 경우
         * 자바는 메모리 효율성과 성능 최적화를 위해 문자열 풀(Pool: 자원 저장소)을 사용한다.
         *
         * 자바가 실행되는 시점에, 클래스 내에 문자열 리터럴이 선언되어 있으면
         * 문자열 풀 내부에 String 인스턴스를 '미리' 만들어 둔다.
         *
         * String str3 = "hello"; 를 사용하면 문자열 풀에서 "hello"라는 문자열을 가진
         * String 인스턴스를 찾는다. 그리고 해당 인스턴스의 참조값을 반환한다.
         *
         * String str4 = "hello"; 의 경우, 동일한 "hello" 문자열의 String 인스턴스를
         * 찾고, 해당 인스턴스의 참조값을 반환한다. 즉, str3과 동일한 참조값을 가지게 된다.
         *
         * 이로 인해 같은 문자를 사용하는 경우의 메모리 사용량을 줄일 수 있고,
         * 새로이 인스턴스를 만드는 시간도 줄어들기 때문에 성능 최적화도 가능하다.
         */
    }
}
