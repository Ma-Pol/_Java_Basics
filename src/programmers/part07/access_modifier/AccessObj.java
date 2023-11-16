package programmers.part07.access_modifier;

public class AccessObj {
    // public > protected > default > private
    // public: 모든 접근 허용
    public int p = 3;
    // protected: 같은 패키지일 때, 또는 다른 패키지 내에서 상속을 받은 경우 접근 허용
    protected int p2 = 4;
    // default: 자기 자신과 같은 패키지 내에서만 접근 허용
    int p3 = 5;
    // private: 자기 자신만 접근 허용
    private int p4 = 6;
}
