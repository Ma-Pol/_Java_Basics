package doitAlgorithm.practice.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05IntQueueTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Q05IntQueue queue = new Q05IntQueue(64);

            while (true) {
                int menu;

                while (true) {
                    System.out.println();
                    System.out.printf("현재 데이터 개수: %d / %d\n", queue.size(), queue.getCapacity());
                    System.out.print("(1) 인큐   (2) 디큐   (3) 피크   (4) 덤프   (5) 검색   (0) 종료: ");

                    menu = Integer.parseInt(br.readLine());

                    if (menu >= 0 && menu <= 5)
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
                            queue.enque(x);
                        } catch (Q05IntQueue.OverflowIntQueueException e) {
                            System.out.println("큐가 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        try {
                            x = queue.deque();
                            System.out.printf("디큐한 데이터는 %d입니다.\n", x);
                        } catch (Q05IntQueue.EmptyIntQueueException e) {
                            System.out.println("큐가 비어 있습니다.");
                        }
                        break;

                    case 3:
                        try {
                            x = queue.peek();
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (Q05IntQueue.EmptyIntQueueException e) {
                            System.out.println("큐가 비어 있습니다.");
                        }
                        break;

                    case 4:
                        queue.dump();
                        break;

                    case 5:
                        System.out.print("검색할 데이터: ");
                        x = Integer.parseInt(br.readLine());

                        int idx = queue.search(x);

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
