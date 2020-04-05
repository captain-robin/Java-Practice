import java.util.*;
public class Iterator62{
    public static void main(final String[] args) {
        final ArrayList l1 = new ArrayList(4);
        l1.add("dj");
        l1.add("Daku");
        l1.add(1,"Sapati");
        l1.add("Manku");
        l1.add(30);
        l1.add(30.4);
        final Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}