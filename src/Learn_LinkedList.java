import org.w3c.dom.Node;

import java.util.LinkedList;

public class Learn_LinkedList {


    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(0,"SANJEEVA");
        list.add(1,"SANJEEVA4");

        LinkedList list1 = new LinkedList();
        list1.add(0,"SANJEEVA2");
        list1.add(1,"SANJEEVA3");


        list.addAll(1,list1);

        System.out.println(list.contains("SANJEEV"));

    }
}
