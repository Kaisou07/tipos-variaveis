public class Operadores {
    public static void main(String[] args){
        int numero1 = 1;
        int numero2 = 2;    
        String nomeUm = "Kaique";
        String nomeDois = "Kaique";
        String nomeUmEqual = "Kaique";
        String nomeDoisEqual = new String("Kaique");

        boolean simNao = numero1 == numero2;

        System.out.println("numero 1 eh igual numero 2? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numero 1 eh menor que o numero 2? " + simNao);

        if(numero1 > numero2){
            System.out.println("condicao verdadeira");
        }

        if(nomeUm == nomeDois){
            System.out.println("Nomes Sao Iguais");
        }
        
        if(nomeUmEqual.equals(nomeDoisEqual)){
            System.out.println("Nomes Sao Iguais (equals compara o conteudo do objeto)");
        };
    }
}

