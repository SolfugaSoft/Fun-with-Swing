package systemLogowania;

import javax.swing.*;

public class MyPanelLogowanie extends JPanel {

    public MyPanelLogowanie() {
        setLayout(null);

        JLabel login, haslo, zapomnialem;
        JTextField textLogin, textHaslo;
        JButton zaloguj, nowy;

        login = new JLabel();
        haslo = new JLabel();
        zapomnialem = new JLabel();

        textLogin = new JTextField();
        textHaslo = new JTextField();

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
        nowy.setBounds(220, 170, 100, 25);
        nowy.setText("zarejestruj");

        add(zaloguj);
        add(nowy);
    }
}
