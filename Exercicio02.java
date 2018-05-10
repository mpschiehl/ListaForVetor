import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		int[] idades = new int[7];
		String idade = "";
		for(int i = 0;i != idades.length;i++){
			idades[i]=Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe a " + (i+1) + "ª idade a ser gravado.",
					"Exerciocio Vetor com For 02",JOptionPane.PLAIN_MESSAGE));
			idade += idades[i] +"\n";
		}
		JOptionPane.showMessageDialog(null,idade,"Idades Informadas",JOptionPane.PLAIN_MESSAGE);
	
	}

}
