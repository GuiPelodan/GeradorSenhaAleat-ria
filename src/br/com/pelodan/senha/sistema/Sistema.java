package br.com.pelodan.senha.sistema;

import java.util.Random;
public class Sistema 
{	
	Random random = new Random();
	private String senha = "";
	private final String valores = 
			"qwertyuiopasdfghjklzxcvbnmQWERTYUIPASDFGHJKLZXCVBNM1234567890#@$!&*";
	private int tamanhoSenha = 8;
	//Constructor
	public Sistema(){	
	}
	//Getters & Setters
	public int getTamanhoSenha() {
		return tamanhoSenha;
	}
	public void setTamanhoSenha(int tamanhoSenha) {
		this.tamanhoSenha = tamanhoSenha;
	}
	public String getSenha() {
		return senha;
	}
	//Métodos da Classe
	public String gerarSenhaAleatoria(){
		senha = "";
		for(int i = 0; i <= tamanhoSenha; i++) {
			senha += valores.charAt(random.nextInt(valores.length()));
		}
		return senha;
	}	
}
