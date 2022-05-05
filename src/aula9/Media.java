package aula9;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		int[] nota = new int [15];
		int i;
		int total=0;
		double media;
		
		for (i=0; i<15; i++){
			
			nota[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + (i+1)+ " :"));
			total = total + nota[i];
		}
		media = total/nota.length;
		JOptionPane.showMessageDialog(null, "A média  total de notas é :" + media);		
	}

}
