package controller;

public class LottoEndController implements ControllableV4 {

    @Override
    public ViewModel process() {
        return new ViewModel("end");
    }
}
