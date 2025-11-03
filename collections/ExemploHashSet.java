package collections;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);

        for (Integer i : inteiros) {
            System.out.println(i);
        }

        if(inteiros.contains(3)){
            System.out.println("3 está n a lista");
        }
        inteiros.remove(3);

        if(!inteiros.contains(3)){
            System.out.println("3 não está na lista");
        }


    }
}
