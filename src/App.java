import java.util.Set;
import models.Node;
import structures.Sets.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets setsClase = new Sets();
        Set<String> hashSet = setsClase.construirHashSet();
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("A"));
        System.out.println("A".hashCode());

        System.out.println("\nVisualizacion Strings");
        String a1 = "A"; //No se usara con el tipo de dato 
        String a2 = "A"; //No se usara con el tipo de dato 
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1 == a2);

        System.out.println("\nVisualizacion Nodes");
        Node<String> n1 = new Node<>("A");
        Node<String> n2 = new Node<>("A");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n1.hashCode() == n2.hashCode());

        System.out.println("\nLinkedHashSet");
        Set<String> linkSet = setsClase.construirLinkedHashSet();
        System.out.println(linkSet);

        System.out.println("\nTreeSet");
        Set<String> treeSet = setsClase.construirTreeSet();
        System.out.println(treeSet);
    }
}
