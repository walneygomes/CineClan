import Subsistemas.Cartao;
import Subsistemas.FactoryIngresso;
import Subsistemas.Ingresso;

public class Cinema {
	private FactoryIngresso ingresso = new FactoryIngresso();

	public Ingresso inserirDinheiro(String tipoIngresso, double valor) {

		Ingresso ingress = this.ingresso.criarIngresso(tipoIngresso, valor);

		if (ingress != null) {
			System.out.println("Seu Troco é :" + (valor - ingress.valor()) + " R$ ");
		}

		return ingress;
	}

	public Ingresso inserirCartao(String tipoIngresso, Cartao cartao) {

		Ingresso ingress = this.ingresso.criarIngresso(tipoIngresso, cartao.getValor());
		if (ingress != null) {
			cartao.setValor(cartao.getValor() - ingress.valor());
		}
		return ingress;
	}

	public void listarFilmes() {
		System.out.println(" FIlmes ");

		for (Ingresso i : this.ingresso.findByListFilmes()) {
			System.out.println("Nome e valor" + i.valor());
			i.nomeFilme();

		}
	}

}
