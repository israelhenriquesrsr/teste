package Controller;

import java.util.Map;

import modelo.Usuario;

public class Insercao extends Base {
	@Override
	public void setCadastro(Map<Integer, Usuario> cadastro) {
		// TODO Auto-generated method stub
		super.setCadastro(cadastro);
		cadastro.put(null, obterModelo());
		System.out.println(cadastro);
	}
	
	public void visualiza() {
		
	}

}
