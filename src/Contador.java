import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametro2 = terminal.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException exception){
            exception.printStackTrace();
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }
        int contador = parametro2 - parametro1;

        for(int i = 0; i <= contador; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
