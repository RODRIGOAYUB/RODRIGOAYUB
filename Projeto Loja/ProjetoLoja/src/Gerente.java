public class Gerente extends Empregado implements Bonus{
    
    private double salario;
    private double bonus;
    
    public Gerente(String nome, String cpf, String matricula, double salario, double bonus) {
        super(nome, cpf, matricula);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcularBonus() {
        return this.salario * this.bonus;
    }
    
    
}
