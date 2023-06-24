package vilina.cw1.model.modelMethod;

import java.util.*;

import vilina.cw1.console.View;
import vilina.cw1.model.fileHandling.FileHandling;

public class MetReceivingToys {

    View m = new View();

    FileHandling fh = new FileHandling();

    /*
     * Метод получения игрушки
     */
    public void ReceivingToys(Queue<String> listRaffledToys) {

        String receivedToys = listRaffledToys.remove();
        System.out.printf("Полученная игрушка: %s \n", receivedToys);
        fh.setReceivedToys(receivedToys);
        m.getValueStr("Для выхода нажмите Enter");
    }

}
