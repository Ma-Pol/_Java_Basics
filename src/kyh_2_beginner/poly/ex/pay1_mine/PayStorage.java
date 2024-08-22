package kyh_2_beginner.poly.ex.pay1_mine;

import java.util.*;

public abstract class PayStorage {
    public static Map<String, Pay> payStorage = new HashMap<>() {{
        put("kakao", new KakaoPay());
        put("naver", new NaverPay());
    }};
}
