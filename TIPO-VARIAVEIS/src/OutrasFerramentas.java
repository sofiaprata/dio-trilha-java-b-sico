public class OutrasFerramentas {
    
    public static void main(String[] args) {
        String nomeUm = "Sofia";
        String nomeDois = new String("Sofia");
        //criou dois objetos de mesmo valor mas localizados em cantos diferentes.

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 == numero2){ //true
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);
    }
}
