package child;

import parent.Food;

public class Biryani extends Food {
    @Override
    public String function(){
        System.out.println("Scented Energy");
        return "Scented Food";
    }
}
