package view;

import java.util.HashMap;
import java.util.Map;

public class OutputViewFactory {

    private final Map<String, Viewable> views = new HashMap<>();
    private static final OutputViewFactory instance = new OutputViewFactory();

    public static OutputViewFactory getInstance() {
        return instance;
    }

    private OutputViewFactory() {
        views.put("buy", new LottoBuyOutputView());
        views.put("count", new LottoCountOutputView());
        views.put("get", new LottoGetOutputView());
        views.put("end", new LottoEndOutputView());
    }

    public Viewable get(String viewPath) {
        return views.get(viewPath);
    }
}
