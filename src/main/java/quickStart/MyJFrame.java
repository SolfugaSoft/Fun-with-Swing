package quickStart;

import javax.swing.*;

public class MyJFrame extends JFrame {


    public MyJFrame() {

        setLocation(600, 300);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        add(new MyJPanel());
    }


}
