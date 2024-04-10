package doitAlgorithm.practice.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03StackTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Q03Stack s = new Q03Stack(100);

            while (true) {
                int menu;

                while (true) {
                    System.out.println();
                    System.out.printf("현재 데이터 개수\nA: %d, B: %d, MAX: %d\n",
                            s.size(Q03Stack.AorB.StackA), s.size(Q03Stack.AorB.StackB), s.getCapacity());
                    System.out.println("메뉴");
                    System.out.println("(1) A 푸시   (2) A 팝   (3) A 피크   (4)  A 덤프   (5)  A 검색   (6)  A 비우기");
                    System.out.println("(7) B 푸시   (8) B 팝   (9) B 피크   (10) B 덤프   (11) B 검색   (12) B 비우기");
                    System.out.println("(0) 프로그램 종료");

                    System.out.print("메뉴를 선택하세요.: ");
                    menu = Integer.parseInt(br.readLine());

                    if (menu >= 0 && menu <= 12)
                        break;
                    else
                        System.out.println("다시 입력하세요.");
                }

                if (menu == 0) break;

                int x, idx;

                switch (menu) {
                    case 1:
                        System.out.print("푸시할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        try {
                            s.push(Q03Stack.AorB.StackA, x);
                        } catch (Q03Stack.OverflowIntStackException e) {
                            System.out.println("스택이 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        try {
                            x = s.pop(Q03Stack.AorB.StackA);
                            System.out.printf("팝한 데이터는 %d입니다.\n", x);
                        } catch (Q03Stack.EmptyIntStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 3:
                        try {
                            x = s.peek(Q03Stack.AorB.StackA);
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (Q03Stack.EmptyIntStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 4:
                        s.dump(Q03Stack.AorB.StackA);
                        break;

                    case 5:
                        System.out.print("검색할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        idx = s.indexOf(Q03Stack.AorB.StackA, x);

                        if (idx == -1)
                            System.out.println("해당 데이터는 존재하지 않습니다.");
                        else
                            System.out.printf("해당 데이터는 꼭대기에서 %d번째에 존재합니다.\n", idx);
                        break;

                    case 6:
                        s.clear(Q03Stack.AorB.StackA);
                        break;

                    case 7:
                        System.out.print("푸시할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        try {
                            s.push(Q03Stack.AorB.StackB, x);
                        } catch (Q03Stack.OverflowIntStackException e) {
                            System.out.println("스택이 가득 찼습니다.");
                        }
                        break;

                    case 8:
                        try {
                            x = s.pop(Q03Stack.AorB.StackB);
                            System.out.printf("팝한 데이터는 %d입니다.\n", x);
                        } catch (Q03Stack.EmptyIntStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 9:
                        try {
                            x = s.peek(Q03Stack.AorB.StackB);
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (Q03Stack.EmptyIntStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 10:
                        s.dump(Q03Stack.AorB.StackB);
                        break;

                    case 11:
                        System.out.print("검색할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        idx = s.indexOf(Q03Stack.AorB.StackB, x);

                        if (idx == -1)
                            System.out.println("해당 데이터는 존재하지 않습니다.");
                        else
                            System.out.printf("해당 데이터는 꼭대기에서 %d번째에 존재합니다.\n", idx);
                        break;

                    case 12:
                        s.clear(Q03Stack.AorB.StackB);
                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
