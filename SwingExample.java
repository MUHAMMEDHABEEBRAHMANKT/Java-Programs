import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample implements ActionListener {
    private static JTextField t; // Declare t as a class-level variable
    private static int count = 0; // Variable to count button clicks

    public static void main(String[] args) {
        JFrame f = new JFrame("Example"); // creating instance of JFrame
        JLabel j = new JLabel("Hello"); // creating object of JLabel and passing "Hello World!" as argument to it
        j.setBounds(20, 20, 200, 40);
        f.add(j);
        
        t = new JTextField(); // Initialize t
        t.setBounds(35, 60, 180, 30);
        f.add(t);

        JButton b = new JButton("Click"); // creating instance of JButton
        b.setBounds(130, 100, 100, 40); // x axis, y axis, width, height
        b.addActionListener(new SwingExample());
        f.add(b); // adding button in JFrame

        f.setSize(400, 500); // 400 width and 500 height
        f.setLayout(null); // using no layout managers
        f.setVisible(true); // making the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Action to perform when the button is clicked
        t.setText("welcome");
    }
}
