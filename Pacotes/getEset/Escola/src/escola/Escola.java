package escola;



public class Escola {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setNome("Kevin");
		aluno.setIdade(22);
        aluno.setSexo("M");
		
		System.out.println("O nome do aluno e : " + aluno.getNome() + " ele tem: "+ aluno.getIdade() + " do sexo: " + aluno.getSexo());
	}
}