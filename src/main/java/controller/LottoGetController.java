package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lotto.Lotto;
import repository.LottoRepository;
import view.LottoGetOutputView;

public class LottoGetController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void process() {
        List<Lotto> lottos = lottoRepository.findAll();
        Map<String, Object> model = new HashMap<>();
        model.put("lottos", mapToInteger(lottos));
        LottoGetOutputView.printLottos(model);
    }

    private List<List<Integer>> mapToInteger(List<Lotto> lottos) {
        return lottos.stream()
                .map(Lotto::getLotto)
                .toList();
    }
}
