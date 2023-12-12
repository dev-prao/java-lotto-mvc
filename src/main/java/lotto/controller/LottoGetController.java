package lotto.controller;

import java.util.List;
import java.util.Map;
import lotto.Lotto;
import lotto.repository.LottoRepository;

public class LottoGetController implements ControllableV4 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public String process(Map<String, Object> model) {
        List<Lotto> lottos = lottoRepository.findAll();
        model.put("lottos", mapToInteger(lottos));
        return "get";
    }

    private List<List<Integer>> mapToInteger(List<Lotto> lottos) {
        return lottos.stream()
                .map(Lotto::getLotto)
                .toList();
    }
}
