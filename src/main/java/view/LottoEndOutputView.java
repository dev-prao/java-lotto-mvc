package view;

import java.util.Map;

public class LottoEndOutputView implements Viewable {

    @Override
    public void render(Map<String, Object> model) {
        System.out.println("프로그램을 종료합니다.");
    }
}
