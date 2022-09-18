package heranca2;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Visitantes v1 = new Visitantes();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		Professor p1 = new Professor();
		p1.setNome("Guanabara");
		p1.setIdade(35);
		p1.setSalario(5.500f);
		
	}

}
