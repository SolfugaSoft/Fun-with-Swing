package systemLogowania;

import javax.swing.*;



public class MyFrameRejestracja extends JFrame {


    public MyFrameRejestracja() {

        setTitle("System Logowania");
        setVisible(true);
        setSize(500, 900);
        setLocation(600, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(new MyPanelRejestracja());


    }

}
