import java.util.*;

public class MapDemo {
    public static void main(String[] args){
        Map<String,String> student = new HashMap<String, String>();

        student.put("Carl", "db+");
        student.put("Joe", "db");
        student.put("Susan", "bdb");
        student.put("Sus", "bdb");
        student.remove("Sus");
        System.out.println(student);
        List<String> sorted = new ArrayList<>(student.keySet());
        Collections.sort(sorted);
        for(String name : sorted)
        {
            System.out.println(name + ": " + student.get(name));
        }
        for (Map.Entry<String, String> wpis : student.entrySet()) {
            String key = wpis.getKey();
            String value = wpis.getValue();
            System.out.println(key + ": " + value);
        }

    }

}
