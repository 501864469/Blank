package Collection;
import java.util.List;
import java.util.ArrayList;

public class Node {
        public Node leftNode;
        public Node rightNode;
        public Object value;
        //插入数据
        public void add(Object v) {
            if (null == value)
                value = v;
            else {
                if ((Integer) v - ((Integer) value) <= 0) {
                    if (null == leftNode)
                        leftNode = new Node();
                    leftNode.add(v);
                } else {
                    if (null == rightNode)
                        rightNode = new Node();
                    rightNode.add(v);

                }
            }
        }
            public List<Object> values(){
                List<Object> values = new ArrayList<>();

                // 左节点的遍历结果
                if (null != leftNode)
                    values.addAll(leftNode.values());

                // 当前节点
                values.add(value);

                // 右节点的遍历结果
                if (null != rightNode)

                    values.addAll(rightNode.values());

                return values;
            }

        public static void main(String[] args){
            int randoms[]=new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
            Node roots=new Node();
            for(int number:randoms){
                roots.add(number);
            }
            System.out.println(roots.values());
        }
}
