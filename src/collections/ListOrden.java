package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOrden {
    public static void main(String[] args) {
        List<Cat> myCats = new ArrayList<>(){{
            add(new Cat("Jon", 18, "yellow"));
            add(new Cat("Simba", 6, "tiger"));
            add(new Cat("Jon", 22, "black"));
        }};
        System.out.println("Insertion Order: ");
        System.out.println(myCats);

        System.out.println("\nRandom order: ");
        Collections.shuffle(myCats);
        System.out.println(myCats);

        System.out.println("\nNatural Order");
        Collections.sort(myCats);
        System.out.println(myCats);

        System.out.println("\nAge Order: ");
        Collections.sort(myCats, new ageComparator());
        //myCats.sort(new ageComparator());
        System.out.println(myCats);

        System.out.println("\nColor order: ");
        myCats.sort(new colorComparator());
        System.out.println(myCats);

        System.out.println("\nname/color/age order: ");
        myCats.sort(new ComparatorNameColorAge());
        System.out.println(myCats);

    }
}

class Cat implements Comparable<Cat> {
    private String name;
    private int age;
    private String collor;

    public Cat(String name, int age, String collor){
        this.name = name;
        this.age = age;
        this.collor = collor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCollor() {
        return collor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", collor='" + collor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat gato){
        return this.getName().compareToIgnoreCase(gato.getName());
    }
}

class ageComparator implements Comparator<Cat>{

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}

class colorComparator implements Comparator<Cat>{

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getCollor().compareToIgnoreCase(cat2.getCollor());
    }
}

class ComparatorNameColorAge implements Comparator<Cat>{

    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        if (name != 0) return name;

        int color = cat1.getCollor().compareToIgnoreCase(cat2.getCollor());
        if (color != 0) return color;

        return Integer.compare(cat1.getAge(), cat2.getAge());

    }
}
