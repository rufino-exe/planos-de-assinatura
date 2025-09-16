import PlanosAssinatura.PlanosAssinatura;
import PlanosAssinatura.Planos.PlanoBasico;

public class App {
    public static void main(String[] args){
        PlanosAssinatura plano = new PlanoBasico("Básico", 50.0, 3, 25.0);
        
        System.out.println("Plano atual: " + plano.getNome());

        plano = plano.trocarPlano("Premium");
        System.out.println("Upgrade realizado com sucesso! Novo plano: " + plano.getNome());

        plano = plano.trocarPlano("Enterprise");
        System.out.println("Upgrade realizado com sucesso! Novo plano: " + plano.getNome());

        plano = plano.trocarPlano("Enterprise");
        System.out.println("Plano final: " + plano.getNome());
    }


}
