import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import controllers.MaquinasController;
import models.Maquina;
import models.Node;
import models.Person;
import structures.EjerciciosMapas;
import structures.Maps.Maps;
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
        String a1 = "A";
        String a2 = "A";
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

        System.out.println("\nTreeSet con Comparador");
        Set<String> treeSetConComparador = setsClase.construirTreeSetConComparador();
        System.out.println(treeSetConComparador);

        System.out.println("\nTreeSet con Person");
        Set<Person> treeSetPerson = setsClase.construirTreeSetConPerson();
        System.out.println(treeSetPerson);
        System.out.println("Carlos".compareTo("Ana"));

        System.out.println("\nMaquinas");
        runMaquina();

        System.out.println("\nMaps");
        runMaps();
        System.out.println("\nLinkedHashMap");
        runLinkedHashMap();
        System.out.println("\nTreeMap");
        runTreeMap();
        System.out.println("\nTreeMap con Person");
        runTreeMapPerson();
        System.out.println("\nTreeMap con Personas Filtro");
        runTreeMapPersons();
        System.out.println("\nTreeMap con Personas Obj");
        runTreeMapPersonsObj();
        System.out.println("\nEjercicio 1");
        runEjercicios();
        System.out.println("\nEjercicio 2");
        runEjercicio2();
        System.out.println("\nEjercicio 3");
        runEjercicio3();
    }

    private static void runMaquina() {
        List<Maquina> maquinas = crearMaquinas();
        MaquinasController controller = new MaquinasController();
        Set<Maquina> maquinasSet = controller.ordenarSubRed(maquinas);
        for (Maquina maquina : maquinasSet) {
            System.out.println(maquina.getSubred() + "-" + maquina.getNombre());
        }
        System.out.println(maquinasSet.size());
    }

    static List<Maquina> crearMaquinas() {
        List<Maquina> maquinas = Arrays.asList(
                new Maquina("Controlador20", "155.25.220.238", Arrays.asList(21, 30, 29, 16)),
                new Maquina("DB3", "172.144.210.32", Arrays.asList(4, 29, 16, 6, 2)),
                new Maquina("DB13", "71.248.50.86", Arrays.asList(17, 11, 12)));
        return maquinas;
    }

    public static void runMaps() {
        Maps maps = new Maps();
        Map<String, Integer> map = maps.construirHashMap();
        System.out.println(map);
    }

    public static void runLinkedHashMap() {
        Maps maps = new Maps();
        Map<String, Integer> map = maps.construirLinkedHashMap();
        System.out.println(map);
    }

    public static void runTreeMapPerson() {
        Maps maps = new Maps();
        Map<Person, Integer> map = maps.construirTreeMapPerson();
        System.out.println(map);
    }

    public static void runTreeMap() {
        Maps maps = new Maps();
        Map<String, Integer> map = maps.construirTreeMap();
        System.out.println(map);
    }

    public static void runTreeMapPersons() {
        Maps maps = new Maps();
        Map<Person, Integer> map = maps.construirTreeMapPerson();
        maps.printFilter(map);
    }

    public static void runTreeMapPersonsObj() {
        Maps maps = new Maps();
        Map<Integer, Person> map = maps.construirTreeMapPersonObj();
        System.out.println(map);
    }

    private static void runEjercicios() {
        EjerciciosMapas ejerciciosMapas = new EjerciciosMapas();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 18, 19, 20,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        Map<Integer, Integer> resultado = ejerciciosMapas.contarDuplicados(list);
        System.out.println(resultado);
    }

    private static void runEjercicio2() {
        EjerciciosMapas ejerciciosMapas = new EjerciciosMapas();
        List<Integer> list = Arrays.asList(4, 5, 1, 2, 5, 4, 3, 2, 1, 6,
                7, 3, 8, 9, 6, 7, 10);
        int resultado = ejerciciosMapas.repetido(list);
        System.out.println(resultado);
    }

    private static void runEjercicio3() {
        List<Person> list = Arrays.asList(
                new Person("Ana", 80),
                new Person("Luis", 90),
                new Person("Carlos", 70),
                new Person("Ana", 85),
                new Person("Sofia", 95),
                new Person("Luis", 88),
                new Person("Pedro", 60),
                new Person("Maria", 75));
        EjerciciosMapas ejerciciosMapas = new EjerciciosMapas();
        ejerciciosMapas.imprimirRanking(list);
    }
}
