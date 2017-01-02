/* Login.java | Ahmad Fajar
* Process to PayrollGUI.java
* Simple Payroll Application for Parttime Job
* */

import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {

    public static void main(String[] args) {
        Login frameTabel = new Login();
    }

    JButton blogin = new JButton("Login");
    JPanel panel = new JPanel();
    JTextField txuser = new JTextField(15);
    JPasswordField pass = new JPasswordField(15);
    JLabel jb = new JLabel("Username", JLabel.CENTER);
    JLabel jb1 = new JLabel("Password",JLabel.CENTER);
    Login(){
        super("Login Autentification");
        setSize(370,430);
        setLocation(500,280);
        panel.setLayout (null);


        jb.setBounds(90,110,150,20);
        txuser.setBounds(90,130,150,20);
        jb1.setBounds(90,150,150,20);
        pass.setBounds(90,170,150,20);
        blogin.setBounds(125,210,80,20);


        panel.add(blogin);
        panel.add(jb);
        panel.add(txuser);
        panel.add(jb1);
        panel.add(pass);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        actionlogin();
    }

    public void actionlogin(){
        blogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String puname = txuser.getText();
                String ppaswd = pass.getText();
                if(puname.equals("test") && ppaswd.equals("12345")) {
                    PayrollGUI regFace =new PayrollGUI();
                    regFace.setSize(350,430);
                    regFace.setLocation(500,280);
                    regFace.setVisible(true);
                    dispose();
                } else {

                    JOptionPane.showMessageDialog(null,"Wrong Password / Username");

                    txuser.setText("");

                    pass.setText("");
                    txuser.requestFocus();
                }

            }
        });
    }
}

