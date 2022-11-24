import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        int op = 2;
        GestorConsultas gestor = new GestorConsultas();





        do {
            System.out.println("================================================");
            System.out.println("0.- Salir del programa");
            System.out.println("1.- Listar los autores o grupos de catalogo");
            System.out.println("2.- Buscar autor o grupo");
            System.out.println("3.- Comprar disco");
            System.out.println("4.- Revender disco");
            System.out.println("================================================");
            String op2 = "";
            int cod = 0;

        op = sc.nextInt();
        switch (op) {

            case 1:
                String [] autores =  gestor.listaAutores();

                for (int i = 0; i<autores.length; i++){
                    System.out.println(autores[i]);
                }

                break;

            case 2 :
                System.out.println(" ");
                System.out.print("Que autor/grupo esta buscando?: ");
                sc.nextLine();
                op2 = sc.nextLine();

                String [] discos =   gestor.buscaAutor(op2);

                for (int i = 0; i<discos.length; i++){
                    System.out.println(discos[i]);
                }




                break;
            case 3 :
                System.out.println(" ");
                System.out.print("Codigo: ");
                cod = sc.nextInt();
                System.out.println(gestor.bajaDisco(cod));



                break;
            case 4 :
                System.out.println(" ");
                System.out.print("Codigo: ");
                cod = sc.nextInt();
                System.out.println(gestor.altaDisco(cod));


                break;
            default:

                gestor.cierraGestor();

                break;

        }

        }while (op != 0);

    }
}
