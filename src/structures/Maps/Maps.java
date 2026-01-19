package structures.Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class Maps {

    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
        hashMap.put("A", 5);
        hashMap.put("C", 50);
        hashMap.put("D", 5);
        hashMap.put("D", 8);
        hashMap.put("E", 10);
        hashMap.put("F", 12);
        hashMap.put("G", 14);
        hashMap.put("H", 16);
        hashMap.put("I", 18);
        hashMap.put("J", 20);

        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.values().toArray()[i]);
        }
        for (String key : hashMap.keySet()) {
            System.out.println("Llave: " + key + " Valor: " + hashMap.get(key));
        }

        return hashMap;
    }

    public Map<String, Integer> construirLinkedHashMap() {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("A", 5);
        linkedHashMap.put("C", 50);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("D", 8);
        linkedHashMap.put("E", 10);
        linkedHashMap.put("F", 12);
        linkedHashMap.put("G", 14);
        linkedHashMap.put("H", 16);
        linkedHashMap.put("I", 18);
        linkedHashMap.put("J", 20);

        for (int i = 0; i < linkedHashMap.size(); i++) {
            System.out.println(linkedHashMap.values().toArray()[i]);
        }
        for (String key : linkedHashMap.keySet()) {
            System.out.println("Llave: " + key + " Valor: " + linkedHashMap.get(key));
        }

        return linkedHashMap;
    }

    public Map<String, Integer> construirTreeMap() {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("A", 2);
        treeMap.put("B", 3);
        treeMap.put("A", 5);
        treeMap.put("C", 50);
        treeMap.put("D", 5);
        treeMap.put("D", 8);
        treeMap.put("E", 10);
        treeMap.put("F", 12);
        treeMap.put("G", 14);
        treeMap.put("H", 16);
        treeMap.put("I", 18);
        treeMap.put("J", 20);

        for (int i = 0; i < treeMap.size(); i++) {
            System.out.println(treeMap.values().toArray()[i]);
        }
        for (String key : treeMap.keySet()) {
            System.out.println("Llave: " + key + " Valor: " + treeMap.get(key));
        }

        return treeMap;
    }

    public Map<Person, Integer> construirTreeMapPerson() {
        Map<Person, Integer> treeMapPerson = new TreeMap<>();
        treeMapPerson.put(new Person("Carlos", 23), 1000);
        treeMapPerson.put(new Person("Ana", 30), 2000);
        treeMapPerson.put(new Person("Luis", 18), 3000);
        treeMapPerson.put(new Person("Ana", 20), 4000);
        treeMapPerson.put(new Person("Andres", 23), 5000);
        treeMapPerson.put(new Person("Luis", 18), 6000);
        return treeMapPerson;
    }

    public void printFilter(Map<Person, Integer> treePersons) {
        for (Person key : treePersons.keySet()) {
            if (treePersons.get(key) > 2000 && key.getAge() >= 20) {
                System.out.println("Llave: " + key + " Valor: " + treePersons.get(key));
            }
        }
    }

    public Map<Integer, Person> construirTreeMapPersonObj() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Carlos", 23, 123));
        list.add(new Person("Ana", 30, 124));
        list.add(new Person("Luis", 18, 125));
        list.add(new Person("Ana", 20, 126));
        list.add(new Person("Andres", 23, 127));
        list.add(new Person("Luis", 18, 128));

        Map<Integer, Person> persons = new TreeMap<>();
        for (Person person : list) {
            persons.put(person.getId(), person);
        }
        return persons;
    }
}