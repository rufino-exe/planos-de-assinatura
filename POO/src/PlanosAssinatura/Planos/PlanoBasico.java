package PlanosAssinatura.Planos;
import PlanosAssinatura.PlanosAssinatura;

public class PlanoBasico extends PlanosAssinatura {
    private int limiteUsuarios;
    private Double armazenamento;

    
    public PlanoBasico() {
    }
    public PlanoBasico(String nome, Double precoMensal) {
        super(nome, precoMensal);
    }
    public PlanoBasico(int limiteUsuarios, Double armazenamento) {
        this.limiteUsuarios = limiteUsuarios;
        this.armazenamento = armazenamento;
    }
    public PlanoBasico(String nome, Double precoMensal, int limiteUsuarios, Double armazenamento) {
        super( "Básico", 50.0);
        this.limiteUsuarios = 3;
        this.armazenamento = 25.0;
    }


    public int getLimiteUsuarios() {
        return limiteUsuarios;
    }
    public void setLimiteUsuarios(int limiteUsuarios) {
        this.limiteUsuarios = limiteUsuarios;
    }
    public Double getArmazenamento() {
        return armazenamento;
    }
    public void setArmazenamento(Double armazenamento) {
        this.armazenamento = armazenamento;
    }

   
    public String listarBeneficios(){
        return "Benefícios do Plano Básico: Limite de usuários: " + limiteUsuarios + 
               "\nArmazenamento: " + armazenamento;

    }
    
    public PlanosAssinatura trocarPlano (String planoEscolhido){
        if (planoEscolhido.equalsIgnoreCase("Premium")) {
            return new PlanoPremium("Premium", 100.0, 10, 100.0, true, true, true);
        } else if (planoEscolhido.equalsIgnoreCase("Enterprise")) {
            return new PlanoEnterprise("Enterprise", 300.0, 100, 1000.0, true, true, true, true, true, true);
    }
    return this;
}
}