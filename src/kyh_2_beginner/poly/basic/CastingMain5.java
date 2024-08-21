package kyh_2_beginner.poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        System.out.println();

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

        System.out.println();

        System.out.println("new Parent() instanceof Parent: " + (new Parent() instanceof Parent));
        System.out.println("new Child() instanceof Parent: " + (new Child() instanceof Parent));
        System.out.println("new Parent() instanceof Child: " + (new Parent() instanceof Child));
        System.out.println("new Child() instanceof Child: " + (new Child() instanceof Child));
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child) {
            System.out.println("Child 인스턴스입니다.");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
