
package tugaslatkuis;

import javax.swing.*;

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
        JButton logoutBtn = new JButton("Logout");
        
        anakBtn.setBounds(50, 80, 120, 40);
        dewasaBtn.setBounds(200, 80, 120, 40);
        lansiaBtn.setBounds(125, 140, 120, 40);
        logoutBtn.setBounds(125, 200, 120, 40);
        
        anakBtn.addActionListener(e -> new Pembelian("DVD Anak", 27891));
        dewasaBtn.addActionListener(e -> new Pembelian("DVD Dewasa", 35396));
        lansiaBtn.addActionListener(e -> new Pembelian("DVD Lansia", 38550));
        
        logoutBtn.addActionListener(e -> {  
            int konfirmasi = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
            if (konfirmasi == JOptionPane.YES_OPTION) {
                dispose();  
                new Login(); 
            }
        });
        
        add(anakBtn);
        add(dewasaBtn);
        add(lansiaBtn);
        add(logoutBtn);
        
        setVisible(true);
    }
}
