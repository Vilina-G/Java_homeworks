package vilina.oop7.ui;

import vilina.oop7.presenter.Presenter;

public interface View 
{
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
    String scan(); 
}
