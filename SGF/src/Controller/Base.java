package Controller;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Usuario;

public class Base {
	//criando um NasMap para armazenar os dados do usuario
	static Map<Integer, Usuario> cadastro = new HashMap<Integer, Usuario>();

	public Map<Integer, Usuario> getCadastro() {
		return cadastro;
	}

	public void setCadastro(Map<Integer, Usuario> cadastro) {
		this.cadastro = cadastro;
	}
	// realiza a captura dos dados inseridos pelo usuario
	public static Usuario obterModelo() {

		Usuario modelo = new Usuario(null, null, null, null, null, null);
		JTextField id = viewes.TelaInicial.getTextID(modelo);
		JTextField nome = viewes.TelaInicial.getTextNome(modelo);
		JTextField cargo = viewes.TelaInicial.getTextCargo(modelo);
		JTextField salario = viewes.TelaInicial.getTextSalario(modelo);
		JTextField telefone = viewes.TelaInicial.getTextTelefone(modelo);
		JTextField endereco = viewes.TelaInicial.getTextEndereco(modelo);

		//recebe os dados salva e salva em modelo
		modelo = new Usuario(id,nome,cargo,salario,telefone,endereco);

		return modelo;

	}
	
	
}


/* Integer, String, String, String, Integer, String */