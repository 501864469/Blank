import java.util.ArrayList;
import duotai.Hero;
public class Collection {
    public static void main(String[] args){
        ArrayList heros=new ArrayList();
        Hero garen = new Hero();
        garen.name="盖伦";
        heros.add(garen);
        System.out.println(heros.size());
        Hero timoo=new Hero();
        timoo.name="提莫";
        heros.add(timoo);
        System.out.println(heros.size());


    }

}
