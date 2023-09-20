package Controller;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JTextField;

import modelo.Usuario;

public class Base {

	Map<Integer, Usuario> cadastro = new HashMap<Integer, Usuario>();

	public Map<Integer, Usuario> getCadastro() {
		return cadastro;
	}

	public void setCadastro(Map<Integer, Usuario> cadastro) {
		this.cadastro = cadastro;
	}
	
	public Usuario obterModelo() {

		Usuario modelo = new Usuario();
		JTextField id = viewes.TelaInicial.getTextID();
		JTextField nome = viewes.TelaInicial.getTextNome();
		JTextField cargo = viewes.TelaInicial.getTextCargo();
		JTextField salario = viewes.TelaInicial.getTextSalario();
		JTextField telefone = viewes.TelaInicial.getTextTelefone();
		JTextField endereco = viewes.TelaInicial.getTextEndereco();

		// sempre seguir a assinatura do construtor
		modelo = new Usuario();

		return modelo;

	}

}

/* Integer, String, String, String, Integer, String */