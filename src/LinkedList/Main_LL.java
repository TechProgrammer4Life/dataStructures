package LinkedList;

public class    Main_LL {

    public static void main(String[] args) {

        LL list = new LL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);

        //list.display();
        //System.out.println(list.deleteFirst());

        //list.display();
        //System.out.println(list.deleteLast());

        //list.display();
        //System.out.println(list.delete(2));

        list.display();
        //list.insertRec(5, 2);
        list.duplicates();
        list.display();


        LL first = new LL();
            first.insertLast(1);
            first.insertLast(3);
            first.insertLast(5);

        LL second = new LL();
            second.insertLast(1);
            second.insertLast(2);
            second.insertLast(9);
            second.insertLast(14);

        LL ans = LL.merge(first, second);
        System.out.println("Merging 2 Lists...");
        ans.display();

    }

}
