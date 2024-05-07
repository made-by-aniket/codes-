
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PetShop extends JFrame {

    private static final long serialVersionUID = 1L;

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
        JButton comButton = new JButton("Complaint");
        comButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RedirectFrame2();
            }
        });


        JPanel panel = new JPanel();
        panel.add(regButton);
        panel.add(comButton);
        getContentPane().add(panel);
        panel.setBackground(Color.BLUE);
        setVisible(true);
    }

}


class RedirectFrame1 extends JFrame implements ActionListener{
    JButton sub1;
    JLabel ans2;
    public RedirectFrame1() {
        setTitle("Pet Registration");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);


        JLabel l1 = new JLabel("Name of the pet");
        l1.setBounds(10,20,150,20);
        JLabel l2 = new JLabel("Breed of the pet");
        l2.setBounds(10,40,150,20);
        JLabel l3 = new JLabel("Age of the pet");
        l3.setBounds(10,60,150,20);
        JLabel l4 = new JLabel("Colour of the pet");
        l4.setBounds(10,80,150,20);
        JLabel l5 = new JLabel("Weight of the pet");
        l5.setBounds(10,100,150,20);
        JLabel l6 = new JLabel("Unique Features of the pet");
        l6.setBounds(10,120,200,20);
        JLabel l7 = new JLabel("Owner's Name");
        l7.setBounds(10,140,150,20);
        JLabel l8 = new JLabel("Locality");
        l8.setBounds(10,160,150,20);

        JTextField t1 = new JTextField();
        t1.setBounds(180,20,220,20);
        JTextField t2 = new JTextField();
        t2.setBounds(180,40,220,20);
        JTextField t3 = new JTextField();
        t3.setBounds(180,60,220,20);
        JTextField t4 = new JTextField();
        t4.setBounds(180,80,220,20);
        JTextField t5 = new JTextField();
        t5.setBounds(180,100,220,20);
        JTextField t6 = new JTextField();
        t6.setBounds(180,120,220,20);
        JTextField t7 = new JTextField();
        t7.setBounds(180,140,220,20);
        JTextField t8 = new JTextField();
        t8.setBounds(180,160,220,20);

        sub1 = new JButton("Submit");
        sub1.setBounds(250,250,150,20);
        sub1.addActionListener(this);

        ans2 = new JLabel();
        ans2.setBounds(10,300,300,20);

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
        panel.add(sub1);
        panel.add(ans2);
        getContentPane().add(panel);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sub1 ) {
            ans2.setText("Registration Done successfully");
        }
    }
}


class RedirectFrame2 extends JFrame implements ActionListener {
    JButton sub;
    JLabel ans;

    public RedirectFrame2() {
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        setTitle("COMPLAINT");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        sub = new JButton("Submit");
        sub.setBounds(150,250,200,20);
        sub.addActionListener(this);
        ans = new JLabel();
        ans.setBounds(10,300,300,20);
        JLabel c1 = new JLabel("Complain here");
        c1.setBounds(10,1,150,20);
        JTextArea cb = new JTextArea();
        cb.setBounds(20,30,200,200);
        ImageIcon image = new ImageIcon("\"D:\\GUI\\dog.jpeg\"");

        panel1.add(c1);
        panel1.add(cb);
        panel1.add(sub);
        panel1.add(ans);
        getContentPane().add(panel1);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sub ) {
            ans.setText("Complaint submitted successfully");
        }
    }
}