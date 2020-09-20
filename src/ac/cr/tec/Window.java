package ac.cr.tec;

import sun.plugin2.gluegen.runtime.CPU;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window(){
        setSize(800, 740);
        setTitle("Chat");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.ORANGE);
        addComponents();
    }
    public void addComponents(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel label1 = new JLabel("Chats",SwingConstants.CENTER);
        label1.setOpaque(true);
        label1.setForeground(Color.GRAY);
        label1.setBackground(Color.BLACK);
        label1.setFont(new Font("cooper black",Font.BOLD,40));

        label1.setBounds(0,0,320,70);
        panel.add(label1);
    }
}
