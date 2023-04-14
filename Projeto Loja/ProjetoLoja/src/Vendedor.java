public class Vendedor extends Empregado implements Salario{
    
    private double totalDasVendas;
    private double comissao;
    
    public Vendedor(String nome, String cpf, String matricula, double totalDasVendas, double comissao) {
        super(nome, cpf, matricula);
        this.totalDasVendas = totalDasVendas;
        this.comissao = comissao;
    }

    public double getTotalDasVendas() {
        return totalDasVendas;
    }

    public void setTotalDasVendas(double totalDasVendas) {
        this.totalDasVendas = totalDasVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return this.totalDasVendas * this.comissao;
    }
    
    
    
}
