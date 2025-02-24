class Item{
  static int objectCount = 0;
  String itemName;

  Item(String itemName){
    this.itemName = itemName;
    objectCount++;
  }

  public static void displayObjectCount(){
    System.out.println("Total object created: " + objectCount);
  }

  public void displayItem(){
    System.out.println("Item: " + itemName);
  }

}

public class ItemDemo{
  public static void main(String[] args) {
      Item item1 = new Item("Laptop");
      Item item2 = new Item("Smartphone");
      Item item3 = new Item("Tablet");

      item1.displayItem();
      item2.displayItem();
      item3.displayItem();

      Item.displayObjectCount();
  }
}