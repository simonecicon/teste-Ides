package aula9;

import javax.swing.JOptionPane;

public class vetor {

	public static void main(String[] args) {
		String[]nomeConvidados = new String [10];
		int contador;
		String listaFinal = "Os convidados da festa são: \n ";
		
		for(contador=0;contador<10;contador++){
			nomeConvidados[contador]= JOptionPane.showInputDialog("Digite o " +(contador+1)+ " convidados");
		}
		for(contador=0;contador<10;contador++){
			listaFinal=listaFinal + (contador+1) + " " + nomeConvidados[contador]+ "\n ";
		}
		JOptionPane.showMessageDialog(null, listaFinal);

	}

}
