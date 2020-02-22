package systemLogowania;

import javax.swing.*;

public class MyPanelRejestracja extends JPanel {
    public MyPanelRejestracja() {

        setLayout(null);

        JLabel login, haslo, powtorzHaslo;
        JTextField loginText, hasloText, powtorzHasloText;
        JCheckBox java, cpp, pajtong;
        ButtonGroup buttonGroupPlec;
        JRadioButton chlopak, dziewczyna, genderOffender;
        JButton usunDane, rejestracja;

        login = new JLabel();
        haslo = new JLabel();
        powtorzHaslo = new JLabel();

        loginText = new JTextField();
        hasloText = new JTextField();
        powtorzHasloText = new JTextField();

        java = new JCheckBox();
        cpp = new JCheckBox();
        pajtong = new JCheckBox();

        buttonGroupPlec = new ButtonGroup();
        chlopak = new JRadioButton();
        dziewczyna = new JRadioButton();
        genderOffender = new JRadioButton();

        usunDane = new JButton();
        rejestracja = new JButton();

        login.setText("podaj swoj login");
        login.setBounds(50, 50, 120, 25);
        haslo.setText("twoje haslo");
        haslo.setBounds(50, 80, 120, 25);
        powtorzHaslo.setText("Powtórz hasło");
        powtorzHaslo.setBounds(50, 110, 120, 25);

        add(login);
        add(haslo);
        add(powtorzHaslo);

        loginText.setText("tutaj wpisz login");
        loginText.setBounds(180, 50, 120, 25);
        hasloText.setText("tutaj wpisz haslo");
        hasloText.setBounds(180, 80, 120, 25);
        powtorzHasloText.setText("jeszcze raz");
        powtorzHasloText.setBounds(180, 110, 120, 25);

        add(loginText);
        add(hasloText);
        add(powtorzHasloText);

        java.setText("Java");
        java.setBounds(50, 150, 80, 25);
        java.setSelected(true);
        cpp.setText("C++");
        cpp.setBounds(130, 150, 80, 25);
        pajtong.setText("Pytong");
        pajtong.setBounds(210, 150, 80, 25);

        add(java);
        add(cpp);
        add(pajtong);

        chlopak.setText("Mężczyzna");
        chlopak.setBounds(50, 180, 90, 25);
        chlopak.setEnabled(true);
        chlopak.setSelected(true);

        dziewczyna.setText("Kobieta");
        dziewczyna.setBounds(140, 180, 70, 25);
        dziewczyna.setEnabled(true);
        dziewczyna.setSelected(false);

        genderOffender.setText("To skomplikowane");
        genderOffender.setBounds(220, 180, 150, 25);
        genderOffender.setEnabled(true);
        genderOffender.setSelected(false);

        buttonGroupPlec.add(chlopak);
        add(chlopak);
        buttonGroupPlec.add(dziewczyna);
        add(dziewczyna);
        buttonGroupPlec.add(genderOffender);
        add(genderOffender);

        usunDane.setText("Usuń Dane");
        usunDane.setBounds(50, 210, 150, 40);

        rejestracja.setText("Zarejestrój");
        rejestracja.setBounds(200, 210, 150, 40);

        add(usunDane);
        add(rejestracja);

    }
}
