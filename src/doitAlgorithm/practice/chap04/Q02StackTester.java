package doitAlgorithm.practice.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02StackTester {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Q02Stack<Integer> intStack = new Q02Stack<>(64);
            Q02Stack<String> strStack = new Q02Stack<>(32);

            while (true) {
                int stackSelect, menu;

                while (true) {
                    System.out.println();
                    System.out.print("사용할 스택을 선택하세요.\n(1) intStack   (2) strStack   (0) 프로그램 종료: ");
                    stackSelect = Integer.parseInt(br.readLine());

                    if (stackSelect < 0 || stackSelect > 2)
                        System.out.println("다시 입력하세요.");
                    else
                        break;
                }

                if (stackSelect == 0) break;

                while (true) {
                    System.out.println();
                    System.out.printf("현재 데이터 개수: %d / %d\n",
                            stackSelect == 1 ? intStack.size() : strStack.size(),
                            stackSelect == 1 ? intStack.getCapacity() : strStack.getCapacity());
                    System.out.print("메뉴를 선택하세요.\n(1) 푸시   (2) 팝   (3) 피크   (4) 덤프   (5) 비우기   (0) 돌아가기: ");
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
                        System.out.print("푸시할 데이터: ");
                        str = br.readLine();

                        try {
                            if (stackSelect == 1) {
                                x = Integer.parseInt(str);
                                intStack.push(x);
                            } else {
                                strStack.push(str);
                            }
                        } catch (Q02Stack.OverflowGenericStackException e) {
                            System.out.println("스택이 가득 찼습니다.");
                        }
                        break;

                    case 2:
                        try {
                            System.out.printf("팝한 데이터는 %s입니다.\n",
                                    stackSelect == 1 ? Integer.toString(intStack.pop()) : strStack.pop());
                        } catch (Q02Stack.EmptyGenericStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 3:
                        try {
                            System.out.printf("피크한 데이터는 %s입니다.\n",
                                    stackSelect == 1 ? Integer.toString(intStack.peek()) : strStack.peek());
                        } catch (Q02Stack.EmptyGenericStackException e) {
                            System.out.println("스택이 비어 있습니다.");
                        }
                        break;

                    case 4:
                        if (stackSelect == 1)
                            intStack.dump();
                        else
                            strStack.dump();
                        break;

                    case 5:
                        if (stackSelect == 1)
                            intStack.clear();
                        else
                            strStack.clear();
                        System.out.println("스택을 모두 비웠습니다.");
                        break;
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
