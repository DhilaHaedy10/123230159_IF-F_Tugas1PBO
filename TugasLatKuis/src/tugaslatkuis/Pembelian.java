package tugaslatkuis;

import javax.swing.*;

public class Pembelian extends JFrame{
    JTextField kuantitasField = new JTextField();
    JLabel hargaLabel, jumlahLabel, ppnLabel, totalLabel;
    int harga;
    
    public Pembelian(String kategori, int harga){
        this.harga = harga;
        
        setTitle("Halaman Pembelian");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        JLabel judulLabel = new JLabel("Halaman Pembelian");
        judulLabel.setBounds(20, 10, 200, 20);
        add(judulLabel);
        
        JLabel kategoriLabel = new JLabel("Kategori: " + kategori);
        kategoriLabel.setBounds(20, 40, 200, 20);
        add(kategoriLabel);
        
        JLabel hargaSatuanLabel = new JLabel("Harga: Rp " + String.format("%,.0f", (double) harga) + " /pcs");
        hargaSatuanLabel.setBounds(20, 60, 200, 20);
        add(hargaSatuanLabel);
        
        JLabel jumlahTextLabel = new JLabel("Jumlah: ");
        jumlahTextLabel.setBounds(20, 90, 100, 20);
        add(jumlahTextLabel);
        
        this.jumlahLabel = new JLabel(); 
        jumlahLabel.setBounds(80, 90, 100, 25);
        add(jumlahLabel);
       
        kuantitasField.setBounds(80, 120, 100, 25);
        add(kuantitasField);
        
        JButton beliBtn = new JButton("Beli");
        beliBtn.setBounds(20, 160, 340, 30);
        add(beliBtn);
        
        JLabel totalBeliLabel = new JLabel("Total Pembelian");
        totalBeliLabel.setBounds(20, 200, 200, 20);
        add(totalBeliLabel);
       
        hargaLabel = new JLabel("Harga Satuan: Rp" + String.format("%,.0f", (double) harga));
        hargaLabel.setBounds(20, 220, 200, 20);
        add(hargaLabel);
        
        this.ppnLabel = new JLabel("PPN (11%): Rp 0");
        ppnLabel.setBounds(20, 240, 200, 20);
        add(ppnLabel);
        
        this.totalLabel = new JLabel("Total Harga: Rp 0");
        totalLabel.setBounds(20, 260, 200, 20);
        add(totalLabel);
        
        JButton kembaliBtn = new JButton("Kembali");
        kembaliBtn.setBounds(20, 290, 340, 30);
        add(kembaliBtn);
        
        beliBtn.addActionListener(e -> hitungTotal());
        kembaliBtn.addActionListener(e -> dispose());
        
        setVisible(true);
    }
    
    private void hitungTotal(){
        try {
            int kuantitas = Integer.parseInt(kuantitasField.getText().trim());
            double totalPPN = (kuantitas * harga) * 0.11;
            double totalHarga = (kuantitas * harga) + totalPPN;
            
            jumlahLabel.setText(kuantitas + " pcs");
            ppnLabel.setText("PPN (11%): Rp " + String.format("%,.0f", totalPPN));
            totalLabel.setText("Total Harga: Rp" + String.format("%,.0f", totalHarga));
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Masukkan jumlah yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
