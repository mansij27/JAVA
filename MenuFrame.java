import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MenuFrame implements ActionListener {
    JFrame fr;
    JMenuBar bar;
    JMenu m, n;
    JMenuItem m1, m2, m3, n1, n2, n3;
    JTextArea ta;
    JFileChooser jf;

    MenuFrame() {
        fr = new JFrame();
        fr.setSize(400, 400);
        fr.setLayout(null);

        ta = new JTextArea();
        ta.setBounds(0, 0, fr.getWidth(), fr.getHeight());
        fr.add(ta);

        bar = new JMenuBar();
        fr.setJMenuBar(bar);

        m = new JMenu("Language");
        m.setMnemonic(KeyEvent.VK_R);
        n = new JMenu("Terminal");
        bar.add(m);
        bar.add(n);

        m1 = new JMenuItem("Java");
        m.add(m1);
        m2 = new JMenuItem("C++");
        m.add(m2);
        m3 = new JMenuItem("Python");
        m.add(m3);

        n1 = new JMenuItem("Compile");
        n2 = new JMenuItem("Run");
        n3 = new JMenuItem("Debug");
        n.add(n1);
        n.add(n2);
        n.add(n3);
        fr.setVisible(true);
    }

    public static void main(String s[]) {
        new MenuFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
