package revisao;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestePessoa {
	static ArrayList<Pessoa> c;
	public static void main(String[] args) {
		c = new ArrayList<Pessoa>();
			
		menuCadastro();
				
		}
	public static void menuCadastro() {
		int menu = Integer.parseInt(JOptionPane.showInputDialog(
				"                                   -------------------------------------------------------------------"
						+ "                                            \n                                   |---------------Gerência Banco Fuctura-----------------|"
						+ "                                            \n                                   |------------------------------------------------------------------|"
						+ "                                            \n                                   |-------------Escolha uma das operações--------------|"
						+ "                                            \n                                   |------------------------------------------------------------------|"
						+ "                                            \n                                   |            Opção 1 - Cadastro                                     |"
						+ "                                            \n                                   |            Opção 2 - Listar                                           |"
						+ "                                            \n                                   |            Opção 3 - Sair                                              |"
						+ "                                            \n                                   -------------------------------------------------------------------"
						+ ""));

		switch (menu) {
		case 1:
			cadastro();
			break;
		case 2:
			
			listar();
			break;
		case 3:
			System.out.close();
			break;
	    default:
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			menuCadastro();
			break;
		}
	}
	
	public static void cadastro() {
		Cadastro cd = new Cadastro();
		cd.setNome(JOptionPane.showInputDialog("Nome: "));
		cd.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
		cd.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Peso: ")));
		cd.setSexo(JOptionPane.showInputDialog("Sexo: "));
		cd.setComida(JOptionPane.showInputDialog("Comida: "));
		
		Pessoa pessoa = new Pessoa(cd);
		c.add(pessoa);
		menuCadastro();
	}
	public static void listar() {
		System.out.println(c);
		menuCadastro();
	}
}


