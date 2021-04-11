import java.util.Scanner;

public class AreaHexagonoReg {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        double lado, area;

        // Validar o lado.
        do
        {
            System.out.print("Digite o valor do lado do hex�gono regular: ");
            lado = entrada.nextDouble();
            lado = Math.abs(lado);
        } while (lado <= 0);

        area = (3 * lado * lado * Math.sqrt(3)) / 2;

        System.out.println("\n�rea do hex�gono regular: " + area);

        entrada.close();
    }
}
 