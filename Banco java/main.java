package sistema;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira seu nome de Usuario do banco");
        String nome = scan.nextLine();
        pessoa p = new pessoa(nome, 0);
        System.out.println("----------------------------------------------------- \n Olá "+ nome + " \n 1- Depositar \n 2- Sacar \n 3- Emprestimo \n 4- Status \n 5- Sair \n -----------------------------------------------------");
        int res = scan.nextInt();
        if(res == 1){
            System.out.println("----------------------------------------------------- \nInsira o valor do deposito");
            int v = scan.nextInt();
            p.Depositar(v);
            p.Status();
        }else if(res == 2){
            System.out.println("-------------------------------------------------\nInsira o valor do saque");
            int s = scan.nextInt();
            p.Sacar(s);
            p.Status();
        }else if(res == 3){
            System.out.println("------------------------------------------------\nSeçao de imprestimos insira o valor que você deseja");
            int v = scan.nextInt();
            p.Emprestimo(v);
        }else if(res == 4){
            p.Status();
        }else if(res == 5){
            p.Sair();
        }

    }
}
