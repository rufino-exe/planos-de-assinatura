package PlanosAssinatura.Planos;

import PlanosAssinatura.PlanosAssinatura;

public final class PlanoEnterprise extends PlanoPremium{
    private boolean personalizacao;
    private boolean suporte24h;
    private boolean controleAcesso;
    
    public PlanoEnterprise(int limiteUsuarios, Double armazenamento, boolean suportePrioritario, boolean acessoOffline,
            boolean backupAutomatico) {
        super(limiteUsuarios, armazenamento, suportePrioritario, acessoOffline, backupAutomatico);
    }
    public PlanoEnterprise(String nome, Double precoMensal, int limiteUsuarios, Double armazenamento,
            boolean suportePrioritario, boolean acessoOffline, boolean backupAutomatico) {
        super(nome, precoMensal, limiteUsuarios, armazenamento, suportePrioritario, acessoOffline, backupAutomatico);
    }
    public PlanoEnterprise(int limiteUsuarios, Double armazenamento, boolean suportePrioritario, boolean acessoOffline,
            boolean backupAutomatico, boolean personalizacao, boolean suporte24h, boolean controleAcesso) {
        super(limiteUsuarios, armazenamento, suportePrioritario, acessoOffline, backupAutomatico);
        this.personalizacao = personalizacao;
        this.suporte24h = suporte24h;
        this.controleAcesso = controleAcesso;
    }
    public PlanoEnterprise(String nome, Double precoMensal, int limiteUsuarios, Double armazenamento,
            boolean suportePrioritario, boolean acessoOffline, boolean backupAutomatico, boolean personalizacao,
            boolean suporte24h, boolean controleAcesso) {
        super("Enterprise", 300.0, 100, 100.0, true, true, true);
        this.personalizacao = personalizacao;
        this.suporte24h = suporte24h;
        this.controleAcesso = controleAcesso;
    }
    public boolean isPersonalizacao() {
        return personalizacao;
    }
    public void setPersonalizacao(boolean personalizacao) {
        this.personalizacao = personalizacao;
    }
    public boolean isSuporte24h() {
        return suporte24h;
    }
    public void setSuporte24h(boolean suporte24h) {
        this.suporte24h = suporte24h;
    }
    public boolean isControleAcesso() {
        return controleAcesso;
    }
    public void setControleAcesso(boolean controleAcesso) {
        this.controleAcesso = controleAcesso;
    }

    public PlanosAssinatura upgradePlano(){
        return null;
    }
}
   
