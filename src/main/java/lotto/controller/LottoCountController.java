package lotto.controller;

import java.util.Map;
import lotto.repository.LottoRepository;

public class LottoCountController implements ControllableV4{

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public String process(final Map<String, Object> model) {
        int size = lottoRepository.size();
        model.put("size", size);
        return "count";
    }
}
