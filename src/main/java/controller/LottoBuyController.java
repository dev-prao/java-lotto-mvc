package controller;

import java.util.List;
import lotto.Lotto;
import repository.LottoRepository;
import view.InputView;
import view.LottoBuyOutputView;

public class LottoBuyController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);
        LottoBuyOutputView.printLotto(saveLotto);
    }
}
