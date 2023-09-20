package modelo;

public class Usuario {
	private int ID;
	private String NomeFuncionario;
	private String Cargo;
	private String Salario;
	private int Telefone;
	private String Endereco;

	public int getID() {
		return ID;
	}

	public int setID(int iD) {
		return ID = iD;
	}

	public String getNomeFuncionario() {
		return NomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		NomeFuncionario = nomeFuncionario;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public String getSalario() {
		return Salario;
	}

	public void setSalario(String salario) {
		Salario = salario;
	}

	public int getTelefone() {
		return Telefone;
	}

	public void setTelefone(int telefone) {
		Telefone = telefone;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
}
