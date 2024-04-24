package Exercito;

public class Medico extends Soldado, implements Curar{
    private int anosExperiencia;
    private int capacidadeEmergencia;

    public Medico(String nome, long cpf, int qtdSoldado, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf, ItemEspecial);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia = anosExperiencia;
    }
    public void setCapacidadeEmergencia(int capacidadeEmergencia){
        this.capacidadeEmergencia = capacidadeEmergencia;
    }
    if(this.tipo != null){
        this.capacidadeEmergencia = this.capacidadeEmergencia + 100;
    }
    @Override
    public void mostraInfo(){
        System.out.println("Anos de experiencia: " this.anosExperiencia);
        System.out.println("Capacidade de emergencia: " = this.capacidadeEmergencia);
    }
    @Override
    public void usandoItem(){
        if(this.tipo != null){
            System.out.println("O Medico " + this.nome + " utilizou o item especial");
        }
        else{
            System.out.println("O Medico " + this.nome + " nao tem item especial para utilizar");
        }
    }
    @Override
    public void curar(){
        if(this.capacidadeEmergencia > 950){
            System.out.println("O Medico " + this.nome + " conseguiu salvar o soldado");
        }
        else{
            System.out.println("O Medico " + this.nome + " nao conseguiu salvar o soldado");
        }
    }
}