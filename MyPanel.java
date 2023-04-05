package io.siothconfig;




import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(){
        setLayout(new BorderLayout()); //Set the layout to borderLayout

        JButton button1 = new JButton("Button 1");
        add(button1, BorderLayout.NORTH);

        JButton button2 = new JButton("Button 2");
        add(button2, BorderLayout.SOUTH);

        JTextArea textArea = new JTextArea();
        add(textArea, BorderLayout.CENTER);
    }
    public static void main(String[] args){

        JFrame frame = new JFrame("My Panel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        System.out.println("hello");
    }
}
