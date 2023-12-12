package lotto.controller;

import java.util.HashMap;
import java.util.Map;
import lotto.view.OutputViewFactory;
import lotto.view.Viewable;

public class ViewModel {

    private final String viewPath;
    private final Map<String, Object> model;

    public ViewModel(final String viewPath) {
        this.viewPath = viewPath;
        this.model = new HashMap<>();
    }

    public ViewModel(final String viewPath, final Map<String, Object> model) {
        this.viewPath = viewPath;
        this.model = model;
    }

    public void add(String key, Object object) {
        model.put(key, object);
    }

    public void render() {
        OutputViewFactory viewFactory = OutputViewFactory.getInstance();
        Viewable viewable = viewFactory.get(viewPath);
        viewable.render(model);
    }
}
