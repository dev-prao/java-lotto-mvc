package view;

import lotto.Lotto;

public class LottoBuyOutputView {

    public static void printLotto(Lotto lotto) {
        System.out.println("로또를 구입했습니다.");
        System.out.println(lotto.getLotto());
    }
}
