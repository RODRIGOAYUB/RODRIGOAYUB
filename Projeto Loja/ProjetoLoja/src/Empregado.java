public class Empregado extends Pessoa{
    
    private String matricula;
    
    public Empregado(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome= " + this.getNome() + " cpf= " + this.getCpf() + " matricula=" + this.getMatricula() + '}';
    }
    
}
