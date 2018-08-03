package effectivejava.chapter9.item58;
import java.util.*;

// Same bug as NestIteration.java (but different symptom)!! - Page 213
public class DiceRolls {
    enum Face { ONE, TWO, THREE, FOUR, FIVE, SIX }

    public static void main(String[] args) {
        // Same bug, different symptom!
        Collection<Face> faces = EnumSet.allOf(Face.class);

        for (Iterator<Face> i = faces.iterator(); i.hasNext(); )
            for (Iterator<Face> j = faces.iterator(); j.hasNext(); )
                System.out.println(i.next() + " " + j.next());

        System.out.println("***************************");

        for (Face f1 : faces)
            for (Face f2 : faces)
                System.out.println(f1 + " " + f2);
    }
}
