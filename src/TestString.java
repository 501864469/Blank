public class TestString {

    public static void main(String[] args) {
        String str1 = "the";

        StringBuffer sb = new StringBuffer(str1);

        System.out.println(sb.length()); //内容长度

        System.out.println(sb.capacity());//总空间

    }

}

