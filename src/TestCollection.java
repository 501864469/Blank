import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import property.Hero;

public class TestCollection {


    public static void main(String[] args) {
        List ll = new LinkedList<Hero>();
        Queue<Hero> q = new LinkedList<Hero>();
        System.out.println("初始化队列:\t");
        q.offer(new Hero("Hero1"));
        q.offer(new Hero("Hero2"));
        q.offer(new Hero("Hero3"));
        q.offer(new Hero("Hero4"));
        q.offer(new Hero("Hero5"));
        System.out.println(q);
        System.out.print("把第一个元素取poll()出来:\t");
        //取出第一个Hero，FIFO 先进先出
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("取出第一个元素之后的队列:\t");
        System.out.println(q);

        //把第一个拿出来看一看，但是不取出来
        h=q.peek();
        System.out.print("查看peek()第一个元素:\t");
        System.out.println(h);
        System.out.print("查看并不会导致第一个元素被取出来:\t");
        System.out.println(q);

    }

}

