public class Tecnico extends Pessoa {
    private String registro, setor;
    public Tecnico(String n, String c, Endereco e, String r, String s) { 
        super(n, c, e); 
        this.registro = r; 
        this.setor = s; 
    }
    @Override public String getDadosEspecificos() { return "Registro: " + registro + " | Setor: " + setor; }
}