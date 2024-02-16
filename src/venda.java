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

public class venda extends JFrame implements ActionListener {
     // Declaração cadastro
    private JLabel lbCodigo, lbQuant, lbPrecUnit, lbPrecTotal, lbVend, lbData, lbHora;
    private JTextField tfCodigo, tfQuant, tfPrecUnit, tfPrecTotal, tfVend, tfData, tfHora;
    
    // Botões gerais
    private JButton btCadastrar, btConsultar, btAlterar, btExcluir, btVoltar, btNovo;
    
    private Font fntNormal;
    private Font fntBig;
    
    String svCodigo, svQuant, svPrecUnit, svPrecTotal, svVend, svData, svHora;
    
    // Função da janela
    public venda(){
        setLayout(null);
        fntNormal = new Font("Arial", Font.PLAIN, 18);
        fntBig = new Font("Arial", Font.PLAIN, 20);
        
        // CÓDIGO
        lbCodigo = new JLabel("Código: "); // LABEL
        lbCodigo.setBounds(25, 25, 200, 25);
        lbCodigo.setFont(fntNormal);
        add(lbCodigo);
        
        tfCodigo = new JTextField(""); // FIELD
        tfCodigo.setBounds(150, 25, 50, 25);
        tfCodigo.setFont(fntNormal);
        add(tfCodigo);
        //----------------------------------------//
        // QUANTIDADE
        lbQuant = new JLabel("Quantidade: "); // LABEL
        lbQuant.setBounds(25, 60, 200, 25);
        lbQuant.setFont(fntNormal);
        add(lbQuant);
        
        tfQuant = new JTextField(""); // FIELD
        tfQuant.setBounds(150, 60, 50, 25);
        tfQuant.setFont(fntNormal);
        add(tfQuant);
        //----------------------------------------//
        // PREÇO UNITÁRIO
        lbPrecUnit = new JLabel("Preço Unitário: "); // LABEL
        lbPrecUnit.setBounds(25, 95, 200, 25);
        lbPrecUnit.setFont(fntNormal);
        add(lbPrecUnit);
        
        tfPrecUnit = new JTextField(""); // FIELD
        tfPrecUnit.setBounds(150, 95, 50, 25);
        tfPrecUnit.setFont(fntNormal);
        add(tfPrecUnit);
        //----------------------------------------//
        // PREÇO TOTAL
        lbPrecTotal = new JLabel("Preço Total: "); // LABEL
        lbPrecTotal.setBounds(25, 130, 200, 25);
        lbPrecTotal.setFont(fntNormal);
        add(lbPrecTotal);
        
        tfPrecTotal = new JTextField(""); // FIELD
        tfPrecTotal.setBounds(150, 130, 50, 25);
        tfPrecTotal.setFont(fntNormal);
        add(tfPrecTotal);
        //----------------------------------------//
        // VENDEDOR
        lbVend = new JLabel("Vendedor: "); // LABEL
        lbVend.setBounds(25, 165, 200, 25);
        lbVend.setFont(fntNormal);
        add(lbVend);
        
        tfVend = new JTextField(""); // FIELD
        tfVend.setBounds(150, 165, 150, 25);
        tfVend.setFont(fntNormal);
        add(tfVend);
        //----------------------------------------//
        // DATA
        lbData = new JLabel("Data: "); // LABEL
        lbData.setBounds(25, 200, 200, 25);
        lbData.setFont(fntNormal);
        add(lbData);
        
        tfData = new JTextField(""); // FIELD
        tfData.setBounds(150, 200, 100, 25);
        tfData.setFont(fntNormal);
        add(tfData);
        //----------------------------------------//
        // HORA
        lbHora = new JLabel("Hora: "); // LABEL
        lbHora.setBounds(25, 235, 200, 25);
        lbHora.setFont(fntNormal);
        add(lbHora);
        
        tfHora = new JTextField(""); // FIELD
        tfHora.setBounds(150, 235, 100, 25);
        tfHora.setFont(fntNormal);
        add(tfHora);
        //----------------------------------------//
        
        
        // BOTÕES DO FINAL DA TELA
        // Botão Cadastrar
        btNovo = new JButton("Novo");
        btNovo.setMnemonic('N');
        btNovo.setToolTipText("Botão Novo");
        btNovo.setForeground(Color.BLACK);
        btNovo.addActionListener(this);
        btNovo.setBounds(25, 420, 150, 30);
        btNovo.setFont(fntBig);
        add(btNovo);
        
        // Botão Cadastrar
        btCadastrar = new JButton("Cadastrar");
        btCadastrar.setMnemonic('C');
        btCadastrar.setToolTipText("Botão Cadastrar");
        btCadastrar.setForeground(Color.BLACK);
        btCadastrar.addActionListener(this);
        btCadastrar.setBounds(185, 420, 150, 30);
        btCadastrar.setFont(fntBig);
        add(btCadastrar);
        
        // Botão consultar
        btConsultar = new JButton("Consultar");
        btConsultar.setMnemonic('O');
        btConsultar.setToolTipText("Botão Consultar");
        btConsultar.setForeground(Color.BLACK);
        btConsultar.addActionListener(this);
        btConsultar.setBounds(345, 420, 150, 30);
        btConsultar.setFont(fntBig);
        add(btConsultar);
        
        // Botão Alterar
        btAlterar = new JButton("Alterar");
        btAlterar.setMnemonic('A');
        btAlterar.setToolTipText("Botão Alterar");
        btAlterar.setForeground(Color.BLACK);
        btAlterar.addActionListener(this);
        btAlterar.setBounds(505, 420, 150, 30);
        btAlterar.setFont(fntBig);
        add(btAlterar);
        
        // Botão Excluir
        btExcluir = new JButton("Excluir");
        btExcluir.setMnemonic('E');
        btExcluir.setToolTipText("Botão Excluir");
        btExcluir.setForeground(Color.BLACK);
        btExcluir.addActionListener(this);
        btExcluir.setBounds(665, 420, 150, 30);
        btExcluir.setFont(fntBig);
        add(btExcluir);
        
        // Botão Voltar
        btVoltar = new JButton("Voltar");
        btVoltar.setMnemonic('V');
        btVoltar.setToolTipText("Botão Voltar");
        btVoltar.setForeground(Color.BLACK);
        btVoltar.addActionListener(this);
        btVoltar.setBounds(720, 10, 150, 30);
        btVoltar.setFont(fntBig);
        add(btVoltar);
        
        // Abrir o menu ao clicar no X.
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                new menu();
            }
        });    
        
        setSize(890,500);
        setTitle("Venda");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        getContentPane().setBackground(Color.decode("#AEB9D5"));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btNovo) {
            tfCodigo.setText("");
            tfQuant.setText("");
            tfPrecUnit.setText("");
            tfPrecTotal.setText("");
            tfVend.setText("");
            tfData.setText("");
            tfHora.setText("");
            tfCodigo.grabFocus();
        }
        
        if (e.getSource() == btVoltar) {
            this.dispose();
            new menu();
        }
        
        if (e.getSource() == btCadastrar) {
            svCodigo = tfCodigo.getText();
            svQuant = tfQuant.getText();
            svPrecUnit = tfPrecUnit.getText();
            svPrecTotal = tfPrecTotal.getText();
            svVend = tfVend.getText();
            svData = tfData.getText();
            svHora = tfHora.getText();
            
            JOptionPane.showMessageDialog(null, 
                    "Código: "          + svCodigo    +
                    "\nQuantidade: "    + svQuant     +
                    "\nPreço Unitario: "+ svPrecUnit  +
                    "\nPreço Total: "   + svPrecTotal +
                    "\nVendedor: "      + svVend      +
                    "\nData: "          + svData      +
                    "\nHora: "          + svHora     
            );
            
            tfCodigo.setText("");
            tfQuant.setText("");
            tfPrecUnit.setText("");
            tfPrecTotal.setText("");
            tfVend.setText("");
            tfData.setText("");
            tfHora.setText("");
            tfCodigo.grabFocus();
        }
    }
    
}
