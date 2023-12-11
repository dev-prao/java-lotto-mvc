package view;

import java.util.List;
import lotto.Lotto;

public class LottoGetOutputView {

    public static void printLottos(List<Lotto> lottos) {
        System.out.println("구입한 로또 목록입니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getLotto());
        }
    }
}
