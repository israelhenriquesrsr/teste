package Controller;

import java.util.Map;

import javax.swing.JOptionPane;

import modelo.Usuario;

public class Insercao {
	public void insere() {
		setCadastro(null);
	}

	public void setCadastro(Map<Integer, Usuario> cadastro) {
		// realiza a inserção dos dados capturados da telainicial
		cadastro.put(null, Base.obterModelo());
		JOptionPane.showConfirmDialog(null, "Cadastro realizado: " + cadastro);
	}
}
