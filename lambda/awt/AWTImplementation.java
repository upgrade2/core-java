package lambda.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTImplementation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Click me");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Button Clicked");
                JOptionPane.showMessageDialog(null,"Hey Button Clicked");
            }
        });
        button.setVisible(true);

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
