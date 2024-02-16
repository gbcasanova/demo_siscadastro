/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */

import javax.swing. *;
import java.awt. *;
import java.awt.event. *;

public class splash extends JFrame 
{
    private static JLabel lbSplash;
    private ImageIcon imSplash;
    
    public static void main(String arg[]) {
        // Criando janela de splash.
        splash s = new splash();
        
        // Definindo o tipo de fechamento
        s.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        s.setSize(200, 198);
        s.setUndecorated(true);
        s.setLocationRelativeTo(null);
        s.setVisible(true);
        
        try {
            Thread.sleep(500);
        }
        catch(InterruptedException ex) {}
        
        // Fechando a janela
        s.dispose();
    }
    
    public splash() {  
        // Imagem do splash.
        imSplash = new ImageIcon(getClass().getResource("/images/logo2.jpg"));
        
        // adicionando a imagem no label e mudando o tamanho
        lbSplash = new JLabel(imSplash);
        lbSplash.setBounds(0, 0, 200, 198);
        
        // adicionando componentes na janela
        add(lbSplash);
    }
    
    // Fechar a janela
    public void dispose(){
        new login();
        super.dispose();
    }
}