public abstract class Loja {
	
	int identificador;
	String cnpj;
	String razaoSocial;
	boolean aberta;
	
	public Loja(int identificador, String cnpj, String razaoSocial) {
		this.identificador = identificador;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.aberta = false;
	}
	
	public String getStatus() {
		if (aberta) return "Aberta";
		else return "Fechada";
	}
	
	public String mostraLoja() {		
		return this.razaoSocial + " - cnpj: " + this.cnpj + " - " +  this.getStatus(); 
	}

	@Override
	public String toString() {
		return "Loja [identificador=" + identificador + ", cnpj=" + cnpj + ", razaoSocial=" + razaoSocial + "]";
	}
}
