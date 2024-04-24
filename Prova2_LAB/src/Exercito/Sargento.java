package Exercito;

public class Sargento extends Soldado implements Defesa{
    private String especializacao;
    private int experienciaCombate;

    public Sargento(String nome, long cpf, int qtdSoldado, String especializacao, int experienciaCombate){
        super(nome, cpf, ItemEspecial);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }
    public void setEspecializacao(String especializacao){
        this.especializacao = especializacao;
    }
    public void setExperienciaCombate(int experienciaCombate){
        this.experienciaCombate = experienciaCombate;
    }
    if(this.tipo != null){
        this.experienciaCombate = this.experienciaCombate + 300; // atribuindo mais 300 se tiver item
    }
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especializacao: " + this.especializacao);
        System.out.println("Experiencia em combate: " + this.experienciaCombate);
    }
    @Override
    public void usandoItem(){
        if(this.tipo != null){
            System.out.println("Sargento " + this.nome + " esta usando o item especial");
        }
        else{
            System.out.println("Sargento " + this.nome + " nao tem item especial para utilizar");
        }
    }
    @Override
    public void defender(){
        if(this.experienciaCombate < 650){
            System.out.println("O Sargento " + this.nome + " nao conseguiu se defender");
        }
        else{
            System.out.println("O Sargento " + this.nome + "conseguiu se defender");
        }
    }
}