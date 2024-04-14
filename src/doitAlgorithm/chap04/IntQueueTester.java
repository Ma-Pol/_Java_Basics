package doitAlgorithm.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntQueueTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            IntQueue queue = new IntQueue(64);

            while (true) {
                int menu;

                while (true) {
                    System.out.println();
                    System.out.printf("현재 데이터 개수: %d / %d\n", queue.size(), queue.getCapacity());
                    System.out.print("(1) 인큐   (2) 디큐   (3) 피크   (4) 덤프   (0) 종료: ");

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
                        System.out.print("데이터: ");
                        x = Integer.parseInt(br.readLine());

                        try {
                            queue.enque(x);
                        } catch (IntQueue.OverflowIntQueueException e) {
                            System.out.println("큐가 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        try {
                            x = queue.deque();
                            System.out.printf("디큐한 데이터는 %d입니다.\n", x);
                        } catch (IntQueue.EmptyIntQueueException e) {
                            System.out.println("큐가 비어 있습니다.");
                        }
                        break;

                    case 3:
                        try {
                            x = queue.peek();
                            System.out.printf("피크한 데이터는 %d입니다.\n", x);
                        } catch (IntQueue.EmptyIntQueueException e) {
                            System.out.println("큐가 비어 있습니다.");
                        }
                        break;

                    case 4:
                        queue.dump();
                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
