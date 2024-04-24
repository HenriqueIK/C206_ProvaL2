package Exercito;

public abstract class Soldado{
    public static int qtdSoldado = 0;
    protected String nome;
    protected long cpf;
    public Soldado(String nome, long cpf, int qtdSoldado){
        qtdSoldado++;
        this.nome = nome;
        this.cpf = cpf;
    }
    public void mostraInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
    }
    public void usandoItem(){
    }
}
