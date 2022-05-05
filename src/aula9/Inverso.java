package aula9;

import javax.swing.JOptionPane;

public class Inverso {

	public static void main(String[] args) {
		int num[] = new int[5];
		int i;
		String lfinal = "Os numero em ordem inversa são:\n";

		for (i = 0; i < 5; i++){
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		}
		for(i=4;i>=0;i--){
			lfinal= lfinal + String.valueOf(num[i])+ " \n";
		}
		JOptionPane.showMessageDialog(null, lfinal);
	}

}
