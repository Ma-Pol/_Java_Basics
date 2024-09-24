package kyh_3_intermediate2.collection.deque.ex.stack;

import java.util.ArrayDeque;
import java.util.Deque;

// history에는 "이전" 기록만 남기도록 설계
// "현재" 페이지는 currentPage에 저장
public class BrowserHistory {
    private Deque<String> history = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }

        return null;
    }
}
