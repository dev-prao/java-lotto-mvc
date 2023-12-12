package lotto.adapter;

import lotto.controller.ViewModel;

public interface Adapter {

    boolean isSupport(Object controller);

    ViewModel process(Object controller);
}
