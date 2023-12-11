package controller;

import java.util.HashMap;
import java.util.Map;
import repository.LottoRepository;
import view.LottoCountOutputView;

public class LottoCountController implements ControllableV2 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public void process() {
        int size = lottoRepository.size();
        Map<String, Object> model = new HashMap<>();
        model.put("size", size);
        LottoCountOutputView.printLottosCount(model);
    }
}
