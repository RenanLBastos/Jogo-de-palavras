public class Jogo_de_palavras {
  /*
  Jogo de palavras.
  Completar os espaços com as palavras pedidas e depois ver como ficara a história.
  */

    public static void main(String[] args){

        String nome1 = "      ";
        String adjetivo1 = "      ";
        String adjetivo2 = "      ";
        String adjetivo3 = "      ";
        String verbo1 = "      ";
        String substantivo1 = "      ";
        String substantivo2 = "      ";
        String substantivo3 = "      ";
        String substantivo4 = "      ";
        String substantivo5 = "      ";
        String substantivo6 = "      ";
        String nome2 = "      ";
        int ano = 0000 ;
        String lugar = "      ";

        String story =  "Esta manhã "+nome1+" acordou se sentindo "+adjetivo1+". 'Vai ser um dia "+adjetivo2+"' La fora,\n" +
                        " um bando de "+substantivo1+"s estavam protestando para manter "+substantivo2+"\n" +
                        " nas lojas. Eles começaram a " +""+verbo1+" no ritmo do "+substantivo3+", o que fez todos \n" +
                        ""+substantivo4+"s muito "+adjetivo3+"." +"Preocupado, "+nome1+" mandou mensagem para "+nome2+",\n" +
                        " que mandou "+nome1+" para "+lugar+" e jogou "+nome1+" em uma poça congelada de "+substantivo5+".\n" +
                        ""+nome1+" acordou no ano "+ano+", em um lugar onde "+substantivo6+"s dominavam o mundo.";

        System.out.println(story);
    }
}
