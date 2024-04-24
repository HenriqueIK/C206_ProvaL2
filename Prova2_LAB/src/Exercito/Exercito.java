package Exercito;

public class Exercito {
    private String nome;
    private Soldado[] soldados = new Soldado[10];
    public Exercito(String nome){
        this.nome = "Patrulheiros de Santa Rita"
    }
    public void addSoldado(Soldado s){
        for (int i = 0; i < soldados.length; i++) {
            if (soldados[i] != null) {
                soldados[i] = soldados;
                break;
            }
        }
    }
    public void mostraInfo(){
        System.out.println("Nome do exército: " + this.nome);
        System.out.println();
        for (int i = 0; i < soldados.length; i++){
            if (soldados[i] != null){
                if (soldados[i] instanceof Sargento){
                    System.out.println("=================");
                    Sargento sarge = (Sargento) soldados[i];
                    sarge.mostraInfo();
                    sarge.usandoItem();
                    sarge.defender();
                    System.out.println("=================");
                }
                if (soldados[i] instanceof Oficial){
                    System.out.println("=================");
                    Oficial ofc = (Oficial) soldados[i];
                    ofc.mostraInfo();
                    ofc.usandoItem();
                    ofc.defender();
                    System.out.println("=================");
                }
                if (soldados[i] instanceof Medico){
                    System.out.println("=================");
                    Medico doc = (Medico) soldados[i];
                    doc.mostraInfo();
                    doc.usandoItem();
                    doc.curar();
                    System.out.println("=================");
                }
            }
        }
        System.out.println("Soldados presentes no Exército: " + Soldado.qtdSoldado());
    }
}