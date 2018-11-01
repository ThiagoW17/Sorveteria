
public class Doce extends ItemSobremesa {
	private Double peso;
	private int precoPorQuilo;

	public Doce(String nome, Double peso, int precoPorQuilo) {
		super(nome);
		setPeso(peso);
		setPrecoPorQuilo(precoPorQuilo);
	}
	@Override
	public int getCusto() {
		return (int) Math.round(getPeso() * getPrecoPorQuilo());
	}
	@Override
	public String toString() {
	  return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(),
	    Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public int getPrecoPorQuilo() {
		return precoPorQuilo;
	}
	public void setPrecoPorQuilo(int precoPorQuilo) {
		this.precoPorQuilo = precoPorQuilo;
	}
}
