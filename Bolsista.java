package heranca2;

public class Bolsista extends Aluno {
	
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	//sobreposto a mensalidade do Bolsista é diferente do aluno
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista! Pagando mensalidade!");
		
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
	
	
}
