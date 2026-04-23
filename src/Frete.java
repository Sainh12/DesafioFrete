import java.util.List;

public class Frete {

    //============================Atributos================================
    private Endereco endereco;
    private double valor;
    private double distancia;
    private List<Pacote> pacotes;

    //=======================Getters and Setters===========================
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setValor(double valor){
        this.valor=valor;
    }
    public double getValor(){
        return valor;
    }
    public void setDistancia(double distancia){
        this.distancia=distancia;
    }
    public double getDistancia(){
        return distancia;
    }
    public void removePacote(Pacote pacote){
        pacotes.remove(pacote);
    }
    public void addPacote(Pacote pacote){
        pacotes.add(pacote);
    }
    public void exibirPacotes(){
        System.out.println("Lista dos pacotes: ");
        for (Pacote i : pacotes){
            System.out.println("Endereco: " + i.getEndereco());
            System.out.println("Observações: " + i.getObservacao());
            System.out.println("Cargas: ");
            i.exibirListCarga();
        }

    }

    //===============================Métodos================================
    public void calcularValorFrete(){
        System.out.println("Valor do frete é de: R$" + (distancia*4));
    }

    //=======================================================================
}
