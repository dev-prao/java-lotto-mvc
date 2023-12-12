package lotto.controller;

import lotto.repository.LottoRepository;

public class LottoEndController implements ControllableV5{

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    @Override
    public String process() {
        return "end";
    }
}
