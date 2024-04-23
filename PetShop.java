import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PetShop extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PetShop frame = new PetShop();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public PetShop() {
        setTitle("Welcome to PetShop");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton regButton = new JButton("Register");
        regButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RedirectFrame1();
            }
        });
        JPanel panel = new JPanel();
        panel.add(regButton);
        getContentPane().add(panel);
        setVisible(true);
    }

}


        class RedirectFrame1 extends JFrame {
            public RedirectFrame1() {
                setTitle("Pet Registration");
                setSize(500,500);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Create a panel to hold the labels and text fields
                JPanel panel = new JPanel();
                panel.setLayout(new GridLayout(8, 2, 8, 8));  // 8 rows, 2 columns with 10px spacing

                JLabel l1 = new JLabel("Name of the pet");
                JLabel l2 = new JLabel("Breed of the pet");
                JLabel l3 = new JLabel("Age of the pet");
                JLabel l4 = new JLabel("Colour of the pet");
                JLabel l5 = new JLabel("Weight of the pet");
                JLabel l6 = new JLabel("Unique Features of the pet");
                JLabel l7 = new JLabel("Owner's Name");
                JLabel l8 = new JLabel("Locality");

                JTextField t1 = new JTextField();
                JTextField t2 = new JTextField();
                JTextField t3 = new JTextField();
                JTextField t4 = new JTextField();
                JTextField t5 = new JTextField();
                JTextField t6 = new JTextField();
                JTextField t7 = new JTextField();
                JTextField t8 = new JTextField();

                // Add labels and text fields to the panel
                panel.add(l1);
                panel.add(t1);
                panel.add(l2);
                panel.add(t2);
                panel.add(l3);
                panel.add(t3);
                panel.add(l4);
                panel.add(t4);
                panel.add(l5);
                panel.add(t5);
                panel.add(l6);
                panel.add(t6);
                panel.add(l7);
                panel.add(t7);
                panel.add(l8);
                panel.add(t8);



                getContentPane().add(panel);
                setVisible(true);
            }
        }





