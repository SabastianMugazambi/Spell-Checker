//Aditya Subramanian and Sabastian Mugazambi

public class Interface{

public static void main(String[] args)
{
  BagInterface<Integer> b = new ArrayBag<Integer>(3);
  b.add(9);
  b.add(5);
  System.out.println(b.getCurrentSize());
    System.out.println(b.contains(9));
      System.out.println(b.isFull());

  System.out.println(b.remove(9));

  System.out.println(b.remove());
    System.out.println(b.add(7));
  System.out.println(b.add(7));
    System.out.println(b.getFrequencyOf(7));



}
}