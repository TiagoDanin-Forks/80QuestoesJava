import javax.swing.JOptionPane;

public class Q43 {
	/**
		43. Faça um programa que leia um número de 0 e 60 e exiba na tela o seu sucessor, sabendo que o
		sucessor de 60 a 0. Não pode ser utilizado nem um comando de seleção e repetição.
	*/

	private static int ler () {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número (0...60): "));
		if (numero < 0 || numero > 60) {
			return ler();
		}

		return numero;
	}

	public static void main (String[] args) {
		int numero = ler();
		int sucessor = (numero + 1) % 61;

		String text = "Sucessor de " + numero + " é " + sucessor + "!";
		JOptionPane.showMessageDialog(null, text);
	}
}
