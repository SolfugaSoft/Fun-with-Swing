package systemLogowania;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanelLogowanie extends JPanel {

    JLabel login, haslo, zapomnialem;
    JTextField textLogin;
    JButton zaloguj, nowy;
    JPasswordField textHaslo;

    class Akcje implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println(textLogin.getText());
            try {
                if (textLogin.getText().equals("Admin") && textHaslo.getText().equals("password")) {
                    JOptionPane.showMessageDialog(null, "Zalogowano");
                    System.out.println("zalogowano");
                } else {
                    JOptionPane.showMessageDialog(null, " pomyliłes ");
                    textHaslo.setText("");
                    textLogin.setText("");
                    System.out.println("pisz na nowo");
                }

            } catch (Exception ex) {
                System.out.println("nie działa");

            }
        }

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }

    public MyPanelLogowanie() {
        setLayout(null);


        login = new JLabel();
        haslo = new JLabel();
        zapomnialem = new JLabel();

        textLogin = new JTextField();
        textHaslo = new JPasswordField();

        zaloguj = new JButton();
        nowy = new JButton();

        login.setBounds(50, 100, 150, 25);
        login.setText("Login");
        haslo.setBounds(50, 130, 150, 25);
        haslo.setText("Hasło");
        zapomnialem.setBounds(160, 150, 200, 25);
        zapomnialem.setText("zapomniałem hasła");
        add(login);
        add(haslo);
        add(zapomnialem);

        textLogin.setBounds(120, 100, 200, 25);
        textLogin.setText("wpisz login");
        textHaslo.setBounds(120, 130, 200, 25);
        textHaslo.setText("wpisz haslo");
        add(textLogin);
        add(textHaslo);

        zaloguj.setBounds(120, 170, 100, 25);
        zaloguj.setText("zaloguj");
        zaloguj.addActionListener(new Akcje());
        nowy.setBounds(220, 170, 100, 25);
        nowy.setText("zarejestruj");
        nowy.addActionListener(eLambda -> {
            System.out.println("nowy klient");
        });

        add(zaloguj);
        add(nowy);

    }


}
