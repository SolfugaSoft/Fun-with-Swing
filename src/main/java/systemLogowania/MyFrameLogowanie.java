package systemLogowania;

import javax.swing.*;
import java.awt.*;

public class MyFrameLogowanie extends JFrame {

    public MyFrameLogowanie() {

        setTitle("System Logowania");
        setVisible(true);
//        setSize(500, 300);
        setLocation(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new MyPanelLogowanie());
        pack();

    }
}
