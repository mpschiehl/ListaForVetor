import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// solicitacao de quantidade de registros
		int registro = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Informe a quantidade de registros que você deseja", 
						"Exercicio Vetor com For 03",JOptionPane.QUESTION_MESSAGE));
		double[] precos = new double[registro];
		String texto = "";
		double preco = 0;
		for(int i = 0;i!=registro;i++ ){
			precos[i]= Double.parseDouble(JOptionPane.showInputDialog(null,
					"Informe o "+ (i+1)+"° preço",
					"Exercicio Vetor com for 03",JOptionPane.QUESTION_MESSAGE));
		}
		for(int i = 0;i!=registro;i++ ){
			preco+= precos[i];
		}
		for(int i = 0;i!=registro;i++ ){
			texto+= "   "+precos[i]+"\n";
		}
		JOptionPane.showMessageDialog(null, texto + "+----------\n"+"    "+preco,
				"Exercicio Vetor com for 03",JOptionPane.PLAIN_MESSAGE);

	}

}
