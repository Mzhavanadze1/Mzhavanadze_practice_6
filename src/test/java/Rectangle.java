public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(int length, int width){
        super("otxkutxedi");
        this.length=length;
        this.width=width;

    }
    public  Rectangle(int square){
        this(square,square);

    }
    public void area(){
        int area = this.length*this.width;
        System.out.println(area);

    }

}
//Task4/2
