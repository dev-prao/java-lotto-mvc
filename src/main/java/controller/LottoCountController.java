package controller;

import repository.LottoRepository;

public class LottoCountController implements ControllableV4 {

    private static final LottoRepository lottoRepository = LottoRepository.getInstance();

    public ViewModel process() {
        int size = lottoRepository.size();
        ViewModel viewModel = new ViewModel("count");
        viewModel.add("size", size);
        return viewModel;
    }
}
