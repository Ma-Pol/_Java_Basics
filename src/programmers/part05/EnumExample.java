package programmers.part05;

public class EnumExample {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;

		gender1 = EnumExample.MALE;
		gender1 = EnumExample.FEMALE;

		gender1 = "boy";

		// 열거 타입 사용
		Gender gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;

//		gender2 = "boy";
	}
}

enum Gender {
	MALE,
	FEMALE;
}