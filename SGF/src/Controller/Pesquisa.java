package Controller;

import javax.swing.JOptionPane;

import modelo.Usuario;
import viewes.TelaInicial;

public class Pesquisa extends Base {
	
	public void busca() {
	//soliita o Id para pesquisa	
	JOptionPane.showInputDialog("Digite o ID para pesquisa: ");
	
		// percorre o hasmap cadastro
		for (Integer key  : cadastro.keySet()) {

			// Capturamos o valor a partir da chave
			Usuario value = cadastro.get(key);

			// bloqueia os textbox antes da edição com os dados da pesquisa
			TelaInicial.getTextID(value).setEnabled(false);
			TelaInicial.getTextNome(value).setEnabled(false);
			TelaInicial.getTextCargo(value).setEnabled(false);
			TelaInicial.getTextSalario(value).setEnabled(false);
			TelaInicial.getTextTelefone(value).setEnabled(false);
			TelaInicial.getTextEndereco(value).setEnabled(false);
		}
		
	}
}