package doitAlgorithm.practice.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06QueueTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Q06Queue<Integer> intQueue = new Q06Queue<>(64);
            Q06Queue<String> strQueue = new Q06Queue<>(32);

            while (true) {
                int queueSelect, menu;

                while (true) {
                    System.out.println();
                    System.out.print("사용할 큐를 선택하세요.\n(1) intQueue   (2) strQueue   (0) 프로그램 종료: ");
                    queueSelect = Integer.parseInt(br.readLine());

                    if (queueSelect < 0 || queueSelect > 2)
                        System.out.println("다시 입력하세요.");
                    else
                        break;
                }

                if (queueSelect == 0) break;

                while (true) {
                    System.out.println();
                    System.out.printf("현재 데이터 개수: %d / %d\n",
                            queueSelect == 1 ? intQueue.size() : strQueue.size(),
                            queueSelect == 1 ? intQueue.getCapacity() : strQueue.getCapacity());
                    System.out.print("메뉴를 선택하세요.\n(1) 인큐   (2) 디큐   (3) 피크   (4) 덤프   (5) 비우기   (0) 돌아가기: ");
                    menu = Integer.parseInt(br.readLine());

                    if (menu < 0 || menu > 5)
                        System.out.println("다시 입력하세요.");
                    else
                        break;
                }

                if (menu == 0) continue;

                int x;
                String str;

                switch (menu) {
                    case 1:
                        System.out.print("인큐할 데이터: ");
                        str = br.readLine();

                        try {
                            if (queueSelect == 1) {
                                x = Integer.parseInt(str);
                                intQueue.enque(x);
                            } else {
                                strQueue.enque(str);
                            }
                        } catch (Q02Stack.OverflowGenericStackException e) {
                            System.out.println("큐가 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        try {
                            System.out.printf("디큐한 데이터는 %s입니다.\n",
                                    queueSelect == 1 ? Integer.toString(intQueue.deque()) : strQueue.deque());
                        } catch (Q02Stack.EmptyGenericStackException e) {
                            System.out.println("큐가 비어 있습니다.");
                        }
                        break;

                    case 3:
                        try {
                            System.out.printf("피크한 데이터는 %s입니다.\n",
                                    queueSelect == 1 ? Integer.toString(intQueue.peek()) : strQueue.peek());
                        } catch (Q02Stack.EmptyGenericStackException e) {
                            System.out.println("큐가 비어 있습니다.");
                        }
                        break;

                    case 4:
                        if (queueSelect == 1)
                            intQueue.dump();
                        else
                            strQueue.dump();
                        break;

                    case 5:
                        if (queueSelect == 1)
                            intQueue.clear();
                        else
                            strQueue.clear();
                        System.out.println("큐를 모두 비웠습니다.");
                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
