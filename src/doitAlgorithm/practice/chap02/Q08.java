package doitAlgorithm.practice.chap02;

public class Q08 {
}

class YMD {
    int y;
    int m;
    int d;

    // 생성자
    YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    // n일 뒤의 날짜를 반환
    public YMD after(int n) {
        return new YMD(this.y, this.m, this.d + n);
    }

    // n일 앞의 날짜를 반환
    public YMD before(int n) {
        return new YMD(this.y, this.m, this.d - n);
    }
}