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

public class produto extends JFrame implements ActionListener {
     // Declaração cadastro
    private JLabel lbCodigo, lbQuant, lbEsp, lbPrUnit, lbFabric, lbTipo, lbDist, lbVal;
    private JTextField tfCodigo, tfQuant, tfEsp, tfPrUnit, tfFabric, tfTipo, tfDist, tfVal;
    
    // Botões gerais
    private JButton btCadastrar, btConsultar, btAlterar, btExcluir, btVoltar, btNovo;
    
    private Font fntNormal;
    private Font fntBig;
    
    String svCodigo, svQuant, svEsp, svPrUnit, svFabric, svTipo, svDist, svVal;
    
    // Função da janela
    public produto(){
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
        //=======================================//
        // QUANTIDADE
        lbQuant = new JLabel("Quantidade: "); // LABEL
        lbQuant.setBounds(25, 60, 200, 25);
        lbQuant.setFont(fntNormal);
        add(lbQuant);
        
        tfQuant = new JTextField(""); // FIELD
        tfQuant.setBounds(150, 60, 100, 25);
        tfQuant.setFont(fntNormal);
        add(tfQuant);
        //=======================================//
        // ESPECIFICAÇÃO
        lbEsp = new JLabel("Especificação: "); // LABEL
        lbEsp.setBounds(25, 95, 200, 25);
        lbEsp.setFont(fntNormal);
        add(lbEsp);
        
        tfEsp = new JTextField(""); // FIELD
        tfEsp.setBounds(150, 95, 150, 25);
        tfEsp.setFont(fntNormal);
        add(tfEsp);
        //=======================================//
        // PREÇO UNITÁRIO
        lbPrUnit = new JLabel("Preço Unitário: "); // LABEL
        lbPrUnit.setBounds(25, 130, 200, 25);
        lbPrUnit.setFont(fntNormal);
        add(lbPrUnit);
        
        tfPrUnit = new JTextField(""); // FIELD
        tfPrUnit.setBounds(150, 130, 70, 25);
        tfPrUnit.setFont(fntNormal);
        add(tfPrUnit);
        //=======================================//
        // FABRICANTE
        lbFabric = new JLabel("Fabricante: "); // LABEL
        lbFabric.setBounds(25, 165, 200, 25);
        lbFabric.setFont(fntNormal);
        add(lbFabric);
        
        tfFabric = new JTextField(""); // FIELD
        tfFabric.setBounds(150, 165, 150, 25);
        tfFabric.setFont(fntNormal);
        add(tfFabric);
        //=======================================//
        // TIPO
        lbTipo = new JLabel("Tipo: "); // LABEL
        lbTipo.setBounds(25, 200, 200, 25);
        lbTipo.setFont(fntNormal);
        add(lbTipo);
        
        tfTipo = new JTextField(""); // FIELD
        tfTipo.setBounds(150, 200, 100, 25);
        tfTipo.setFont(fntNormal);
        add(tfTipo);
        //=======================================//
        // Distribuidor
        lbDist = new JLabel("Distribuidor: "); // LABEL
        lbDist.setBounds(25, 235, 200, 25);
        lbDist.setFont(fntNormal);
        add(lbDist);
        
        tfDist = new JTextField(""); // FIELD
        tfDist.setBounds(150, 235, 200, 25);
        tfDist.setFont(fntNormal);
        add(tfDist);
        //=======================================//
        // Distribuidor
        lbVal = new JLabel("Validade: "); // LABEL
        lbVal.setBounds(25, 270, 200, 25);
        lbVal.setFont(fntNormal);
        add(lbVal);
        
        tfVal = new JTextField(""); // FIELD
        tfVal.setBounds(150, 270, 200, 25);
        tfVal.setFont(fntNormal);
        add(tfVal);
        //=======================================//
        
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
        setTitle("Produto");
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
            tfEsp.setText("");
            tfPrUnit.setText("");
            tfFabric.setText("");
            tfTipo.setText("");
            tfVal.setText("");
            tfDist.setText("");
            tfCodigo.grabFocus();
        }
        
        if (e.getSource() == btVoltar) {
            this.dispose();
            new menu();
        }
        
        if (e.getSource() == btCadastrar){
            svCodigo = tfCodigo.getText();
            svQuant = tfQuant.getText();
            svEsp = tfEsp.getText();
            svPrUnit = tfPrUnit.getText();
            svFabric = tfFabric.getText();
            svTipo = tfTipo.getText();
            svVal = tfVal.getText();
            svDist = tfDist.getText();
            
            JOptionPane.showMessageDialog(null, 
                    "Código: "          + svCodigo +
                    "\nQuantidade: "    + svQuant  +
                    "\nEspecificação: " + svEsp    +
                    "\nPreço Unitário: "+ svPrUnit +
                    "\nFabricante: "    + svFabric +
                    "\nTipo: "          + svTipo   +
                    "\nValor: "         + svVal    +
                    "\nDistribuidor: "  + svDist
            );
            
            tfCodigo.setText("");
            tfQuant.setText("");
            tfEsp.setText("");
            tfPrUnit.setText("");
            tfFabric.setText("");
            tfTipo.setText("");
            tfVal.setText("");
            tfDist.setText("");
            tfCodigo.grabFocus();
        }
    }
}