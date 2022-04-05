public class Cat extends Animal {

  @Override
  public void MakeSound() {
    System.out.println("Miav");

  }

  @Override
  public boolean eat(String Foodtype) {
    return true;
  }
}
