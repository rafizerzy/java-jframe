package gameonline;

import java.util.Random;
import java.awt.*;
import javax.swing.*;

public class Topup extends javax.swing.JFrame {

    JFrame jf = new JFrame();

    public Topup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        list_diamond = new javax.swing.JComboBox<>();
        harga_diamond = new javax.swing.JTextField();
        jumlah_pembelian = new javax.swing.JTextField();
        total_harga = new javax.swing.JTextField();
        nominal_uang = new javax.swing.JTextField();
        kembalian = new javax.swing.JTextField();
        batal = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        bayar = new javax.swing.JButton();
        hitung_total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setForeground(new Color(255, 177, 42));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel1.setText("|| APLIKASI TOPUP GAME ONLINE ||");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("List Diamond  :    ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Harga Diamond       :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Jumlah Pembelian    :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Total Pembayaran         :     ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Nominal Pembayaran     :     ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Kembali                :     ");

        list_diamond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"      Pilih Item",
                "Battle Pass (Valo)", "Elite Pass (FF)", "Twilight Pass (ML)", "3 Diamonds",
                "17 Diamonds", "25 Diamonds", "40 Diamonds", "53 Diamonds", "77 Diamonds",
                "154 Diamonds", "217 Diamonds", "256 Diamonds",
                "367 Diamonds", "503 Diamonds", "774 Diamonds", "1708 Diamonds", "4003 Diamonds"}));

        list_diamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_diamondActionPerformed();
            }
        });

        harga_diamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_diamondActionPerformed();
            }
        });

        jumlah_pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_pembelianActionPerformed();
            }
        });

        total_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_hargaActionPerformed();
            }
        });

        nominal_uang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominal_uangActionPerformed();
            }
        });

        kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembalianActionPerformed();
            }
        });

        batal.setText("CLEAR");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        keluar.setText("KELUAR");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed();
            }
        });

        bayar.setText("BAYAR");
        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed();
            }
        });

        hitung_total.setText("HITUNG TOTAL");
        hitung_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_totalActionPerformed();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(keluar)
                                .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(272, 272, 272)
                                                                .addComponent(batal))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addComponent(jLabel7))
                                                                .addGap(4, 4, 4)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(nominal_uang, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(bayar)
                                                                                .addGap(24, 24, 24))))
                                                        .addComponent(jLabel3)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jumlah_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(hitung_total))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(harga_diamond, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(list_diamond, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel1)))
                                .addContainerGap(32, Short.MAX_VALUE))

        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(list_diamond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(batal))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(harga_diamond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jumlah_pembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hitung_total))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nominal_uang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(bayar))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(keluar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }//initComponents

    private void list_diamondActionPerformed() {
        String ListDiamond = (String) list_diamond.getSelectedItem();
        switch (ListDiamond) {
            case "Battle Pass (Valo)":
                harga_diamond.setText("150000");
                break;
            case "Elite Pass (FF)":
                harga_diamond.setText("100000");
                break;
            case "Twilight Pass (ML)":
                harga_diamond.setText("166000");
                break;
            case "3 Diamonds":
                harga_diamond.setText("1500");
                break;
            case "17 Diamonds":
                harga_diamond.setText("5000");
                break;
            case "25 Diamonds":
                harga_diamond.setText("8000");
                break;
            case "40 Diamonds":
                harga_diamond.setText("12000");
                break;
            case "53 Diamonds":
                harga_diamond.setText("16000");
                break;
            case "77 Diamonds":
                harga_diamond.setText("24000");
                break;
            case "154 Diamonds":
                harga_diamond.setText("48000");
                break;
            case "217 Diamonds":
                harga_diamond.setText("60000");
                break;
            case "256 Diamonds":
                harga_diamond.setText("80000");
                break;
            case "367 Diamonds":
                harga_diamond.setText("110000");
                break;
            case "503 Diamonds":
                harga_diamond.setText("150000");
                break;
            case "774 Diamonds":
                harga_diamond.setText("240000");
                break;
            case "1708 Diamonds":
                harga_diamond.setText("520000");
                break;
            case "4003 Diamonds":
                harga_diamond.setText("1250000");
                break;
        }
    }

    private void harga_diamondActionPerformed() {
    }

    private void jumlah_pembelianActionPerformed() {
    }

    private void total_hargaActionPerformed() {
    }

    private void nominal_uangActionPerformed() {
    }

    private void kembalianActionPerformed() {
    }

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {
        list_diamond.setSelectedIndex(0);
        harga_diamond.setText("");
        jumlah_pembelian.setText("");
        total_harga.setText("");
        nominal_uang.setText("");
        kembalian.setText("");
    }

    private void keluarActionPerformed() {
        System.exit(0);
    }

    private void hitung_totalActionPerformed() {
        int JumlahPembelian = Integer.parseInt(jumlah_pembelian.getText());
        int ListDiamond = Integer.parseInt(harga_diamond.getText());
        total_harga.setText(Integer.toString(ListDiamond * JumlahPembelian));
    }

    private void bayarActionPerformed() {
        Random lin = new Random();
        String[] usernames = {"KyuRazz", "Mystique", "JinxProAmanda", "M0nalisa", "Faylyne"};
        Random random = new Random();
        int randomIndex = random.nextInt(usernames.length);
        String randomUsername = usernames[randomIndex];

        int userID = lin.nextInt(10000);
        int NominalUang = Integer.parseInt(nominal_uang.getText());
        int TotalHarga = Integer.parseInt(total_harga.getText());
        if (NominalUang >= TotalHarga) {
            kembalian.setText(Integer.toString(NominalUang - TotalHarga));

            // Menampilkan pesan "Transaksi berhasil"
            JOptionPane.showMessageDialog(jf, "Transaksi berhasil!");

            // Menampilkan struk pembayaran
            String struk = "";
            struk += "Struk Pembayaran \n" +
                    "=========================\n";
            struk += "User ID                           : " + userID + "\n";
            struk += "Username                       : " + randomUsername + "\n";
            struk += "Nominal Diamond           : " + list_diamond.getSelectedItem() + "\n";
            struk += "Harga Diamond              : Rp" + harga_diamond.getText() + "\n";
            struk += "Jumlah Pembelian          : " + jumlah_pembelian.getText() + "\n";
            struk += "Total Pembayaran          : Rp" + total_harga.getText() + "\n";
            struk += "Nominal Pembayaran     : Rp" + nominal_uang.getText() + "\n";
            struk += "Kembali                          : Rp" + kembalian.getText() + "\n" +
                    "=========================\n" +
                    "Terima kasih telah melakukan pembayaran.";
            JOptionPane.showMessageDialog(jf, struk);

        } else {
            JOptionPane.showMessageDialog(jf, "Maaf saldo anda tidak cukup :< ");
        }
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Topup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Topup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Topup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Topup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Membuat dan menampilkan form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Topup().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton batal;
    private javax.swing.JButton bayar;
    private javax.swing.JTextField harga_diamond;
    private javax.swing.JButton hitung_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jumlah_pembelian;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField kembalian;
    private javax.swing.JComboBox<String> list_diamond;
    private javax.swing.JTextField nominal_uang;
    private javax.swing.JTextField total_harga;
    // End of variables declaration
}


