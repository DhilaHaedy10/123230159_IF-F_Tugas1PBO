/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaslatkuis;

import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class HomePage extends JFrame{
    public HomePage(String username){
        setTitle("Home Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JLabel welcomeLabel = new JLabel("Selamat Datang, " + username);
        welcomeLabel.setBounds(120, 30, 200, 30);
        add(welcomeLabel);
        
        JButton anakBtn = new JButton("DVD Anak");
        JButton dewasaBtn = new JButton("DVD Dewasa");
        JButton lansiaBtn = new JButton("DVD Lansia");
        
        anakBtn.setBounds(50, 80, 120, 40);
        dewasaBtn.setBounds(200, 80, 120, 40);
        lansiaBtn.setBounds(125, 140, 120, 40);
        
        anakBtn.addActionListener(e -> new Pembelian("DVD Anak", 27891));
        dewasaBtn.addActionListener(e -> new Pembelian("DVD Dewasa", 35396));
        lansiaBtn.addActionListener(e -> new Pembelian("DVD Lansia", 38550));
        
        add(anakBtn);
        add(dewasaBtn);
        add(lansiaBtn);
        
        setVisible(true);
    }
}
