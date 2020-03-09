package List;

import java.util.List;

public class ArrayList {
    List<String> alist;

    public List list(){
        alist = new java.util.ArrayList<String>(5);
        alist.add(0, "Athi");
        alist.add(1, "Sbusiso");
        alist.add(2, "Lonwabo");
        alist.add(3, "Kanya");
        alist.add(4, "Nok'thula");

        return  alist;
    }
}
