/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslatkuis;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JLabel judul = new JLabel("Login Page");
    JLabel usernameLabel = new JLabel("Username");
    JLabel PassLabel = new JLabel("Password");
    JTextField unameTextField = new JTextField();
    JPasswordField PassField = new JPasswordField();
    JButton TombolLogin = new JButton("Login");
    JButton TombolReset = new JButton("Reset");
    
    Login(){
        setVisible(true);
        setSize(350, 250);
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        setLayout(null);
        
        add(judul);
        add(usernameLabel);
        add(PassLabel);
        add(unameTextField);
        add(PassField);
        add(TombolLogin);
        add(TombolReset);
        
        judul.setBounds(120, 20, 150, 24);
        usernameLabel.setBounds(20, 60, 100, 20);
        unameTextField.setBounds(120, 60, 180, 25);
        PassLabel.setBounds(20, 100, 100, 20);
        PassField.setBounds(120, 100, 180, 25);
        TombolLogin.setBounds(50, 150, 100, 30);
        TombolReset.setBounds(180, 150, 100, 30);
        
        TombolLogin.addActionListener(this);
        TombolReset.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == TombolLogin){
                String username = unameTextField.getText();
                char[] passChar = PassField.getPassword();
                String password = new String(passChar);
                
                if(username.equals("123230159") && password.equals("951032321")){
                    JOptionPane.showMessageDialog(this, "LOGIN SUKSES!");
                    
                    new HomePage(username);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Username atau Password salah nih bub");
                }
            } else if(e.getSource() == TombolReset){
                unameTextField.setText("");
                PassField.setText("");
            }
        }catch (Exception error){
            
        }
    }
}
