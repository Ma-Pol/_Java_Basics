package kyh_3_intermediate1.lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3,};

        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // -1
        // 값이 없어서 -1이 반환된 것인지, -1을 찾아서 -1이 반환된 것인지 명확하지 않음
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }

        return -1;
    }
}
