import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner temcupom = new Scanner(System.in);
        String[] produtos = {
                "[1] Smartphone Samsung Galaxy S21",
                "[2] Notebook Dell Inspiron 15 3000",
                "[3] Televisão LG 55\" 4K Ultra HD",
                "[4] Cafeteira Nespresso Essenza Mini",
                "[5] Fone de Ouvido Bluetooth Sony WH-1000XM4",
                "[6] Relógio Smartwatch Apple Watch Series 6",
                "[7] Console de Videogame PlayStation 5",
                "[8] Câmera Digital Canon EOS Rebel T7",
                "[9] Aspirador de Pó Robô Roomba 960",
                "[10] Batedeira Planetária KitchenAid"
        };

        double[] precos = {
                3500.00,
                4000.00,
                3200.00,
                450.00,
                1800.00,
                2700.00,
                4500.00,
                3000.00,
                2500.00,
                2000.00
        };

        Scanner scan = new Scanner(System.in);
        int esc;


        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
            System.out.println("Preço: R$" + String.format("%.2f", precos[i]));
            System.out.println();
        }


        do {
            System.out.print("Digite o número do produto desejado (1-10): ");
            esc = scan.nextInt();
        } while (esc < 1 || esc > 10);


        System.out.println("Você selecionou: " + produtos[esc - 1]);
        System.out.println("Preço: R$" + String.format("%.2f", precos[esc - 1]));
        System.out.print("Vc tem um cupom [S] ou [N] ? ");
        String temcup = temcupom.next();
        if (temcup.equalsIgnoreCase("S") || temcup.equalsIgnoreCase("sim")) {
            System.out.print("Digite o cupom: ");
            String applycupom = temcupom.next();
            if (applycupom.equals("DEZ") || applycupom.equals("DESCONTAO10")) {
                double PrecoFinal = precos[esc - 1];
                double desconto = PrecoFinal * 0.90;
                System.out.println("Cupom aplicado com sucesso! O preço com desconto é de: R$" + desconto);
            } else if (applycupom.equals("VINTE20") || applycupom.equals("DESCONTO20")) {
                double PrecoFinal = precos[esc - 1];
                double desconto20 = PrecoFinal*0.80;
                System.out.println("Cupom aplicado com sucesso! O preço com desconto é de: R$" + desconto20);
            }
        } else{
                System.out.println("O preço final continua R$" +precos[esc-1]); 
            }

        }
}
