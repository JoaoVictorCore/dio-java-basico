public class Nomecompleto {


//Aplicando variaveis
public static void main(String[] args) {
    String primeiroNome = "";

    String segundoNome = "";



    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);



}

//Aplicando metodos
public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}