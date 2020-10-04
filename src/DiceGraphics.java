import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random;

public class DiceGraphics implements ActionListener {
    static JLabel die; //declare the variables for the whole program
    static JButton roll;
    static ImageIcon die0, die1, die2, die3, die4, die5, die6;
    static int rollnum;

    public void Window() {
        JFrame fr = new JFrame("Dice Graphics");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 10));
        fr.add(panel);

        roll = new JButton("Roll the Die!"); //create the button
        roll.addActionListener(this); //assign actions to the button
        panel.add(roll);

        die0 = new ImageIcon("src\\Dice\\die0.jpg");//the blank die for the EXTRA
        die1 = new ImageIcon("src\\Dice\\die1.jpg");//add the images to all the image icons
        die2 = new ImageIcon("src\\Dice\\die2.jpg");
        die3 = new ImageIcon("src\\Dice\\die3.jpg");
        die4 = new ImageIcon("src\\Dice\\die4.jpg");
        die5 = new ImageIcon("src\\Dice\\die5.jpg");
        die6 = new ImageIcon("src\\Dice\\die6.jpg");
        die = new JLabel(die0); //create the label
        panel.add(die); //add the label to the frame

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setLocationRelativeTo(null);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Random rand = new Random();
        if (e.getSource() == roll) {
            rollnum = rand.nextInt(6);
            rollnum++;
            if (rollnum == 1)
                die.setIcon(die1);
            else if (rollnum == 2)
                die.setIcon(die2);
            else if (rollnum == 3)
                die.setIcon(die3);
            else if (rollnum == 4)
                die.setIcon(die4);
            else if (rollnum == 5)
                die.setIcon(die5);
            else if (rollnum == 6)
                die.setIcon(die6);
        }
    }
}