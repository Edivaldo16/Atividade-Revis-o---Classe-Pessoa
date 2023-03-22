package revisao;

public class Cadastro {
	private String nome;
	private String sexo;
	private Double peso;
	private int idade;
	private String comida;
	
	public String toString() {
		return "\nNome: " +this.getNome() + "\nIdade: " +this.getIdade() + "\nSexo: " +this.getSexo() + "\nPeso: " +this.getPeso() + "\nComida: " +this.getComida() +"\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}

}
