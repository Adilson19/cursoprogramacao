public class FuncoesInteressantesString {
    public static void main(String[] args){
        
        String original = "abcde FGHIJ ABC abc DEFG   ";
        //  toLowerCase() -> funcao usada para colocar toda String em minuscula
        String s01 = original.toLowerCase();
        //  toLoweCase() -> funcao usada para colocar toda String em maiuscula
        String s02 = original.toUpperCase();
        //  trim() -> funcao usada para retirar todos os espacos da String
        String s03 = original.trim();
        //  substring(inicio) -> funcao usada para marcar o inicio de uma String
        String s04 = original.substring(2);
        //  substring(inicio, fim) -> funcao usada para recortar as Strings marcadas do inicio ao fim
        String s05 = original.substring(2, 9);
        //  replace (valor presente, valor a substituir) -> funcao usada para substituir os valores da String pelo valor que iremos colocar
        String s06 = original.replace('a', 'x');
        //  replace para uma substring
        String s07 = original.replace("abc", "xy");
        //  indexOf() -> retorna a posicao da primeira aparicao da String em questao
        int i = original.indexOf("bc");
        //  lastIndexOf() -> retorna a posicao da ultima aparicao da String em questao 
        int j = original.lastIndexOf("bc");
        String s = "potato apple lemon";
        //  split(" ") -> serve para recortar a String
        String[] vect = s.split(" ");
        
        System.out.println("Original: -" + original+"-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): " + s04 + "-");
        System.out.println("substring(2, 9): " + s05 + "-");
        System.out.println("replace('a', 'b'): " + s06 + "-");
        System.out.println("replace('abc', 'xy'): " + s07 + "-");       
        System.out.println("Index of 'bc': " + i);
        System.out.println("Last index of 'bc': " + j);
        System.out.println("----------------------------------");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}