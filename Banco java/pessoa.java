package sistema;

public class pessoa {
    String nome;
    int valorTot;
    
    public pessoa(String nome, int vt){
        this.nome = nome;
        this.valorTot = vt;
    }

    public void Depositar(int valor){
        this.valorTot = valorTot + valor;
    }

    public void Sacar(int saque){
        if(saque > valorTot){
            System.out.println("Quantia indisponivel para saque");
        }else{
        this.valorTot = valorTot - saque;
        }
    }

    public void Emprestimo(int valor){
        System.out.println("Você quer fazer um Emprestimo no valor de "  + valor);
        int valorDevolver = valor * (5/100) * (10/12);
        this.valorTot = valorTot + valor;
        System.out.println("Voce terá 10 parcelas pra devolver um valor de " + valorDevolver);
    }

    public void Status(){
        System.out.println("Seu usuario " + "" + this.nome + "" + "\n Seu valor no Banco " + "R$" + this.valorTot );
    }

    public void Sair(){
        return;
    }
}
