package vilina.cw1;

import vilina.cw1.console.View;
import vilina.cw1.presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        vilina.cw1.presenter.Presenter p = new Presenter(new View());
        p.buttonClick(); // Старт программы
    }

}
