package controller;

import repository.LottoRepository;
import view.LottoEndOutputView;

public class LottoEndController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        LottoEndOutputView.printExit();
    }
}
