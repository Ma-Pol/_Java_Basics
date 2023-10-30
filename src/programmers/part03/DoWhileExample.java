package programmers.part03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = 0;

		do {
			value = Integer.parseInt(br.readLine());
			System.out.println("입력받은 값: " + value);
		} while (value != 10);

		System.out.print("반복문 종료");
	}
}
