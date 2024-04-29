import javax.swing.JOptionPane;

public class PrincipalLoja {
	
	public static void main(String[] args) {
		
		LojaConcreta loja1 = new LojaConcreta(001, "001002003004", "Loja Fantasma","Av 85 1234", "Samanta Barros"); 
		JOptionPane.showMessageDialog(null, loja1.mostraLoja());
		
		JOptionPane.showMessageDialog(null, loja1.registra_abertura_dia());
		JOptionPane.showMessageDialog(null, loja1.mostraLoja());
		
		JOptionPane.showMessageDialog(null, loja1.registra_abertura_dia());
		JOptionPane.showMessageDialog(null, loja1.mostraLoja());
		
		JOptionPane.showMessageDialog(null, loja1.registra_fechamento_dia());
		JOptionPane.showMessageDialog(null, loja1.mostraLoja());
		
		JOptionPane.showMessageDialog(null, loja1.registra_fechamento_dia());
		JOptionPane.showMessageDialog(null, loja1.mostraLoja());
	}

}
