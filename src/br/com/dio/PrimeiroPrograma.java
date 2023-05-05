package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
       int a, b;

       a = 5;
       b = 6;

       String resultado = "";
        if (a==b)
           resultado = "verdadeiro";
        else
           resultado = "falso";

        System.out.println(resultado);




        /*boolean variavel = true;
       System.out.println(!variavel);


        /*int numero = 5;
       //numero++;      //numero + 1;
       // System.out.println(++numero); // se eu quiser que já seja lido diretamente com o incremento, tem que ser colocado antes







       /* String concatenacao = "?";
        System.out.println(concatenacao);
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);


        /*
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);

        /*
        Gato gato = new Gato();
        System.out.println(gato);

        /*int a = 5;
        int b = 3;
        System.out.println("hello world " + (a+b));*/
    }
}
