package view;

import java.util.Map;

public class LottoBuyOutputView {

    public static void printLotto(Map<String, Object> model) {
        System.out.println("로또를 구입했습니다.");
        System.out.println(model.get("lotto"));
    }
}
