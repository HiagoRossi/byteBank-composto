public class TestaGetESet {

    public static void main(String[] args) {

        Conta conta = new Conta(1337,24226);

        System.out.println(conta.getNumero());

        Cliente Hiago = new Cliente();


        conta.setTitular(Hiago);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Progamador");





    }
}
