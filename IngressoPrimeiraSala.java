package Subsistemas;

public class IngressoPrimeiraSala extends Ingresso {

	private static final double VALOR = 9.90;

	@Override
	public void nomeFilme() {
		System.out.print("Vendedor de sonhos");

	}

	@Override
	public void horarios() {
		System.out.println("20:00 hrs");
		System.out.println("21:20 hrs");

	}

	@Override
	public double valor() {
		return VALOR;
	}

}
