/**
 * Sundae
 */
public class Sundae extends Sorvete {
	private String calda;
	private int custoDaCalda;
	public Sundae(String nome, int custoSorvete, String calda, int custoDaCalda) {
		super(nome, custoSorvete);
		setCalda(calda);
		setCustoDaCalda(custoDaCalda);
	}
	@Override
	public int getCusto() {
		return Math.round(getCustoSorvete() + getCustoDaCalda());
	}
	@Override
	public String toString() {
	  return String.format("Sundae de %s com\n%-25s %6s", getCalda(),
	    getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	public String getCalda() {
		return calda;
	}
	public void setCalda(String calda) {
		this.calda = calda;
	}
	public int getCustoDaCalda() {
		return custoDaCalda;
	}
	public void setCustoDaCalda(int custoDaCalda) {
		this.custoDaCalda = custoDaCalda;
	}
}
