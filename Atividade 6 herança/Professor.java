public class Professor extends Pessoa {
    private String siape, area;
    public Professor(String n, String c, Endereco e, String s, String a) { 
        super(n, c, e); 
        this.siape = s; 
        this.area = a; 
    }
    @Override public String getDadosEspecificos() { return "SIAPE: " + siape + " | Área: " + area; }
}