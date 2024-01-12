public class TestaValores {

    public static void main(String[] args) {

        int total = 0;
        Conta conta = new Conta(1337, 24226);
        total++;

        System.out.println(conta.getAgencia());


        conta.setAgencia(55544);

        Conta conta2 = new Conta(1337, 23556);
        Conta conta3 = new Conta(2119, 44556);


        System.out.println(conta2.getTotal());

    }
}

