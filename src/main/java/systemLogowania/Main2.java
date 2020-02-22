package systemLogowania;

import java.awt.*;

public class Main2 {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyFrameRejestracja f = new MyFrameRejestracja();
            }
        });
    }
}
