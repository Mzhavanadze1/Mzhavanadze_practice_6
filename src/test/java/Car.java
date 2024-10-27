public class Car {
    String model;
    int year;
    int price;

    public Car(String model, int year, int price){
        this.model=model;

        if (year >= 2000 && year<=2024){
            this.year=year;
        }else {
            System.out.println("Error: invalid year! ");
        }
        if (price>0){
            this.price=price;
        }else {
            System.out.println("Error: invalid price!");
        }
    }
    //Task2
    public Car(String model){
        this(model,2022, 5000);
    }

    public static void main(String[] args) {
        Car car1=new Car("Ford", 2022, 15000);
        System.out.println(car1.model + " " + car1.year + " " + car1.price);
        Car car2=new Car("BMW", 1999, 15000);
        Car car3=new Car("merso", 2023, -1000);
        // task2
        Car car4= new Car("KIA");
        System.out.println(car4.model + " " + car4.year + " " + car4.price);

    }

}
