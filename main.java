class Car 
{
    String color;
    int speed;

    void accelerate() 
{
        speed += 10;
}

    void brake() 
{
        speed -= 10;
}
}

public class Main 
{
    public static void main(String[] args) 
{

        // create an object from the Car class
        Car myCar = new Car();

        // set the object's values
        myCar.color = "Blue";
        myCar.speed = 50;

        // use the object's methods
        myCar.accelerate();
        System.out.println("Speed after accelerating: " + myCar.speed);

        myCar.brake();
        System.out.println("Speed after braking: " + myCar.speed);
}
}
