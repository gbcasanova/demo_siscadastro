/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */

// Importar bibliotecas.
import javax.swing.*;
import javax.swing.JOptionPane;

// Bibliotecas eventos
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {
    // Declaração de botões -  Ok, Cancelar e Esqueci
    private JButton btOk, btSair;
    private JLabel lbWallpaper, lbUser, lbSenha;
    private JTextField tfUser;
    private JPasswordField tfSenha;
    private ImageIcon imWallpaper;
    private Font fntNormal;
    String stradmin = "admin"; 
    
    // Função que carrega dados da tela de login.
    public login() {
        setLayout(null);
        
        fntNormal = new Font("Arial", Font.PLAIN, 18);
        
        // Wallpaper
        imWallpaper = new ImageIcon(getClass().getResource("/images/login.png"));
        lbWallpaper = new JLabel(imWallpaper);
        lbWallpaper.setBounds(0, 0, 890,500);
        
        // Usuário
        lbUser = new JLabel("Usuário: "); // LABEL
        lbUser.setForeground(Color.WHITE);
        lbUser.setBounds(195, 280, 200, 25);
        lbUser.setFont(fntNormal);
        add(lbUser);
        
        tfUser = new JTextField(""); // FIELD
        tfUser.setBounds(300, 280, 300, 25);
        tfUser.setFont(fntNormal);
        add(tfUser);
        
        // Senha
        lbSenha = new JLabel("Senha: "); // LABEL
        lbSenha.setForeground(Color.WHITE);
        lbSenha.setBounds(195, 315, 200, 25);
        lbSenha.setFont(fntNormal);
        add(lbSenha);
        
        tfSenha = new JPasswordField(""); // FIELD
        tfSenha.setBounds(300, 315, 300, 25);
        tfSenha.setFont(fntNormal);
        add(tfSenha);
        
        // OK
        btOk = new JButton("Confirmar");
        btOk.setMnemonic('C');
        btOk.setToolTipText("Botão Confirmar");
        btOk.setForeground(Color.BLACK);
        btOk.addActionListener(this);
        btOk.setBounds(370, 400, 150, 30);
        btOk.setFont(fntNormal);
        add(btOk);
        
        add(lbWallpaper); // Adicionar papel de Parede
        
        // Configurações da janela
        setSize(890,500);
        setLocationRelativeTo(null);
        //getContentPane().setBackground(Color.RED);
        setTitle("Menu");
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btOk) {
            if (tfUser.getText().equals(stradmin)) {
                if (tfSenha.getText().equals(stradmin)) {
                    this.dispose();
                    new menu();
                }
                else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Usuário e/ou senha errados!\n\nUsuário: admin\nSenha: admin");
                }
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(null, "Usuário e/ou senha errados!\n\nUsuário: admin\nSenha: admin");
            }
            
            
        }
    }
    
    
}
