package br.com.jkalango.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

public class JKalango extends JFrame {

    public JKalango() {

        setTitle("JKalango - Splash Screen");
        setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza o JFrame na tela
        setLayout(new FlowLayout());

        // Aplica tema escuro ao JOptionPane
        javax.swing.UIManager.put("OptionPane.background", Color.DARK_GRAY);
        javax.swing.UIManager.put("Panel.background", Color.DARK_GRAY);
        javax.swing.UIManager.put("OptionPane.messageForeground", Color.WHITE);
        javax.swing.UIManager.put("Button.background", new Color(60, 63, 65));
        javax.swing.UIManager.put("Button.foreground", Color.WHITE);

        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 16));
        JOptionPane.showMessageDialog(this,
                "Em mundo distante, JKalango é um calango do Cerrado mágico em busca de preservar a sua espécie e de seus amigos JFormigas e JAbelinha e para isso deverá enfrentar diversas missões");

        JButton startButton = new JButton("Iniciar primeira missão");
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(new Color(60, 63, 65));
        add(startButton);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(JKalango.this, "Primeira missão iniciada");
            }
        });

        setVisible(true); // Torna o JFrame visível

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/JKalango.png"));
        JLabel imageLabel = new JLabel(icon);
        add(imageLabel);
        

        // Adiciona o painel ao frame no final 
        add(panel);
    }
}
