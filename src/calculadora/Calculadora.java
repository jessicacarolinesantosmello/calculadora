/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author IFMS
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        JButton botaoCalcular = new JButton("Calcular");
        JPanel painel = new JPanel();
painel.add(botaoCalcular);

JFrame janela = new JFrame("Calculadora");
janela.add(painel);
janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
janela.pack();
janela.setVisible(true);


    }
    
}
