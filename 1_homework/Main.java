public class Main {
    public static void main(String[] args) {
        //экземпляры
        Car car1 = new Car("Chevrolet Tahoe", "В004КО", "Черный", 2008);
        Car car2 = new Car();
        Car car3 = new Car("Daewoo Matiz", 2010);

        //проверка to_string
        System.out.println(car1.ToString());
        System.out.println(car2.ToString());
        System.out.println(car3.ToString());

        //проверка возраста авто
        System.out.println("Возраст 1 машины = " + car1.getCarAge() + " лет");
        System.out.println("Возраст 2 машины = " + car2.getCarAge() + " лет");
        System.out.println("Возраст 3 машины = " + car3.getCarAge() + " лет");

        //геттеры
        System.out.println("Модель 1-ой машины = " + car1.getModel());
        System.out.println("Модель 3-ьей машины = " + car3.getModel());

        //сеттеры

        car2.setModel("Hyundai Solaris");
        car2.setLicense("Р420УС");
        car2.setColor("Желтый");
        car2.setYear(2012);

        car3.setLicense("В002АН");
        car3.setColor("Лавандовый");

        System.out.println("Вторая машина после изменений = " + car2.ToString());
        System.out.println("Третья машина после изменений = " + car3.ToString());

    }
}
