package PlanosAssinatura;

public class PlanosAssinatura {

    private String nome;
    private Double precoMensal;

    //Construtor Vazio
    public PlanosAssinatura() {
    }

    //Construtor Padrão
    public PlanosAssinatura(String nome, Double precoMensal) {
        this.nome = nome;
        this.precoMensal = precoMensal;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoMensal() {
        return precoMensal;
    }

    public void setPrecoMensal(Double precoMensal) {
        this.precoMensal = precoMensal;
    }

    //Método que calcula preço anual do plano
    public Double CalcularPrecoAnual() {
        return precoMensal * 12;
    } 

    //Método da troca de plano
    public PlanosAssinatura trocarPlano(String planoEscolhido) {
        return this;
    }
}
