package programmers.part05;

public class StringClassExample {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello"; // str1과 str2는 같은 객체를 참조하고 있음

		String str3 = new String("hello");
		String str4 = new String("hello"); // str3과 str4는 다른 객체를 참조하고 있음

		// == 연산자는 참조하는 객체의 주소값을 비교함
		if (str1 == str2) {
			System.out.println("str1과 str2는 같은 객체를 참조하고 있음");
		} else {
			System.out.println("str1과 str2는 다른 객체를 참조하고 있음");
		}

		if (str3 == str4) {
			System.out.println("str3과 str4는 같은 객체를 참조하고 있음");
		} else {
			System.out.println("str3과 str4는 다른 객체를 참조하고 있음");
		}

		System.out.println();

		// equals() 메소드는 참조하는 객체의 문자열을 비교함
		if (str1.equals(str2)) {
			System.out.println("str1과 str2는 같은 문자열을 가지고 있음");
		} else {
			System.out.println("str1과 str2는 다른 문자열을 가지고 있음");
		}

		if (str3.equals(str4)) {
			System.out.println("str3과 str4는 같은 문자열을 가지고 있음");
		} else {
			System.out.println("str3과 str4는 다른 문자열을 가지고 있음");
		}


		// String 클래스의 메소드
		String str5 = "hello";
		String str6 = "world";
		String str7 = "hello";

		System.out.println("str5.length() : " + str5.length()); // 문자열의 길이를 반환
		System.out.println("str5.concat(str6) : " + str5.concat(str6)); // 문자열을 연결
		System.out.println("str5 + str6 : " + str5 + str6); // 문자열을 연결
		System.out.println("str5.charAt(1) : " + str5.charAt(1)); // 문자열에서 해당 인덱스의 문자를 반환
		System.out.println("str5.indexOf(\"e\") : " + str5.indexOf("e")); // 문자열에서 해당 문자의 인덱스를 반환
		System.out.println("str5.indexOf(\"a\") : " + str5.indexOf("a")); // 문자열에서 해당 문자가 없으면 -1을 반환
		System.out.println("str5.substring(3) : " + str5.substring(3)); // 문자열에서 해당 인덱스부터 끝까지의 문자열을 반환
		System.out.println("str5.substring(1, 3) : " + str5.substring(1, 3)); // 문자열에서 해당 인덱스부터 해당 인덱스까지의 문자열을 반환
		System.out.println("str5.replace(\"l\", \"L\") : " + str5.replace("l", "L")); // 문자열에서 해당 문자를 다른 문자로 변경
		System.out.println("str5.replace(\"ll\", \"LL\") : " + str5.replace("ll", "LL")); // 문자열에서 해당 문자열을 다른 문자열로 변경
		System.out.println("str5.replaceAll(\"ll\", \"LL\") : " + str5.replaceAll("ll", "LL")); // 문자열에서 해당 문자열을 다른 문자열로 변경
		System.out.println("str5.replaceFirst(\"ll\", \"LL\") : " + str5.replaceFirst("ll", "LL")); // 문자열에서 해당 문자열을 다른 문자열로 변경
		System.out.println("str5.toUpperCase() : " + str5.toUpperCase()); // 문자열을 대문자로 변경
		System.out.println("str5.toLowerCase() : " + str5.toLowerCase()); // 문자열을 소문자로 변경
		System.out.println("str5.equals(str7) : " + str5.equals(str7)); // 문자열을 비교
		System.out.println("str5.equalsIgnoreCase(str7) : " + str5.equalsIgnoreCase(str7)); // 문자열을 비교(대소문자 구분 안함)
		System.out.println("str5.compareTo(str7) : " + str5.compareTo(str7)); // 문자열을 비교(같으면 0, 다르면 양수 또는 음수)
		System.out.println("str5.compareToIgnoreCase(str7) : " + str5.compareToIgnoreCase(str7)); // 문자열을 비교(대소문자 구분 안함)
		System.out.println("str5.startsWith(\"he\") : " + str5.startsWith("he")); // 문자열이 해당 문자열로 시작하는지 확인
		System.out.println("str5.endsWith(\"lo\") : " + str5.endsWith("lo")); // 문자열이 해당 문자열로 끝나는지 확인
		System.out.println("str5.contains(\"el\") : " + str5.contains("el")); // 문자열이 해당 문자열을 포함하는지 확인
		System.out.println("str5.isEmpty() : " + str5.isEmpty()); // 문자열이 비어있는지 확인
		System.out.println("str5.trim() : " + str5.trim()); // 문자열의 앞뒤 공백을 제거
		System.out.println("str5.split(\"l\") : " + str5.split("l")); // 문자열을 해당 문자로 분리하여 배열로 반환
		System.out.println("str5.split(\"l\", 2) : " + str5.split("l", 2)); // 문자열을 해당 문자로 분리하여 배열로 반환(분리할 개수 지정)
		System.out.println("str5.toCharArray() : " + str5.toCharArray()); // 문자열을 문자 배열로 반환
		System.out.println("str5.getBytes() : " + str5.getBytes()); // 문자열을 바이트 배열로 반환
		System.out.println("str5.valueOf(1) : " + str5.valueOf(1)); // 문자열로 변환하여 반환
		System.out.println("str5.valueOf(1.1) : " + str5.valueOf(1.1)); // 문자열로 변환하여 반환
		System.out.println("str5.valueOf(true) : " + str5.valueOf(true)); // 문자열로 변환하여 반환
		System.out.println("str5.valueOf(new char[]{'a', 'b', 'c'}) : " + str5.valueOf(new char[]{'a', 'b', 'c'})); // 문자열로 변환하여 반환
		System.out.println("str5.valueOf(new char[]{'a', 'b', 'c'}, 1, 2) : " + str5.valueOf(new char[]{'a', 'b', 'c'}, 1, 2)); // 문자열로 변환하여 반환
	}
}
