package view;

import java.util.List;
import java.util.Map;

public class LottoGetOutputView {

    public static void printLottos(Map<String, Object> model) {
        System.out.println("구입한 로또 목록입니다.");

        List<List<Integer>> lottos = (List<List<Integer>>) model.get("lottos");
        for (List<Integer> lotto : lottos) {
            System.out.println(lotto);
        }
        System.out.println();
    }
}
