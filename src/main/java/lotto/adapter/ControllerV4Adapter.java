package lotto.adapter;

import lotto.controller.ControllableV4;
import lotto.controller.ViewModel;
import java.util.HashMap;
import java.util.Map;

public class ControllerV4Adapter implements Adapter {

    @Override
    public boolean isSupport(final Object controller) {
        return controller instanceof ControllableV4;
    }

    @Override
    public ViewModel process(final Object controller) {
        ControllableV4 controllableV4 = (ControllableV4) controller;

        Map<String, Object> model = new HashMap<>();
        String viewPath = controllableV4.process(model);

        return new ViewModel(viewPath, model);
    }
}
