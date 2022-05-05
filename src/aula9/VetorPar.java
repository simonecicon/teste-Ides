package aula9;

import javax.swing.JOptionPane;

public class VetorPar {

	public static void main(String[] args) {
		int num[] = new int[5];
		int i;
		int mult;
		String mensagem = "Os números são:\n";
	
		for (i = 0; i < 5; i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		}
		
		
		for (i = 0; i < 5; i++) {
			if (num[i] % 2 == 0) {
				mult = num[i] * 2;
				mensagem = mensagem + (i+1) + ": " + mult + " É par\n";
				//System.out.println((i+1) + ": " + mult + " É par");
				//JOptionPane.showMessageDialog(null, (i+1) + ": " + mult + " É par");
			}else {
				mensagem = mensagem + (i+1) + ": " + num[i] + " É impar\n";
				//JOptionPane.showMessageDialog(null, (i+1) + ": " + num[i] + " É impar" );
				//System.out.println((i+1) + ": " + num[i] + " É impar" );
			}
		}
		JOptionPane.showMessageDialog(null, mensagem);
			
		}

}
