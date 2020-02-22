package quickStart;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JFrame
        // wszystko co sie da do JFrame zostaje rozciągniete
        // dlatego do Jframe dodaje sie JPanel , w ktorym elementy sa poukladane obok siebie
        //

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                MyJFrame myJFrame = new MyJFrame();



            }
        });


    }
}
