public class MinhaClasse {
    



    //Variaveis
    public static void main(String[] args) {
        
        String primeiroNome = "Joao";
        String segundoNome = "Victor";


        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }


    //Metodo
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }




}
