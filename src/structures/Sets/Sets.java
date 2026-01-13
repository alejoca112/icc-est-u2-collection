package structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

public class Sets {
    public Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>(); // Constructor hashset
        hashSet.add("A"); // Inicializar las Variables que son Strings(cadena de texto)
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        // Devolver hashSet
        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> linkedhashSet = new LinkedHashSet<>(); // Constructor hashset
        linkedhashSet.add("A"); // Inicializar las Variables que son Strings(cadena de texto)
        linkedhashSet.add("B");
        linkedhashSet.add("C");
        linkedhashSet.add("A");
        linkedhashSet.add("D");
        // Devolver hashSet
        return linkedhashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");
        return treeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Set<String> treeSetConComparador = new TreeSet<>((pal1, pal2) -> pal1.compareToIgnoreCase(pal2));
        treeSetConComparador.add("D");
        treeSetConComparador.add("A");
        treeSetConComparador.add("A");
        treeSetConComparador.add("E");
        treeSetConComparador.add("I");
        treeSetConComparador.add("O");
        treeSetConComparador.add("B");
        System.out.println("a");
        return treeSetConComparador;
    }

    public Set<Person> construirTreeSetConPerson() {
        Set<Person> treeSetPerson = new TreeSet<>((pal1, pal2) -> {
            //int com = Integer.compare(pal1.getAge(), pal2.getAge()); solo edad
            //return pal1.getName().compareTo(pal2.getName()); solo nombre 
            int comName = pal2.getName().compareTo(pal1.getName());
            if(comName != 0){
                return comName;
            }
            int comAge = Integer.compare(pal2.getAge(), pal1.getAge());
            return comAge;
        });
        treeSetPerson.add(new Person("Carlos", 23));
        treeSetPerson.add(new Person("Ana", 30));
        treeSetPerson.add(new Person("Luis", 18));
        treeSetPerson.add(new Person("Ana", 20));
        treeSetPerson.add(new Person("Andres", 23));
        treeSetPerson.add(new Person("Luis", 18));
        return treeSetPerson;
    }
}
