package kyh_3_intermediate1.lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println("max(10, 20): " + Math.max(10, 20)); // 최대값
        System.out.println("min(10, 20): " + Math.min(10, 20)); // 최소값
        System.out.println("abs(-10): " + Math.abs(-10)); // 절대값

        System.out.println();

        // 반올림 및 정밀도 멧드
        System.out.println("ceil(2.1): " + Math.ceil(2.1)); // 올림(천장)
        System.out.println("floor(2.7): " + Math.floor(2.7)); // 내림(바닥)
        System.out.println("round(2.5): " + Math.round(2.5)); // 반올림

        System.out.println();

        // 기타 유용한 메서드
        System.out.println("sqrt(4): " + Math.sqrt(4)); // 제곱근
        System.out.println("random(): " + Math.random()); // 0.0 ~ 1.0 사이의 랜덤한 double
        
        // ※ 아주 정밀한 숫자와 반올림 계산이 필요하다면 BigDecimal 을 검색할 것
    }
}
