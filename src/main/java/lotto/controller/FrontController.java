package lotto.controller;

import lotto.adapter.Adapter;
import lotto.adapter.ControllerV3Adapter;
import lotto.adapter.ControllerV4Adapter;
import lotto.adapter.ControllerV5Adapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lotto.view.InputView;

public class FrontController {

    public static final String END = "4";
    private final Map<String, Object> controllers = new HashMap<>();
    private final List<Adapter> adapters = new ArrayList<>();

    public FrontController() {
        initControllers();
        initAdapters();
    }

    private void initControllers() {
        controllers.put("1", new LottoBuyController());
        controllers.put("2", new LottoCountController());
        controllers.put("3", new LottoGetController());
        controllers.put("4", new LottoEndController());
    }

    private void initAdapters() {
        adapters.add(new ControllerV3Adapter());
        adapters.add(new ControllerV4Adapter());
        adapters.add(new ControllerV5Adapter());
    }

    public static void run() {
        FrontController frontController = new FrontController();

        String menu = "0";
        while (!menu.equals(END)) {
            menu = InputView.inputMenu();
            frontController.service(menu);
            System.out.println();
        }
    }

    public void service(String path) {
        Object controller = controllers.get(path);
        Adapter adapter = findAdapter(controller);
        ViewModel viewModel = adapter.process(controller);
        viewModel.render();
    }

    private Adapter findAdapter(Object controller) {
        for (Adapter adapter : adapters) {
            if (adapter.isSupport(controller)) {
                return adapter;
            }
        }
        throw new IllegalArgumentException("어댑터를 찾을 수 없습니다.");
    }
}
