//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Carga c1 = new Carga();
        c1.setDescricao("Pacote Pizza Combo 1");
        c1.setMassa(5);

        Carga c2 = new Carga();
        c2.setDescricao("Pacote Esfirra Combo 1");
        c2.setMassa(10);

        Carga c3 = new Carga();
        c3.setDescricao("Pizza Muzzarela");
        c3.setMassa(1);

        Carga c4 = new Carga();
        c4.setDescricao("X-Salada");
        c4.setMassa(2);

        Carga c5 = new Carga();
        c5.setDescricao("Pastel Super Queijo");
        c5.setMassa(3);

        Endereco er = new Endereco();
        er.setLogradouro("Rua Sem Nome");
        er.setNumero(20);

        Endereco ee1 = new Endereco();
        ee1.setLogradouro("Rua Destino1");
        ee1.setNumero(10);

        Endereco ee2 = new Endereco();
        ee2.setLogradouro("Rua Destino2");
        ee2.setNumero(20);

        Endereco ee3 = new Endereco();
        ee3.setLogradouro("Rua Destino3");
        ee3.setNumero(30);

        //Preparando o primeiro pacote massatotal = 9
        Pacote p1 = new Pacote();
        p1.setId(1);
        p1.addListCarga(c1);
        p1.addListCarga(c5);
        p1.addListCarga(c3);
        p1.setEndereco(ee1);
        p1.setObservacao("Perto do gelo quente");


        //Preparando o segundo pacote massatotal = 25
        Pacote p2 = new Pacote();
        p2.setId(6);
        p2.addListCarga(c2);
        p2.addListCarga(c4);
        p2.addListCarga(c1);
        p2.addListCarga(c2);
        p2.setEndereco(ee2);
        p2.setObservacao("Perto do curva reta");
        p2.removeCarga(c4);


        //Preparando o segundo pacote massatotal = 4
        Pacote p3 = new Pacote();
        p3.setId(54);
        p3.addListCarga(c3);
        p3.addListCarga(c5);
        p3.setEndereco(ee3);
        p3.setObservacao("Perto da agua seca");



        Frete f = new Frete();
        f.setEndereco(er);
        f.addPacote(p1);
        f.addPacote(p2);
        f.addPacote(p3);
        f.setDistancia(2);


        f.exibirPacotes();

        f.calcularValorFrete();
        System.out.println("\n\nValor Frete: " + f.getValor());

    }
}
