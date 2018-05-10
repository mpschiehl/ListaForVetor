import javax.swing.JOptionPane;
public class Exercicio01 {

	public static void main(String[] args) {
		String[] nomes = new String[25];
		for(int i = 0;i != nomes.length;i++){
			nomes[i]=JOptionPane.showInputDialog(null, "Informe o " + (i+1) + " nome a ser gravado.","Exerciocio Vetor com For 01",JOptionPane.PLAIN_MESSAGE);
		}
	}
}
			
		

