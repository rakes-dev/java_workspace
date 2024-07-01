import java.util.*;

public class VectorEx{
  public static void main(String[] args) {
    Vector<String> vec = new Vector<String>(4);
    vec.add("Lion");
    vec.add("Tiger");
    vec.add("Dog");
    vec.add("Elephant");
    ///
    System.out.println("Size is: "+vec.size());
    System.out.println("Default capacity is: "+vec.capacity());
    //
    System.out.println("Elements are: " + vec);
    //
    vec.addElement("Panda");
    vec.addElement("Wolf");
    vec.addElement("Fox");
    //
    System.out.println("Size after adding elements : "+vec.size());
    System.out.println("Capacity after adding elements : "+vec.capacity());
    //
    vec.remove(3);
    System.out.println("After removing Index(3): "+vec);

  }
}
