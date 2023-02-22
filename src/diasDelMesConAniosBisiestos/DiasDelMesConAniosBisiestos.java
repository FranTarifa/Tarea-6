package diasDelMesConAniosBisiestos;

import javax.swing.JOptionPane;

public class DiasDelMesConAniosBisiestos {

public static void main(String[] args) {
		
		int numAño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
		int numMes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes"));

		if(numMes == 11 || numMes == 4 || numMes == 6 || numMes == 9 ) {
			JOptionPane.showMessageDialog(null, "El mes tiene 30 dìas!");
		} else if(numMes == 1 || numMes == 3 || numMes == 5 || numMes == 8 || numMes == 10 || numMes == 12 || numMes == 7) {
			JOptionPane.showMessageDialog(null, "El mes tiene 31 dìas!");
		} else if(numAño % 400 == 0 || (numAño % 4 == 0 && !(numAño % 100 == 0))) {
			JOptionPane.showMessageDialog(null, "El mes tiene 29 dìas!");
		} else {
			JOptionPane.showMessageDialog(null, "El mes tiene 28 dìas!");
		}
	}

}
