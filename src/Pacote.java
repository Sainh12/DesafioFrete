import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Pacote {

    //===============================Atributos==============================
    private int id;
    private List<Carga> listcarga;
    private Endereco endereco;
    private String observacao;

    //============================Getters and setters=======================
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setObservacao(String observacao){
        this.observacao=observacao;
    }
    public String getObservacao(){
        return observacao;
    }
    public void setListcarga(List<Carga> listcarga){
        this.listcarga=listcarga;
    }
    public List<Carga> getListcarga(){
        return listcarga;
    }
    public void addListCarga(Carga carga){
        if(listcarga.isEmpty()){
            listcarga = new ArrayList<>();
            listcarga.add(carga);
            return;
        }
        listcarga.add(carga);
    }
    public void removeCarga(Carga carga){
        if (listcarga.contains(carga)) {
            listcarga.remove(carga);
            return;
        }
        System.out.println("Produto não encontrado");
    }
    public void exibirListCarga(){
        System.out.println("Lista de produtos:");
        for (Carga i: listcarga){
            System.out.println("Protudo: " + i.getDescricao());
            System.out.println("Massa: " + i.getMassa());
        }
    }

    //==========================================================================================
}
