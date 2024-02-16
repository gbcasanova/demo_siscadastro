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

public class menu extends JFrame implements ActionListener 
{
    // Declaração de botões -  Ok, Cancelar e Esqueci
    private JButton btCliente, btProduto, btVenda, btSair;
    private JLabel lbWallpaper;
    private ImageIcon imWallpaper;
    private Font fntBig;
    
    // Função que carrega dados da tela de login.
    public menu() {
        setLayout(null);
        
        fntBig = new Font("Arial", Font.PLAIN, 20);
        
        // Wallpaper
        imWallpaper = new ImageIcon(getClass().getResource("/images/wallpaper.png"));
        lbWallpaper = new JLabel(imWallpaper);
        lbWallpaper.setBounds(0, 0, 890,500);
        
        // Botão cliente
        btCliente = new JButton("Cliente");
        btCliente.setMnemonic('C');
        btCliente.setToolTipText("Botão Cliente");
        btCliente.setForeground(Color.BLACK);
        btCliente.addActionListener(this);
        btCliente.setBounds(170, 15, 100, 30);
        btCliente.setFont(fntBig);
        add(btCliente);
        
        // Botão produto
        btProduto = new JButton("Produto");
        btProduto.setMnemonic('P');
        btProduto.setToolTipText("Botão produto");
        btProduto.setForeground(Color.BLACK);
        btProduto.addActionListener(this);
        btProduto.setBounds(280, 15, 105, 30);
        btProduto.setFont(fntBig);
        add(btProduto);
        
        // Botão venda
        btVenda = new JButton("Venda");
        btVenda.setMnemonic('V');
        btVenda.setToolTipText("Botão venda");
        btVenda.setForeground(Color.BLACK);
        btVenda.addActionListener(this);
        btVenda.setBounds(395, 15, 100, 30);
        btVenda.setFont(fntBig);
        add(btVenda);
        
        // Botão sair
        btSair = new JButton("Sair");
        btSair.setMnemonic('S');
        btSair.setToolTipText("Botão sair");
        btSair.setForeground(Color.BLACK);
        btSair.addActionListener(this);
        btSair.setBounds(705, 15, 100, 30);
        btSair.setFont(fntBig);
        add(btSair);
        
        add(lbWallpaper); // Adicionar papel de Parede
        
        // Fechar a janela ao clicar no X.
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                System.exit(0);
            }
        });
        
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
        if (e.getSource() == btCliente) {
            new cliente();
            this.setVisible(false);
        }
        if (e.getSource() == btProduto) {
            new produto();
            this.setVisible(false);
        }
        if (e.getSource() == btVenda) {
            new venda();
            this.setVisible(false);
        }
        if (e.getSource() == btSair) {
            System.exit(0);
            this.setVisible(false);
        }
    }
}
