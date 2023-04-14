import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoLoja {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        ArrayList<Pessoa> pessoas = new ArrayList(); // Estrutura de dados que ira armazenar os usuarios do sistema
        
        System.out.println("#########################");
        System.out.println("Bem Vindo ao Sistema Loja");
        System.out.println("#########################");
        System.out.println("\n\n\n");
        
        int opc, opc_cad, opc_rem;
        boolean encontrou;
        String nome, cpf, matricula;
        double salario, bonus, totalDasVendas, comissao, valorDivida;
        
        boolean finalizar = false; // indica se a execucao deve encerar
        
        while(finalizar == false){
            // Menu principal
            System.out.println("Digite: \n 1 - Cadastrar Empregado \n 2 - Cadastrar Cliente \n 3 - Pesquisar \n 4 - Listar Empregados \n 5 - Listar Clientes \n 6 - Remover \n 7 - Finalizar");
            opc = read.nextInt();
            switch (opc) {
                case 1 : // Cadastra empregado
                    // Submenu
                    System.out.println("Digite: \n 1 - Cadastrar Gerente \n 2 - Cadastrar Vendedor");
                    opc_cad = read.nextInt();
                    switch (opc_cad) {
                        case 1: // Cadastra Gerente
                            System.out.print("Digite o nome: ");
                            nome = read.nextLine(); // ignora a quebra de linha
                            nome = read.nextLine();
                            System.out.print("Digite o cpf: ");
                            cpf = read.nextLine();
                            System.out.print("Digite a matricula: ");
                            matricula = read.nextLine();
                            System.out.print("Digite o salario: ");
                            salario = read.nextDouble();
                            System.out.print("Digite o bonus: ");
                            bonus = read.nextDouble();
                            pessoas.add(new Gerente(nome, cpf, matricula, salario, bonus));
                            System.out.println("Cadastro realizado com sucesso!");
                            break;
                        case 2: // Cadastra Vendedor
                            System.out.print("Digite o nome: ");
                            nome = read.nextLine();
                            nome = read.nextLine();
                            System.out.print("Digite o cpf: ");
                            cpf = read.nextLine();
                            System.out.print("Digite a matricula: ");
                            matricula = read.nextLine();
                            System.out.print("Digite o total das vendas: ");
                            totalDasVendas = read.nextDouble();
                            System.out.print("Digite a comissao: ");
                            comissao = read.nextDouble();
                            pessoas.add(new Vendedor(nome, cpf, matricula, totalDasVendas, comissao));                            
                            System.out.println("Cadastro realizado com sucesso!");
                            break;
                        default: 
                            System.out.println("Opção Inválida!");
                    }
                    break;
                case 2: // Cadastra cliente
                    System.out.print("Digite o nome: ");
                    nome = read.nextLine();
                    nome = read.nextLine();
                    System.out.print("Digite o cpf: ");
                    cpf = read.nextLine();
                    System.out.print("Digite o valor da divida: ");
                    valorDivida = read.nextDouble();
                    pessoas.add(new Cliente(nome, cpf, valorDivida));
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                case 3: // Busca pessoa por cpf
                    System.out.print("Digite o cpf: ");
                    cpf = read.nextLine();
                    cpf = read.nextLine();
                    encontrou = false;
                    for (int i = 0; i < pessoas.size(); i++) {
                        if(cpf.equals(pessoas.get(i).getCpf())){
                            System.out.println(pessoas.get(i).toString());
                            encontrou = true;
                            break;
                        }
                    }
                    if(encontrou == false){
                        System.out.println("CPF não cadastrado!");
                    }
                    break;
                case 4: // Imprime todos os empregados
                    for (int i = 0; i < pessoas.size(); i++) {
                        if(pessoas.get(i) instanceof Empregado){
                            System.out.println(pessoas.get(i).toString());
                        }
                    }
                    break;
                case 5: // Imprime todos os clientes
                    for (int i = 0; i < pessoas.size(); i++) {
                        if(pessoas.get(i) instanceof Cliente){
                            System.out.println(pessoas.get(i).toString());
                        }
                    }
                    break;
                case 6: // Remocao
                    System.out.print("Digite o cpf: ");
                    cpf = read.nextLine();
                    cpf = read.nextLine();
                    encontrou = false;
                    for (int i = 0; i < pessoas.size(); i++) {
                        if(cpf.equals(pessoas.get(i).getCpf())){
                            System.out.println("Deseja remover " + pessoas.get(i).toString() + "? Se sim, digite 1");
                            opc_rem = read.nextInt();
                            if(opc_rem == 1){
                                pessoas.remove(pessoas.get(i));
                                System.out.println("Remoção realizada com sucesso!");
                            }
                            encontrou = true;
                            break;
                        }
                    }
                    if(encontrou == false){
                        System.out.println("CPF não cadastrado!");
                    }
                    break;
                case 7: // Sair do sistema
                    finalizar = true;
                    break;
                default: 
                    System.out.println("Opção Inválida!");
            }
            System.out.println("\n\n\n");
        }
        
        System.err.println("Você saiu do Sistema Loja!");
    }
}
