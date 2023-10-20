package br.com.fiap.beans;

import javax.swing.*;

import org.opencv.core.Core;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener{
	
	/**
	 * TELA INICIAL
	 */
	
	
	private static final long serialVersionUID = 1L;
	JLabel lblLogo = new JLabel();
	JLabel lblLogo2 = new JLabel();
	JPanel pnlpainel = new JPanel();
	JButton btnSair = new JButton();
	
	public Tela() {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		//Configuração da tela inicial
		setTitle("InovaAcess - WEBCAM Mouse");
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		lblLogo.setIcon(new ImageIcon("C:\\Users\\logonrmlocal\\Desktop\\pasta2\\projetoInovaAcess\\InovaAcessBeta\\src\\imagens\\logo.png"));
		pnlpainel.add(lblLogo);
		
		//Label titulo
		
		JLabel lblTitulo = new JLabel("WEBCAM");
		lblTitulo.setBounds(200, 200, 50, 50);
		
		//Configurações do botão
		
		JButton btnSair2 = new JButton("SAIR");
		btnSair2.setBounds((getX()-btnSair2.getX()/2), 300, 200, 50);
		btnSair2.setFont(new Font("Arial", Font.BOLD, 30));
		btnSair2.setForeground(new Color(20,20,20));
		btnSair2.setBackground(new Color(50,50,50));
		//Faz a ação do botão
		btnSair2.addActionListener(this);
		btnSair2.setVisible(true);
		
		JButton btnHabWeb = new JButton("Habilitar WebCam");
		btnHabWeb.setBounds((getX()-btnSair2.getX()/2)+100, 200, 300, 50);
		btnHabWeb.setFont(new Font("Arial", Font.BOLD, 20));
		btnHabWeb.setForeground(new Color(20,20,20));
		btnHabWeb.setBackground(new Color(32, 198, 122));
		btnHabWeb.addActionListener(this::abrirWebcam);
		
		//ADD AS TELAS NO PROJETO
		add(btnSair2);
		add(btnHabWeb);
		add(lblTitulo);
		add(pnlpainel);
		validate();
	}
	
	//Faz a ação do botao
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);	
	}
	
	public void abrirWebcam(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "abriu a webcam", "InovaAcess", JOptionPane.WARNING_MESSAGE);
		
		WebCam webcam = new WebCam();
		webcam.setVisible(true);
		this.add(webcam);//adiciona no frame
		
	}
	
}
