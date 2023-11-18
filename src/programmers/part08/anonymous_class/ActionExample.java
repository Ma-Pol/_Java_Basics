package programmers.part08.anonymous_class;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new MyAction();
        action.exec();

        System.out.println("====================================");

        // 익명 클래스(인스턴스) 구현
        Action anonymousAction = new Action() {
            @Override
            public void exec() {
                System.out.println("Anonymous Action exec()");
            }
        };

        anonymousAction.exec();
    }
}
