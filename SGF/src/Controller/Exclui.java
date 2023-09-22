package Controller;

import javax.swing.JOptionPane;

import modelo.Usuario;

public class Exclui {
	public void delete() {
		Pesquisa p = new Pesquisa();
		p.busca();
		
		Usuario retornavalor = Base.cadastro.remove(p);
		
		JOptionPane.showConfirmDialog(null, "Dados removidos: " + retornavalor);
	} 
}
