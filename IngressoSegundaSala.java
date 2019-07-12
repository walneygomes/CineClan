package Subsistemas;

public class IngressoSegundaSala extends Ingresso {
	private static final double VALOR = 9.90;

	@Override
	public void nomeFilme() {
		System.out.print("Vingadores");

	}

	@Override
	public void horarios() {
		System.out.println("13:00 hrs");
		System.out.println("15:20 hrs");

	}

	@Override
	public double valor() {
		return VALOR;

	}

}
