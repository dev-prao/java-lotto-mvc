package view;

import java.util.Map;

public class LottoCountOutputView {

    public static void printLottosCount(Map<String, Object> model) {
        System.out.printf("구입한 로또의 개수는 %d장입니다.", model.get("size"));
        System.out.println();
    }
}
