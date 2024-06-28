import java.util.Scanner;

public class refino extends materias {

    public refino(String nome, String cidade, double valorunidade, double valortotal) {
        super(nome, cidade, valorunidade, valortotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome:");
        String nome = sc.nextLine();

        System.out.println("Insira a cidade:");
        String cidade = sc.nextLine();

        System.out.println("Insira o valor da unidade:");
        double valorunidade = sc.nextDouble();

        System.out.println("Insira o valor total:");
        double valortotal = sc.nextDouble();


        refino objRefino = new refino(nome, cidade, valorunidade, valortotal);

        // Exibindo os dados do objeto criado usando getters
        System.out.println("Objeto refino criado:");
        System.out.println("Nome: " + objRefino.getNome());
        System.out.println("Cidade: " + objRefino.getCidade());
        System.out.println("Valor da unidade: " + objRefino.getValorunidade());
        System.out.println("Valor total: " + objRefino.getValortotal());
        System.out.println("Quantidade: " + objRefino.getQuantidade());
        sc.close();
    }
}
