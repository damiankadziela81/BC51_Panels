import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        // JPanel = a GUI component that functions as a container to hold other components

        ImageIcon image = new ImageIcon("ok.png");


        JLabel label1 = new JLabel();
        label1.setText("Hi");
        label1.setIcon(image);
        label1.setBounds(100,75,150,150); //when not using layout manager to place the label manually

        JLabel label2 = new JLabel();
        label2.setText("Hello");
        label2.setIcon(image);
        label2.setVerticalAlignment(JLabel.BOTTOM); //when using BorderLayout manager
        label2.setHorizontalAlignment(JLabel.CENTER);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(new BorderLayout());

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        redPanel.add(label2);
        greenPanel.add(label1);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
