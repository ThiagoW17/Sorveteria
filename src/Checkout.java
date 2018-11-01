import java.util.ArrayList;
import java.util.List;

public class Checkout {
	private List<ItemSobremesa> itens;

	public Checkout() {
		itens = new ArrayList<>();
	}

	public void esvazia() {
		itens.clear();
	}

	public void insereItem(ItemSobremesa item) {
		itens.add(item);
	}

	public int numeroDeItens() {
		return itens.size();
	}

	public int custoTotal() {
		int custoTotal = 0;

		for (ItemSobremesa item : itens) {
			custoTotal += item.getCusto();
		}
		return custoTotal;
	}

	public int impostoTotal() {
		double imposto = Sorveteria.IMPOSTO;
		int custoTotal = 0;

		for (ItemSobremesa item : itens) {
			custoTotal += Math.round((item.getCusto() * imposto) / 100);
		}
		return custoTotal;
	}
	/**
	 * Retorna uma string representando o cupom fiscal, da lista de itens atual
	 *
	 * @return uma string representando o cupom fiscal da lista de ItemSobremesa com
	 *         o nome da loja, os itens comprados e o custo total, por exemplo:
	 *
	 *         <pre>
	 *       Sorveteria M & M
	 *     	 ----------------
	*
	 * Sorvete de Morango          1,45
	 * Sundae de Caramelo com
	 * Sorvete de Baunilha         1,55
	 * 1,33 g @ 0,89 /g
	 * Jujuba                      1,18
	 * 4 @ 3,99 /dz
	 * Cookies com gotas de choc   1,33
	 * 1,50 g @ 2,09 /g
	 * Bala puxa-puxa              3,14
	 * 3,00 g @ 1,09 /g
	 * Delicado                    3,27
	 * Imposto                     0,77
	 * Custo Total                12,69
	 *         </pre>
	 */
	@Override
	public String toString() {
		// gera cabeçalho
		String saida = String.format("%24s\n", Sorveteria.NOME_LOJA);
		String linha = "";
		for (int i = 0; i < Sorveteria.NOME_LOJA.length(); i++)
			linha += "-";
		saida += String.format("%24s\n\n", linha);


		for (ItemSobremesa item : itens) {
			saida += item.toString() + "\n";
		}
		saida += String.format("%-25s %6s\n", "Imposto", Sorveteria.centavos2ReaisECentavos(impostoTotal()));
		saida += String.format("%-25s %6s", "Custo Total",
				Sorveteria.centavos2ReaisECentavos(custoTotal() + impostoTotal()));
		return saida;
	}
}
