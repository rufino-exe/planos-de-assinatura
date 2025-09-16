package PlanosAssinatura.Planos;

import PlanosAssinatura.PlanosAssinatura;

public class PlanoPremium extends PlanoBasico{
    private boolean suportePrioritario;
    private boolean acessoOffline;
    private boolean backupAutomatico;

    
    public PlanoPremium() {
    }
    public PlanoPremium(String nome, Double precoMensal) {
        super(nome, precoMensal);
    }
    public PlanoPremium(int limiteUsuarios, Double armazenamento) {
        super(limiteUsuarios, armazenamento);
    }
    public PlanoPremium(String nome, Double precoMensal, int limiteUsuarios, Double armazenamento) {
        super(nome, precoMensal, limiteUsuarios, armazenamento);
    }
    public PlanoPremium(int limiteUsuarios, Double armazenamento, boolean suportePrioritario, boolean acessoOffline,
            boolean backupAutomatico) {
        super(limiteUsuarios, armazenamento);
        this.suportePrioritario = suportePrioritario;
        this.acessoOffline = acessoOffline;
        this.backupAutomatico = backupAutomatico;
    }
    public PlanoPremium(String nome, Double precoMensal, int limiteUsuarios, Double armazenamento,
            boolean suportePrioritario, boolean acessoOffline, boolean backupAutomatico) {
        super("Premium", 100.0, limiteUsuarios, armazenamento);
        this.suportePrioritario = true;
        this.acessoOffline = true;
        this.backupAutomatico = true;
    }
    public boolean isSuportePrioritario() {
        return suportePrioritario;
    }
    public void setSuportePrioritario(boolean suportePrioritario) {
        this.suportePrioritario = suportePrioritario;
    }
    public boolean isAcessoOffline() {
        return acessoOffline;
    }
    public void setAcessoOffline(boolean acessoOffline) {
        this.acessoOffline = acessoOffline;
    }
    public boolean isBackupAutomatico() {
        return backupAutomatico;
    }
    public void setBackupAutomatico(boolean backupAutomatico) {
        this.backupAutomatico = backupAutomatico;
    }
     
    public PlanosAssinatura trocarPlano(String planoEscolhido){
        if (planoEscolhido.equalsIgnoreCase("Enterprise")) {
            return new PlanoEnterprise("Enterprise", 300.0, 100, 100.0, true, true, true);
        } else if (planoEscolhido.equalsIgnoreCase("Básico")){
            return new PlanoBasico("Básico", 50.0, 3, 25.0);
        }
        return this;
    }
}
