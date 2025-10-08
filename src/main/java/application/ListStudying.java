package application;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListStudying {
    public static void main(String[] args){
        
        List<String> list = new ArrayList<>();
        //  Inserindo elementos na lista
        list.add("Maria");
        list.add("Isabel");
        list.add("Jacira");
        list.add("Marlene");
        //  Inserindo um novo elemento na posicao 2
        list.add(2, "Angelice");
        list.add("Adilson");
        
        //  Como saber o tamanho da lista
        System.out.println(list.size());
        
        //  Removendo algum elemento do array
        list.remove(1);
        
        //  Percorrendo todo o array
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("-----------------------------");
        //  Removendo a partir de um predicado
        list.removeIf(x -> x.charAt(0) == 'M');
        for(String x : list){
            System.out.println(x);
        }
        
        System.out.println("-----------------------------");
        //  Para encontrar a posicao de um elemento
        System.out.println("Index of Angelice: " + list.indexOf("Angelice"));
        System.out.println("Index of Isabel: " + list.indexOf("Isabel"));
        System.out.println("-----------------------------");
        //  Para pegar a minha lista filtrando a lista com todos os elementos que comecam com "A"
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x:result){
            System.out.println(x);
        }
        System.out.println("-----------------------------");
        //  Encontrar um elemento da lista que atenda um certo predicado
        String name = list.stream().filter(x -> x.charAt(0)=='Z').findFirst().orElse(null);
        System.out.println(name);
    }
}