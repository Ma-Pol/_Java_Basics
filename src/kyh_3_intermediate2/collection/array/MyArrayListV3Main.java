package kyh_3_intermediate2.collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        // 마지막에 추가: O(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("\naddLast");
        list.add(3, "addLast"); // O(1)
        System.out.println(list);

        System.out.println("\naddFirst");
        list.add(0, "addFirst"); // O(n)
        System.out.println(list);

        // 삭제
        Object removed1 = list.remove(4); // remove Last: O(1)
        System.out.println("\nremove(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0); // remove First: O(n)
        System.out.println("\nremove(0) = " + removed2);
        System.out.println(list);
    }
}
