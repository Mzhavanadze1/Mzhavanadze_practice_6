public class Dog extends Mammal{
    String breed;

    public Dog(String breed,String diet,String species){
        super(diet,species);
        this.breed=breed;
    }

    public static void main(String[] args) {
        Dog dog1= new Dog("dachshunds","No","Mammal");
        System.out.println(dog1.breed);
        System.out.println(dog1.diet);
        System.out.println(dog1.species);
    }
}
