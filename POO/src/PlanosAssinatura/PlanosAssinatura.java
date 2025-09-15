package PlanosAssinatura;

public class PlanosAssinatura {

    private String nome;
    private Double precoMensal;

    public PlanosAssinatura() {
    }

    public PlanosAssinatura(String nome, Double precoMensal) {
        this.nome = nome;
        this.precoMensal = precoMensal;
    }

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

    public Double CalcularPrecoAnual() {
        return precoMensal * 12;
    } 
}
