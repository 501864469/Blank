package Reflection;
import property.Hero;
public class Demo1 {
    public static void main(String[] args){
        String className="property.Hero";
        try{
            //获取类对象
            Class pClass1=Class.forName(className);
            Class pClass2=Hero.class;
            Class pClass3=new Hero("盖伦").getClass();
            System.out.println(pClass1==pClass2);
            System.out.println(pClass1==pClass3);
            System.out.println(pClass1);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
