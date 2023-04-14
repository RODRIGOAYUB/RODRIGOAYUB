public class Cliente extends Pessoa {
    
    private double valorDivida;
    
    public Cliente(String nome, String cpf, double valorDivida) {
        super(nome, cpf);
        this.valorDivida = valorDivida;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome= " + this.getNome() + " cpf= " + this.getCpf() + " valorDivida=" + valorDivida + '}';
    }
        
}
