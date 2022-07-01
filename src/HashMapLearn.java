import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {
    public static void main(String[] args) {

        HashMap<String,String> StateCapital = new HashMap<>();

        StateCapital.put("Telangana","Hyderabad");
        StateCapital.put("Andhra","Amaravathi");
        StateCapital.put("Karnataka","Banglore");

        System.out.println(StateCapital);

        for(Map.Entry<String,String> s:StateCapital.entrySet())
        {
            System.out.println(s.getKey()+":"+s.getValue());
        }
    }
}
