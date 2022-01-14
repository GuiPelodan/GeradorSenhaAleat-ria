package br.com.pelodan.senha.interfacegrafica;
import java.awt.event.*;
import javax.swing.*;

import br.com.pelodan.senha.sistema.Sistema;

@SuppressWarnings("serial")
public class Interface extends JFrame implements ActionListener {
	
	Sistema sistema = new Sistema();
	JButton btnGerar = new JButton("Gerar");
	JLabel labelSenha = new JLabel();
	private JTextField qtCaracter = new JTextField();
	
	public Interface() {
		qtCaracter.setBounds(274, 42, 32, 19);
		qtCaracter.setColumns(10);
		qtCaracter.setText(Integer.toString(sistema.getTamanhoSenha()));
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(460, 200);
		
		getContentPane().setLayout(null);
		
		JLabel lblGeradorDeSenha = new JLabel("Gerador de Senha Aleatória");
		lblGeradorDeSenha.setBounds(122, 0, 219, 49);
		getContentPane().add(lblGeradorDeSenha);
		
		btnGerar.setBounds(165, 73, 117, 25);
		btnGerar.addActionListener(this);
		getContentPane().add(btnGerar);
		labelSenha.setHorizontalAlignment(SwingConstants.CENTER);
		
		labelSenha.setBounds(12, 110, 430, 25);
		getContentPane().add(labelSenha);
		
		getContentPane().add(qtCaracter);
		
		JLabel lblQtCaractres = new JLabel("Qt. Caracteres ");
		lblQtCaractres.setBounds(165, 44, 129, 15);
		getContentPane().add(lblQtCaractres);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		try {
			if(obj == btnGerar){
				sistema.setTamanhoSenha(Integer.parseInt(qtCaracter.getText())-1);
				sistema.gerarSenhaAleatoria();
				labelSenha.setText(sistema.getSenha());
			}
		} catch (NumberFormatException e1) {
			labelSenha.setText("A quantidade deve ser um número inteiro");
		}
	}
	public static void main(String[] args) {
		new Interface();
	}
}
