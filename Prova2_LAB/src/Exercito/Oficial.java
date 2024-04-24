package Exercito;

public class Oficial extends Soldado, implements Defesa{
    private String patente;

    public Oficial(String nome, long cpf, int qtdSoldado, String patente){
        super(nome, cpf, qtdSoldado);
        this.patente = patente;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente: " + this.patente);
    }
    @Override
    public void usandoItem(){
        if(this.tipo != null){
            System.out.println("O Oficial " + this.nome + " utilizou o item especial");
        }
        else{
            System.out.println("O Oficial " + this.nome + " nao tem item especial para utilizar");
        }
    }
    @Override
    public void defender(){
        if(this.tipo != null){
            System.out.println("O Oficial " + this.nome + " conseguiu se defender");
        }
        else{
            System.out.println("O Oficial " + this.nome + " nao conseguiu se defender");
        }
    }
}