import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class LearnCollections {

    public static void main(String[] args) {
        Collection coll=new ArrayList();
        coll.add("SANJEEVA");
        coll.add(1);
        coll.add("SANJEEVA");
        coll.add(1);
        coll.add("SANJEEVA");
        coll.add(1);
        coll.add("SANJEEVA");
        coll.add(1);
        coll.add("SANJEEVA");
        coll.add(1);
        Iterator it=coll.iterator();

        for(int i=0;i< coll.size()-2;i++)
        {
            coll.remove(it.hasNext());
        }

        Iterator it1=coll.iterator();
        while (it1.hasNext())
            System.out.println(it1.next());
    }


}
