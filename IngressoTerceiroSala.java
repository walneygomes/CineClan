package Subsistemas;

public class IngressoTerceiroSala extends Ingresso {
	private static final double VALOR = 9.90;

	@Override
	public void nomeFilme() {
		System.out.print("X-Men");

	}

	@Override
	public void horarios() {
		System.out.println("15:00 hrs");
		System.out.println("16:20 hrs");

	}

	@Override
	public double valor() {
		return VALOR;

	}

}
