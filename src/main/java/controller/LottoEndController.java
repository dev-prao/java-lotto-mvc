package controller;

import view.LottoEndOutputView;

public class LottoEndController implements ControllableV2 {

    public void process() {
        LottoEndOutputView.printExit();
    }
}
