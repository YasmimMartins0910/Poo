public class Aluno extends Pessoa {
    private String matricula, curso;
    public Aluno(String n, String c, Endereco e, String m, String cur) { 
        super(n, c, e); 
        this.matricula = m; 
        this.curso = cur; 
    }
    @Override public String getDadosEspecificos() { return "Matrícula: " + matricula + " | Curso: " + curso; }
}