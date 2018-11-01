/**
 * Cookie
 */
public class Cookie extends ItemSobremesa {
	private int numero;
	private int precoPorDuzia;

	public Cookie(String nome, int numero, int precoPorDuzia) {
		super(nome);
		setNumero(numero);
		setPrecoPorDuzia(precoPorDuzia);
	}
	@Override
	public int getCusto() {
		return Math.round((getNumero() * getPrecoPorDuzia()) / 12);
	}
	@Override
	public String toString() {
	  return String.format("%d @ %s /dz\n%-25s %6s", getNumero(),
	    Sorveteria.centavos2ReaisECentavos(getPrecoPorDuzia()), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPrecoPorDuzia() {
		return precoPorDuzia;
	}
	public void setPrecoPorDuzia(int precoPorDuzia) {
		this.precoPorDuzia = precoPorDuzia;
	}
}
