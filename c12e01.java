package Exerci_MOD3;
import java.util.Scanner; 
public class c12e01 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int vet[]= new int[10];
    int qntImpar=0;
    for(int aux=0; aux<vet.length;aux++){
        System.out.print("informe um número inteiro: ");
        vet[aux]=teclado.nextInt();

    }
    for(int aux=0;aux<vet.length;aux++){
    if(vet[aux] % 5 ==0 && vet[aux] % 7 == 0){
        qntImpar++;
    }
    }
    System.out.println("A quantidade de numeros divisiveis por 5 e 7 ao mesmo tempo é de= "+qntImpar);
    teclado.close();
}
}
