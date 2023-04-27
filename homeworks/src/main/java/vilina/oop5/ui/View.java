package vilina.oop5.ui;

import vilina.oop5.model.FamilyFree;
import vilina.oop5.model.Human;
import vilina.oop5.presenter.Presenter;

public interface View
{
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
    void print(Human human);
    void print(FamilyFree<Human> FamilyFree);
    String scan();
}