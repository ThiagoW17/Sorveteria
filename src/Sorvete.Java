public class Sorvete extends ItemSobremesa {
	private int custoSorvete;
	
	public Sorvete(String nome, int custoSorvete) {
		super(nome);
		setCustoSorvete(custoSorvete);
	}
	@Override
	public int getCusto() {
		return Math.round(getCustoSorvete());
	}
	@Override
	public String toString() {
	  return String.format("%-25s %6s", getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	public int getCustoSorvete() {
		return custoSorvete;
	}
	public void setCustoSorvete(int custoSorvete) {
		this.custoSorvete = custoSorvete;
	}
}
