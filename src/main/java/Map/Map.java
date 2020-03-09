package Map;
import java.util.*;

public class Map {
    HashMap<Integer,String> map;

    public HashMap hash(){

        map =new HashMap<Integer,String>();
        map.put(250,"Athi");
        map.put(356,"Clive");
        map.put(150,"Thera");
        map.put(210, "Lloyd");
        map.remove(250);

        return map;
    }
}
