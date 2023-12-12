package lotto.adapter;

import lotto.controller.ControllableV5;
import lotto.controller.ViewModel;

public class ControllerV5Adapter implements Adapter {

    @Override
    public boolean isSupport(final Object controller) {
        return controller instanceof ControllableV5;
    }

    @Override
    public ViewModel process(final Object controller) {
        ControllableV5 controllableV5 = (ControllableV5) controller;
        String viewPath = controllableV5.process();
        return new ViewModel(viewPath);
    }
}
