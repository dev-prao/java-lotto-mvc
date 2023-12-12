package view;

import java.util.Map;

public class LottoBuyOutputView implements Viewable {

    @Override
    public void render(Map<String, Object> model) {
        System.out.println("로또를 구입했습니다.");
        System.out.println(model.get("lotto"));
        System.out.println();
    }
}
