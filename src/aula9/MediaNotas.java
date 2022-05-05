package aula9;

import javax.swing.JOptionPane;

public class MediaNotas {

	public static void main(String[] args) {
		double[] nota = new double[5];
		int i;
		double total = 0;
		double media;
		

		for (i = 0; i < 5; i++) {
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + " :"));
			total = total + nota[i];
		}
		media = total / nota.length;
		
		if (media >= 5) {
			JOptionPane.showMessageDialog(null, "Passou de Módulo");
		} else {
			JOptionPane.showMessageDialog(null, "Não Passou de Módulo");
		}
	}

}
