package PlanosAssinatura.Planos;

import PlanosAssinatura.PlanosAssinatura;

public final class PlanoEnterprise extends PlanoPremium{
    private boolean personalizacao;
    private boolean suporte24h;
    private boolean controleAcesso;
    
    //Construtores Vazios
    public PlanoEnterprise(int limiteUsuarios, Double armazenamento, boolean suportePrioritario, boolean acessoOffline,
            boolean backupAutomatico) {
        super(limiteUsuarios, armazenamento, suportePrioritario, acessoOffline, backupAutomatico);
    }
    public PlanoEnterprise(String nome, Double precoMensal, int limiteUsuarios, Double armazenamento,
            boolean suportePrioritario, boolean acessoOffline, boolean backupAutomatico) {
        super(nome, precoMensal, limiteUsuarios, armazenamento, suportePrioritario, acessoOffline, backupAutomatico);
    }

    //Construtores Padrao
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

    public void exibirDetalhes() {
    System.out.println("\n--- PLANO ENTERPRISE ---");
    System.out.println("Nome: " + getNome());
    System.out.println("Preço Mensal: R$ " + getPrecoMensal());
    System.out.println("Limite de Usuários: " + getLimiteUsuarios());
    System.out.println("Armazenamento: " + getArmazenamento() + " GB");
    System.out.println("Suporte Prioritário: " + (isSuportePrioritario() ? "Sim" : "Não"));
    System.out.println("Acesso Offline: " + (isAcessoOffline() ? "Sim" : "Não"));
    System.out.println("Backup Automático: " + (isBackupAutomatico() ? "Sim" : "Não"));
    System.out.println("Personalização: " + (isPersonalizacao() ? "Sim" : "Não"));
    System.out.println("Suporte 24h: " + (isSuporte24h() ? "Sim" : "Não"));
    System.out.println("Controle de Acesso: " + (isControleAcesso() ? "Sim" : "Não"));
}

    //Getters e Setters
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
   
