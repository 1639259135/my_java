public class T {

    public static void main(String[] args) {


        Link link = new LinkImpl();

        System.out.println(link.isEmpty());

        link.add("A");
        link.add("B");
        link.add("C");
        link.add("D");

        System.out.println(link.isEmpty());

    }


}
