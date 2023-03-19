package Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import property.Hero;
public class Demo2 {
    public static void main(String[] args) {
        //传统的new()方式创建对象
        Hero hero = new Hero("提莫");
        System.out.println(hero);
        try {
            //使用反射的方式创建对象
            String className = "property.Hero";
            Class pClass = Class.forName(className);
            Constructor c = pClass.getConstructor();
            Hero h2 = (Hero) c.newInstance();

            //h2.name = "gareen";
            System.out.println(h2);
            //通过反射修改属性的值
            Field f=h2.getClass().getDeclaredField("name");
            //访问private字段
            f.setAccessible(true);
            f.set(h2,"teemo");
            System.out.println(h2.getName());
            Method m=h2.getClass().getMethod("setName", String.class);
            m.invoke(h2,"LuckyLady");
            System.out.println(h2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
