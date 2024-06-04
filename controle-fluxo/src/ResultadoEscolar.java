import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

//Estrutura de repetição If Else (condicional composta)
        
System.out.println("Digite sua nota: ");
float nota = scanner.nextFloat();
        
    if(nota >= 7)
    System.out.println("Aprovado");
 
    else
    System.out.println("Reprovado");

     }
}
