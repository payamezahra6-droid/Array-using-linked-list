
public class Main {
    public static void main(String[] args) {

        Array arr = new Array();

        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);

        arr.display();

        System.out.println("Element at index 2: " + arr.get(2));

        arr.update(1, 25);
        System.out.println("After updating:");
        arr.display();
        
        arr.delete(2);
        System.out.println("After deleting index 2:");
        arr.display();

        System.out.println("Total elements: " + arr.getSize());
    }
}
