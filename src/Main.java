import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(Arrays.asList(list));
        list.remote(2);
        System.out.println(Arrays.asList(list));
          }
}