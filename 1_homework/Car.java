public class Car {
    //Задача 1
    String model;
    String license;
    String color;
    int year;

    public Car(String model, String license, String color, int year){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year; 
    }

    public Car(){
        this.model = "Неизвестно";
        this.license = "О000ОО";
        this.color = "Неизвестно";
        this.year = 0;
    }

    public Car(String model, int year){
        this.model = model;
        this.license = "О000ОО";
        this.color = "Неизвестно";
        this.year = year;
    }

    //Задача 2

    public static void main(String[] args) {
        
    }
}
