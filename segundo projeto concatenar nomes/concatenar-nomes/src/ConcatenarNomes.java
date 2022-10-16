import java.util.Scanner;

public class ConcatenarNomes {

   
    
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu primeiro nome:");
        String primeiroNome= teclado.nextLine();
        System.out.print("Digite seu sobrenome:");
        String sobrenome = teclado.nextLine();
        String nomeCompleto= nomeCompleto(primeiroNome, sobrenome);
        System.out.println(nomeCompleto);
        
    }
    public static String nomeCompleto (String primeiroNome, String sobrenome) {
        return primeiroNome.concat(" ").concat(sobrenome);


    }
     

}


