package collections;
import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        /*
        //List<Double> notas = new ArrayList<>();
        List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 5d, 7d, 8.9, 4d);
        notas.add(20d);
        System.out.println(notas);
        */

        System.out.println("\nShow a list with all results");
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 5d, 7d, 8.9, 4d));
        List<Double> notas = new java.util.ArrayList<Double>();
        notas.add(5d);notas.add(20d);notas.add(8d);notas.add(5.4);notas.add(9.5);
        System.out.println(notas);

        System.out.println("Show the position of 20d on the Array List: " + notas.indexOf(20d));

        System.out.println("\nNow include a grade 7.4 in 4th position in array list");
        notas.add(4,7.4);
        System.out.println(notas);

        System.out.println("\nNow replace de 5th note with 8.3 grade");
        notas.set(5, 8.3);
        System.out.println(notas);

        System.out.println("\nNow check if the grade 9.5 still inside de arraylist\nIs on the list? " + notas.contains(9.5));

        System.out.println("\nforeach to print all the grade separately:");
        for (Double i:notas) System.out.println(i);

        System.out.println("\nNow show the 3thr grade inserted in the list: " + notas.get(2));

        System.out.println("\nNow show the smallest grade: " + Collections.min(notas));

        System.out.println("\nNow show the biggest grade: " + Collections.max(notas));

        System.out.println("\nNow show print the som of all values: ");
        Iterator<Double> iterator = notas.iterator();
        double som  =0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            som += next;
        }
        System.out.print(som);
        System.out.println("\n\nPrint the average of list: " + (som/notas.size()));

        System.out.println("\nRemove the first grade: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("\nPrint all grades bigger than 8.0: ");
        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 8){
                iterator2.remove();
            }
        }
        System.out.print(notas);

        System.out.println("\n\nBtw, erase the hole list");
        notas.clear();
        System.out.println("The list is already empty?" + notas.isEmpty());
    }
}
