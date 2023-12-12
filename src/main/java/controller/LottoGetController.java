package controller;

import java.util.List;
import lotto.Lotto;
import repository.LottoRepository;

public class LottoGetController implements ControllableV4 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public ViewModel process() {
        List<Lotto> lottos = lottoRepository.findAll();
        ViewModel viewModel = new ViewModel("get");
        viewModel.add("lottos", mapToInteger(lottos));
        return viewModel;
    }

    private List<List<Integer>> mapToInteger(List<Lotto> lottos) {
        return lottos.stream()
                .map(Lotto::getLotto)
                .toList();
    }
}
