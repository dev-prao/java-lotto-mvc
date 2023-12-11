package controller;

import repository.LottoRepository;
import view.LottoCountOutputView;

public class LottoCountController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        int size = lottoRepository.size();
        LottoCountOutputView.printLottosCount(size);
    }
}
