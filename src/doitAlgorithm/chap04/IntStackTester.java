package doitAlgorithm.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntStackTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            IntStack s = new IntStack(64);

            while (true) {
                int menu;

                while (true) {
                    System.out.println(); // 메뉴 구분을 위한 빈 행
                    System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
                    System.out.print("(1) 푸시   (2) 팝   (3) 피크   (4) 덤프   (0) 종료: ");

                    menu = Integer.parseInt(br.readLine());

                    if (menu >= 0 && menu <= 4)
                        break;
                    else
                        System.out.println("다시 입력하세요.");
                }

                if (menu == 0) break;

                int x;

                switch (menu) {
                    case 1:
                        System.out.print("푸시할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        try {
                            s.push(x);
                        } catch (IntStack.OverflowIntStackException e) {
                            System.out.println("스택이 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        try {
                            x = s.pop();
                            System.out.printf("팝한 데이터는 %d입니다.\n", x);
                        } catch (IntStack.EmptyIntStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 3:
                        try {
                            x = s.peek();
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (IntStack.EmptyIntStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 4:
                        s.dump();
                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
