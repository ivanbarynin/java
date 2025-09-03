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
    // 2 задача
    
    //текущий год
    final int currentYear = 2025; 

    //метод to_string
    public String ToString(){
        return String.format("Car {model = %s, license = %s, color = %s, year = %d}", model, license, color, year);
    }

    //вычисление возраста

    public int getCarAge(){
        if (year == 0){
            return 0;
        }
        return currentYear - year;
    }

    //геттеры

    public String getModel(){
        return model;
    }

    public String getLicense(){
        return license;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    //сеттеры

    public void setModel(String model){
        this.model = model;
    }

    public void setLicense(String license){
        this.license = license;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setYear(int year){
        this.year = year;
    }
}
