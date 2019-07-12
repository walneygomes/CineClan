package Subsistemas;

import java.util.ArrayList;

public class FactoryIngresso {
	private static int numeroIngressoSala023 = 341;
	private static int numeroIngressoSala029 = 3;

	public Ingresso criarIngresso(String tipo, double valor) {
		Ingresso ingresso = null;
		if (this.verificadorCompra(tipo, valor)) {
			if (("xmen".equals(tipo))) {
				ingresso = new IngressoSegundaSala();
				ingresso.horarios();
				ingresso.nomeFilme();
				ingresso.valor();
				this.numeroIngressoSala023--;
			} else if ("VendedorSonhos".equals(tipo)) {
				ingresso = new IngressoPrimeiraSala();
				this.numeroIngressoSala029--;
				ingresso.horarios();
				ingresso.nomeFilme();
				ingresso.valor();
			}

		}
		return ingresso;

	}

	private boolean verificadorCompra(String ingresso, double valor) {
		boolean status = false;
		if ((("xmen".equals(ingresso)) && (this.numeroIngressoSala023 > 0))) {
			if (valor > new IngressoPrimeiraSala().valor()) {
				status = true;
			}
		} else if ("VendedorSonhos".equals(ingresso) && (this.numeroIngressoSala029 > 0)) {
			if (valor > new IngressoPrimeiraSala().valor()) {
				status = true;
			}

		}
		return status;
	}

	public ArrayList<Ingresso> findByListFilmes() {
		ArrayList<Ingresso> listaFilmes = new ArrayList<Ingresso>();
		listaFilmes.add(new IngressoTerceiroSala());
		listaFilmes.add(new IngressoPrimeiraSala());
		listaFilmes.add(new IngressoSegundaSala());
		return findByListFilmes();
	}

}
