import java.util.*;

public class ListIterator64 {
    public static void main(final String[] args) {
        final LinkedList li = new LinkedList();
        li.add("c");
        li.add("CPP");
        li.add("Java");
        li.add("PHP");
        System.out.println(li);
        final ListIterator lit = li.listIterator();
        while (lit.hasNext()) {
            final String s = (String) lit.next();
            if (s.equals("java"))
                lit.set("java SE");
            else if (s.equals("c"))
                lit.add("C++");
            else if (s.equals("PHP"))
                lit.remove();
        }
        System.out.println(li);
    }
}