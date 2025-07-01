import java.util.*;

public class App {
    public static void main(String[] args) {
        Sets sets = new Sets();
        runHashSet(sets);
        runLinkedHashSet(sets);
        runTreeSet(sets);
        runTreeSetConComparador(sets);
        runTreeSetComparadorReverso(sets);
    }

    public static void runHashSet(Sets sets) {
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("-------- HashSet --------"); 
        for (String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(Sets sets) {
        Set<String> set = sets.construirLinkedHashSet();
        System.out.println("-------- LinkedHashSet --------");
        for (String elemento : set) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSet(Sets sets) {
        Set<String> set = sets.construirTreeSet();
        System.out.println("-------- TreeSet --------");
        for (String elemento : set) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador(Sets sets) {
        Set<String> set = sets.construirTreeSetConComparador();
        System.out.println("-------- TreeSet con Comparator (por longitud) --------");
        for (String elemento : set) {
            System.out.println(elemento);
        }
    }

    public static void runTreeSetComparadorReverso(Sets sets) {
        Set<String> set = sets.construirTreeSetConComparadorReverso();
    
        System.out.println("-------- TreeSet con Comparator (orden inverso directo) --------");
        for (String elemento : set) {
            System.out.println(elemento);
        }
    }
}