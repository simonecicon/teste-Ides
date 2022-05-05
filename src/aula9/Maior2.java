package aula9;

import javax.swing.JOptionPane;

public class Maior2 {

	public static void main(String[] args) {
		int tamanho_array = args.length == 1 ? Integer.parseInt(args[0]) : Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da sua lista"));
		int num[] = new int[tamanho_array] ;
		int i;
		int vmax = 0;
		int vmin = 100;
		String listaFinal = "Os números são: \n ";

		
		for (i = 0; i < num.length; i++) {
			 num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número ente 1 e 100:"));
			if (num[i] > vmax) {
				vmax = num[i];

			}

			if (num[i] < vmin) {
				vmin = num[i];
			}
		}
			 for (i=0;i<num.length; i++){ 
				 listaFinal=listaFinal  + num[i]+ " , "; 
				 }
		JOptionPane.showMessageDialog(null, listaFinal + "\nO maior número digitado é : " + vmax + "\nO menor número digitado é : " +  vmin );
	

	}

}
