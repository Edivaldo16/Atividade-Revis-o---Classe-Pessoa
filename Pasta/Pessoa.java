package revisao;

import javax.swing.JOptionPane;

public class Pessoa {
	private int ID = 0;


	//Métodos

	//Status
	public void status(Cadastro cadastro) {
		JOptionPane.showConfirmDialog(null, "Prazer meu nome é " + cadastro.getNome());
		JOptionPane.showConfirmDialog(null, "Sou o/a "+ this.getID() + "ª" +" participante desse cadastro");
		JOptionPane.showConfirmDialog(null, "Sexo: " + cadastro.getSexo());
		JOptionPane.showConfirmDialog(null, "Peso: " + cadastro.getPeso());
		JOptionPane.showConfirmDialog(null, "Idade: " + cadastro.getIdade());
	}
	//Andar
	public void andar()
	{
		System.out.println("Estou pelas mediações de Recife");
	}
	
	public void comer(Cadastro cadastro){
		System.out.println("Queria comer algo diferente pode ate ser " + cadastro.getComida());
		}
	//Constructor
	public Pessoa(Cadastro cadastro) {
		
		this.setID(this.getID() + 1); 
		status(cadastro);
		andar();
		comer(cadastro);
		System.out.println();
	}
	
	public Pessoa () {
	}
	
	//Getters and Setters
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}

}
