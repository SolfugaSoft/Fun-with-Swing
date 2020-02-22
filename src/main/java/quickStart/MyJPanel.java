package quickStart;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyJPanel extends JPanel {
    public MyJPanel() {
        setLayout(null);
        JButton button1, button2, button3;
        JTextArea jTextArea;


        JLabel label = new JLabel();
        label.setText("Główna strona");
        label.setBounds(100, 100, 150, 30);
        add(label);

        jTextArea = new JTextArea("Pole do pisania");
        jTextArea.setBounds(100, 140, 500, 500);
        add(jTextArea);

        button1 = new JButton();
        button1.setText("Zapisz informacje");
        button1.setBounds(50,50,120,25);
        add(button1);



    }

}
