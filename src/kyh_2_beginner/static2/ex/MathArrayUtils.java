package kyh_2_beginner.static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // private 을 사용하여 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum;
    }

    public static double average(int[] array) {
        double average = sum(array) / (double) array.length;

        return average;
    }

    public static int min(int[] array) {
        int minNumber = array[0];

        for (int num : array) {
            if (minNumber > num) {
                minNumber = num;
            }
        }

        return minNumber;
    }

    public static int max(int[] array) {
        int maxNumber = array[0];

        for (int num : array) {
            if (maxNumber < num) {
                maxNumber = num;
            }
        }

        return maxNumber;
    }
}
