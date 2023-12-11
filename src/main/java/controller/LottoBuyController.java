package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lotto.Lotto;
import repository.LottoRepository;
import view.InputView;
import view.LottoBuyOutputView;

public class LottoBuyController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public void process() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);

        Map<String, Object> model = new HashMap<>();
        model.put("lotto", saveLotto.getLotto());
        LottoBuyOutputView.printLotto(model);
    }
}
