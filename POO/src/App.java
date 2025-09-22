import java.util.Scanner;
import PlanosAssinatura.*;
import PlanosAssinatura.Planos.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        while (true) {
            System.out.println("\n=== GERENCIADOR DE PLANOS DE ASSINATURA ===");
            System.out.println("1. Visualizar Plano Básico");
            System.out.println("2. Visualizar Plano Premium");
            System.out.println("3. Visualizar Plano Enterprise");
            System.out.println("4. Calcular Preço Anual de um Plano");
            System.out.println("5. Listar Benefícios do Plano Básico");
            System.out.println("6. Simular Troca de Plano");
            System.out.println("7. Comparar Preços dos Planos");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer
            
            switch (opcao) {
                case 1:
                    PlanoBasico basico = new PlanoBasico("Básico", 50.0, 3, 25.0);
                    basico.exibirDetalhes();
                    break;
                    
                case 2:
                    PlanoPremium premium = new PlanoPremium("Premium", 100.0, 10, 100.0, true, true, true);
                    premium.exibirDetalhes();
                    break;
                    
                case 3:
                    PlanoEnterprise enterprise = new PlanoEnterprise("Enterprise", 300.0, 100, 1000.0, true, true, true, true, true, true);
                    enterprise.exibirDetalhes();
                    break;
                    
                case 4:
                    System.out.println("\nQual plano deseja calcular o preço anual?");
                    System.out.println("1. Plano Básico");
                    System.out.println("2. Plano Premium");
                    System.out.println("3. Plano Enterprise");
                    System.out.print("Escolha: ");
                    int escolhaPlano = scanner.nextInt();
                    
                    switch (escolhaPlano) {
                        case 1:
                            PlanoBasico basicoCalc = new PlanoBasico("Básico", 50.0, 3, 25.0);
                            System.out.println("Preço anual do Plano Básico: R$ " + basicoCalc.CalcularPrecoAnual());
                            break;
                        case 2:
                            PlanoPremium premiumCalc = new PlanoPremium("Premium", 100.0, 10, 100.0, true, true, true);
                            System.out.println("Preço anual do Plano Premium: R$ " + premiumCalc.CalcularPrecoAnual());
                            break;
                        case 3:
                            PlanoEnterprise enterpriseCalc = new PlanoEnterprise("Enterprise", 300.0, 100, 1000.0, true, true, true, true, true, true);
                            System.out.println("Preço anual do Plano Enterprise: R$ " + enterpriseCalc.CalcularPrecoAnual());
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                    break;
                    
                case 5:
                    PlanoBasico basicoBeneficios = new PlanoBasico("Básico", 50.0, 3, 25.0);
                    System.out.println("\n" + basicoBeneficios.listarBeneficios());
                    break;
                    
                case 6:
                    System.out.println("\nSimular troca de plano:");
                    System.out.println("1. Do Básico para outro plano");
                    System.out.println("2. Do Premium para outro plano");
                    System.out.print("Escolha: ");
                    int tipoTroca = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    
                    if (tipoTroca == 1) {
                        PlanoBasico basicoTroca = new PlanoBasico("Básico", 50.0, 3, 25.0);
                        System.out.print("Para qual plano deseja trocar? (Premium/Enterprise): ");
                        String novoPlano = scanner.nextLine();
                        PlanosAssinatura planoTrocado = basicoTroca.trocarPlano(novoPlano);
                        System.out.println("Troca realizada! Novo plano: " + planoTrocado.getNome());
                        System.out.println("Novo preço mensal: R$ " + planoTrocado.getPrecoMensal());
                    } else if (tipoTroca == 2) {
                        PlanoPremium premiumTroca = new PlanoPremium("Premium", 100.0, 10, 100.0, true, true, true);
                        System.out.print("Para qual plano deseja trocar? (Básico/Enterprise): ");
                        String novoPlano = scanner.nextLine();
                        PlanosAssinatura planoTrocado = premiumTroca.trocarPlano(novoPlano);
                        System.out.println("Troca realizada! Novo plano: " + planoTrocado.getNome());
                        System.out.println("Novo preço mensal: R$ " + planoTrocado.getPrecoMensal());
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                    
                case 7:
                    PlanoBasico basicoComp = new PlanoBasico("Básico", 50.0, 3, 25.0);
                    PlanoPremium premiumComp = new PlanoPremium("Premium", 100.0, 10, 100.0, true, true, true);
                    PlanoEnterprise enterpriseComp = new PlanoEnterprise("Enterprise", 300.0, 100, 1000.0, true, true, true, true, true, true);
                    
                    System.out.println("\n=== COMPARAÇÃO DE PREÇOS ===");
                    System.out.println("Plano Básico - Mensal: R$ " + basicoComp.getPrecoMensal() + " | Anual: R$ " + basicoComp.CalcularPrecoAnual());
                    System.out.println("Plano Premium - Mensal: R$ " + premiumComp.getPrecoMensal() + " | Anual: R$ " + premiumComp.CalcularPrecoAnual());
                    System.out.println("Plano Enterprise - Mensal: R$ " + enterpriseComp.getPrecoMensal() + " | Anual: R$ " + enterpriseComp.CalcularPrecoAnual());
                    break;
                    
                case 8:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}