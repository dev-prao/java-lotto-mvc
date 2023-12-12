package lotto.controller;

import java.util.List;
import lotto.Lotto;
import lotto.repository.LottoRepository;
import lotto.view.InputView;

public class LottoBuyController implements ControllableV3 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public ViewModel process() {
        List<Integer> numbers = InputView.inputLotto();

        Lotto lotto = new Lotto(numbers);
        Lotto saveLotto = lottoRepository.save(lotto);

        ViewModel viewModel = new ViewModel("buy");
        viewModel.add("lotto", saveLotto.getLotto());
        return viewModel;
    }
}
