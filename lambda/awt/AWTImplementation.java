package lambda.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class AWTImplementation {
    public static void main(String[] args) {
        Random random = new Random();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int i=0;
        while(i<10) {
            JFrame frame = new JFrame("My Window");
            frame.setSize(400, 400);
            frame.setLayout(new FlowLayout());

            JButton button = new JButton("Click me");
            button.addActionListener((e) -> {
                        System.out.println("Button clicked");
                        JOptionPane.showMessageDialog(null, "Micky..");
                    }

            );
            button.setVisible(true);
        // Generate random positions within the screen bounds
            int x = random.nextInt(screenSize.width - frame.getWidth());
            int y = random.nextInt(screenSize.height - frame.getHeight());

            frame.setLocation(x, y);
         //   frame.setLocationRelativeTo(null);
            frame.add(button);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            i++;
        }
    }
}
