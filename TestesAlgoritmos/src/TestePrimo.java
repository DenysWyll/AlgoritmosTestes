

import javax.swing.JOptionPane;

public class TestePrimo {


	public static void main(String[] args) {
		while (true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor a ser testado:"));
			System.out.println(isPrimo(num));
		}
	}

	private static String isPrimo(int num) {
		if (num % 2 == 0) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					return (num + " não é primo!");
				}
			}
		} else {
			for (int i = 2; i <= (num - 1) / 2; i++) {
				if (num % i == 0) {
					return (num + " não é primo!");
				}
			}
		}
		return (num + " é primo!");
	}

}
