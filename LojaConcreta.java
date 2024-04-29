class LojaConcreta extends Loja implements Registro {
	
	String endereco;
	String gerente;
	
	public LojaConcreta(int identificador, String cnpj, String razaoSocial,String endereco, String gerente) {
		super(identificador,cnpj,razaoSocial);
		this.endereco = endereco;
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return super.toString() + "[endereco=" + endereco + ", gerente=" + gerente + "]";
	}

	@Override
	public String registra_abertura_dia() {
		if (!aberta) {
			aberta = true;
			return ("Loja foi aberta com sucesso");
		}
		else return ("Tentativa de abrir uma Loja que já está aberta");
	}

	@Override
	public String registra_fechamento_dia() {
		if (aberta) {
			aberta = false;
			return ("Loja foi fechada com sucesso");
		}
		else return ("Tentativa de fechar uma Loja que não está aberta");
	}	
}
