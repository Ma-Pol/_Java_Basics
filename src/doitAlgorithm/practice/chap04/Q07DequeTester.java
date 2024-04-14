package doitAlgorithm.practice.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07DequeTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Q07Deque deque = new Q07Deque(64);

            while (true) {
                int menu;

                while (true) {
                    System.out.println();
                    System.out.printf("현재 데이터 개수: %d / %d\n", deque.size(), deque.getCapacity());
                    System.out.print("(1) 추가(앞)   (2) 추가(뒤)   (3) 제거(앞)   (4) 제거(뒤)\n" +
                            "(5) 피크(앞)   (6) 피크(뒤)   (7) 덤프   (8) 검색   (0) 종료: ");

                    menu = Integer.parseInt(br.readLine());

                    if (menu >= 0 && menu <= 8)
                        break;
                    else
                        System.out.println("다시 입력하세요.");
                }

                if (menu == 0) break;

                int x;

                switch (menu) {
                    case 1:
                        System.out.print("데이터: ");
                        x = Integer.parseInt(br.readLine());

                        try {
                            deque.addFirst(x);
                        } catch (Q07Deque.OverflowDequeException e) {
                            System.out.println("덱이 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        System.out.print("데이터: ");
                        x = Integer.parseInt(br.readLine());

                        try {
                            deque.addLast(x);
                        } catch (Q07Deque.OverflowDequeException e) {
                            System.out.println("덱이 가득 찼습니다.");
                        }
                        break;

                    case 3:
                        try {
                            x = deque.offerFirst();
                            System.out.printf("제거한 데이터는 %d입니다.\n", x);
                        } catch (Q07Deque.EmptyDequeException e) {
                            System.out.println("덱이 비어 있습니다.");
                        }
                        break;

                    case 4:
                        try {
                            x = deque.offerLast();
                            System.out.printf("제거한 데이터는 %d입니다.\n", x);
                        } catch (Q07Deque.EmptyDequeException e) {
                            System.out.println("덱이 비어 있습니다.");
                        }
                        break;

                    case 5:
                        try {
                            x = deque.peekFirst();
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (Q07Deque.EmptyDequeException e) {
                            System.out.println("덱이 비어 있습니다.");
                        }
                        break;

                    case 6:
                        try {
                            x = deque.peekLast();
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (Q07Deque.EmptyDequeException e) {
                            System.out.println("덱이 비어 있습니다.");
                        }
                        break;

                    case 7:
                        deque.dump();
                        break;

                    case 8:
                        System.out.print("검색할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        int idx = deque.search(x);

                        if (idx == 0)
                            System.out.println("해당 데이터는 존재하지 않습니다.");
                        else
                            System.out.printf("해당 데이터는 앞에서부터 %d번째에 존재합니다.\n", idx);

                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
