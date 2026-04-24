import java.util.ArrayList;
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

    public List<Pacote> getPacotes() {
        return pacotes;
    }

    public void addPacote(Pacote pacote){
        if (getPacotes() == null) {
            pacotes = new ArrayList<>();
        }
        pacotes.add(pacote);
    }
    public void exibirPacotes(){
        System.out.println("Lista dos pacotes: ");
        System.out.println("------------------------");
        for (Pacote i : pacotes){
            System.out.println("ID: " + i.getId());
            System.out.println("Endereco: " + i.getEndereco().getLogradouro() + " - numero: " + i.getEndereco().getNumero());
            System.out.println("Observações: " + i.getObservacao());
            calcularValorFrete();
            System.out.println("Cargas: ");
            i.exibirListCarga();
            System.out.println("===============================================");
        }

    }

    //===============================Métodos================================
    public void calcularValorFrete(){
        valor +=distancia*9.5;
    }

    //=======================================================================
}
