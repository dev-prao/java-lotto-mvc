package controller;

import java.util.List;
import lotto.Lotto;
import repository.LottoRepository;
import view.LottoGetOutputView;

public class LottoGetController {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void service() {
        List<Lotto> lottos = lottoRepository.findAll();
        LottoGetOutputView.printLottos(lottos);
    }
}
