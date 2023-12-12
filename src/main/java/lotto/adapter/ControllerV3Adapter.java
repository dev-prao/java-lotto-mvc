package lotto.adapter;

import lotto.controller.ControllableV3;
import lotto.controller.ViewModel;

public class ControllerV3Adapter implements Adapter {

    @Override
    public boolean isSupport(final Object controller) {
        return controller instanceof ControllableV3;
    }

    @Override
    public ViewModel process(final Object controller) {
        ControllableV3 controllableV3 = (ControllableV3) controller;
        return controllableV3.process();
    }
}
