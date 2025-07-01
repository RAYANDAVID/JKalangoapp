package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;



   


public class JSplash extends JFrame{

    
    
     public JSplash(){

        setTitle("JKalango - Splash Screen");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new FlowLayout());
     
      
     // 2 - Mostrar o formulário

        JButton startButton = new JButton("Start");
        add(startButton);
      
     // 3 - Adicionar o JButton com o titulo Start

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JSplash.this, "JKalango");
            }
        });
     
     // 4 - Adicionar um evento ao botão que ao clicar mostre "JKalango"


     setVisible(true); // Torna o JFrame visível
       
     
     // 5 - Colocar a imagem do Kalango (sem animação)

     JLabel imageLabel = new JLabel();
     imageLabel.setIcon(new ImageIcon("JKalango.png")); 
     add(imageLabel);
     
    }

}
