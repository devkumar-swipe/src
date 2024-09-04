import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button_click{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 50);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
                JOptionPane.showMessageDialog(frame, "tum toh heavy driver ho bhai!");
            }
        });

        frame.setVisible(true);
    }
}