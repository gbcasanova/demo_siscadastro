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

public class cliente extends JFrame implements ActionListener {
    String[] optionsToChoose = {"RJ", "SP", "MG", "ES"};
    String[] estado = {"RJ", "SP", "MG", "ES"};
    
     // Declaração cadastro
    private JLabel lbCodigo, lbNome, lbEndereco, lbBairro, lbSexo, lbCidade, lbEstado;
    private JTextField tfCodigo, tfNome, tfEndereco, tfBairro;
    private ButtonGroup bgSexo;
    private JRadioButton rbMasc, rbFem;
    private JComboBox cbCidade, cbEstado;
    private Font fntNormal;
    private Font fntBig;
    
    // Botões gerais
    private JButton btCadastrar, btConsultar, btAlterar, btExcluir, btVoltar, btNovo;
    
    String svCodigo, svNome, svEndereco, svBairro, svSexo, svCidade, svEstado;
    
    // Função da janela
    public cliente(){
        setLayout(null);
        fntNormal = new Font("Arial", Font.PLAIN, 18);
        fntBig = new Font("Arial", Font.PLAIN, 20);
        
        // CÓDIGO
        lbCodigo = new JLabel("Código: "); // LABEL
        lbCodigo.setBounds(25, 25, 200, 25);
        lbCodigo.setFont(fntNormal);
        add(lbCodigo);
        
        tfCodigo = new JTextField(""); // FIELD
        tfCodigo.setBounds(125, 25, 50, 25);
        tfCodigo.setFont(fntNormal);
        add(tfCodigo);
        
        // NOME
        lbNome = new JLabel("Nome: ");
        lbNome.setBounds(25, 60, 200, 25);
        lbNome.setFont(fntNormal);
        add(lbNome);
        
        tfNome = new JTextField(""); // FIELD
        tfNome.setBounds(125, 60, 350, 25);
        tfNome.setFont(fntNormal);
        add(tfNome);
        
        // ENDEREÇO
        lbEndereco = new JLabel("Endereço: ");
        lbEndereco.setBounds(25, 95, 200, 25);
        lbEndereco.setFont(fntNormal);
        add(lbEndereco);
        
        tfEndereco = new JTextField(""); // FIELD
        tfEndereco.setBounds(125, 95, 300, 25);
        tfEndereco.setFont(fntNormal);
        add(tfEndereco);
        
        
        // BAIRRO
        lbBairro = new JLabel("Bairro: ");
        lbBairro.setBounds(435, 95, 200, 25);
        lbBairro.setFont(fntNormal);
        add(lbBairro);
        
        tfBairro = new JTextField(""); // FIELD
        tfBairro.setBounds(510, 95, 170, 25);
        tfBairro.setFont(fntNormal);
        add(tfBairro);
        
        
        // SEXO
        bgSexo = new ButtonGroup();
        lbSexo = new JLabel("Sexo: "); // LABEL
        lbSexo.setBounds(25, 130, 200, 25);
        lbSexo.setFont(fntNormal);
        add(lbSexo);
                                                      
        rbMasc = new JRadioButton("Masculino", false);
        rbMasc.setBounds(125, 130, 120, 25);
        rbMasc.addActionListener(this);
        rbMasc.setFont(fntNormal);
        rbMasc.setActionCommand("Masculino");
        add(rbMasc);
        bgSexo.add(rbMasc);
        
        rbFem = new JRadioButton("Feminino", false);
        rbFem.setBounds(250, 130, 100, 25);
        rbFem.addActionListener(this);
        rbFem.setFont(fntNormal);
        rbFem.setActionCommand("Feminino");
        add(rbFem);
        bgSexo.add(rbFem);
        
        
        // CIDADE
        lbCidade = new JLabel("Cidade: "); // LABEL
        lbCidade.setBounds(25, 165, 200, 25);
        lbCidade.setFont(fntNormal);
        add(lbCidade);
        
        cbCidade = new JComboBox(optionsToChoose);
        cbCidade.setBounds(125, 165, 250, 25);
        cbCidade.addActionListener(this);
        cbCidade.setFont(fntNormal);
        add(cbCidade);
        
        
        // ESTADO
        lbEstado = new JLabel("Estado: "); // LABEL
        lbEstado.setBounds(385, 165, 200, 25);
        lbEstado.setFont(fntNormal);
        add(lbEstado);
        
        cbEstado = new JComboBox(estado); // COMBO
        cbEstado.setBounds(460, 165, 150, 25);
        cbEstado.addActionListener(this);
        cbEstado.setFont(fntNormal);
        add(cbEstado);
        
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
        /*
*/
        
        setSize(890,500);
        setTitle("Cliente");
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
            tfNome.setText("");
            tfEndereco.setText("");
            tfBairro.setText("");
            cbCidade.setSelectedItem(null);
            cbEstado.setSelectedItem(null);
            bgSexo.clearSelection();
            tfCodigo.grabFocus();
        }
        
        if (e.getSource() == btVoltar) {
            this.dispose();
            new menu();
        }
        
        if (e.getSource() == btCadastrar){
            svCodigo = tfCodigo.getText();
            svNome = tfNome.getText();
            svEndereco = tfEndereco.getText();
            svBairro = tfBairro.getText();
            svSexo = bgSexo.getSelection().getActionCommand();
            svCidade = cbCidade.getSelectedItem().toString();
            svEstado = cbEstado.getSelectedItem().toString();;
            
            JOptionPane.showMessageDialog(null, 
                    "Código: "     + svCodigo   +
                    "\nNome: "     + svNome     +
                    "\nEndereco: " + svEndereco +
                    "\nBairro: "   + svBairro   +
                    "\nSexo: "     + svSexo     +
                    "\nCidade: "   + svCidade   +
                    "\nEstado: "   + svEstado
            );
            
            tfCodigo.setText("");
            tfNome.setText("");
            tfEndereco.setText("");
            tfBairro.setText("");
            cbCidade.setSelectedItem(null);
            cbEstado.setSelectedItem(null);
            bgSexo.clearSelection();
            tfCodigo.grabFocus();
        }
    }
}
