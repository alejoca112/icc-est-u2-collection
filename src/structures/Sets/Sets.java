package structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets(){
        
    }

    public Set<String> construirHashSet(){
            Set<String> hashSet = new HashSet<>(); //Constructor hashset
            hashSet.add("A"); //Inicializar las Variables que son Strings(cadena de texto)
            hashSet.add("B");
            hashSet.add("C");
            hashSet.add("A");
            hashSet.add("D");
        //Devolver hashSet
            return hashSet;
        }

    public Set<String> construirLinkedHashSet(){
        Set<String> linkedhashSet = new LinkedHashSet<>(); //Constructor hashset
            linkedhashSet.add("A"); //Inicializar las Variables que son Strings(cadena de texto)
            linkedhashSet.add("B");
            linkedhashSet.add("C");
            linkedhashSet.add("A");
            linkedhashSet.add("D");
        //Devolver hashSet
            return linkedhashSet;
    }

    public Set<String> construirTreeSet(){
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

    public Set<String> construirTreeSetConComparador(){
        return null;
    }
}
