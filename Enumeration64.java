import java.util.*;
public class Enumeration64{
    public static void main(final String[] args) {
        final Vector v = new Vector();
        v.addElement("one");
        v.addElement("Two");
        v.addElement("Three");
        System.out.println(v);
        final Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            final String s = (String) e.nextElement();
            System.out.println(s+" "+s.length());
        }
    }
}