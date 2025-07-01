import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets() {}

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("labtop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("labtop");
        palabras.add("Pera");
        return palabras;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> palabras = new LinkedHashSet<>();
        palabras.add("labtop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("labtop");
        palabras.add("Pera");
        return palabras;
    }

    public Set<String> construirTreeSet() {
        Set<String> miTreeSet = new TreeSet<>();
        miTreeSet.add("Labtop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Labtop");
        miTreeSet.add("Pera");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s1.length(), s2.length());
                if (result == 0) {
                    return s1.compareTo(s2);
                }
                return result;
            }
        };

        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Labtop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }

    public Set<String> construirTreeSetConComparadorReverso() {
        Comparator<String> comparadorLongitudReversa = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s2.length(), s1.length());
                if (result == 0) {
                    return s2.compareTo(s1); 
                }
                return result;
            }
        };
    
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitudReversa);
        miTreeSet.add("Labtop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }
}