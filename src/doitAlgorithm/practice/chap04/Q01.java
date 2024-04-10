package doitAlgorithm.practice.chap04;

import doitAlgorithm.chap04.IntStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            IntStack s = new IntStack(64);

            while (true) {
                int menu;

                while (true) {
                    System.out.println(); // 메뉴 구분을 위한 빈 행
                    System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
                    System.out.println("(1) 푸시\n(2) 팝\n(3) 피크\n(4) 덤프\n" +
                            "(5) 비어있는지 확인\n(6) 꽉 차있는지 확인\n(7) 모두 비우기\n(0) 종료");

                    System.out.print("실행할 메뉴를 입력하세요.: ");
                    menu = Integer.parseInt(br.readLine());

                    if (menu >= 0 && menu <= 7)
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

                    case 5:
                        if (s.isEmpty())
                            System.out.println("스택이 비어있습니다.");
                        else
                            System.out.println("스택이 비어있지 않습니다.");
                        break;

                    case 6:
                        if (s.isFull())
                            System.out.println("스택이 가득찼습니다.");
                        else
                            System.out.println("스택이 가득차지 않았습니다.");
                        break;

                    case 7:
                        s.clear();
                        System.out.println("스택을 모두 비웠습니다.");
                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
