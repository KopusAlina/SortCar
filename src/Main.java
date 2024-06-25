import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static final String TOYOTA = "Toyota";
    private static final String BMW = "Bmw";
    private static final String KIA = "Kia";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camri", false);
        Car car2 = new Car(KIA, "Rio", false);
        Car car3 = new Car(BMW, "X5", false);
        Car car4 = new Car(BMW, "X3", false);
        Car car5 = new Car(BMW, "X6", false);
        Car car6 = new Car(TOYOTA, "Rax 4", true);
        Car car7 = new Car(KIA, "Ceed", false);
        Car car8 = new Car(TOYOTA, "Yaris", false);
        Car car9 = new Car(BMW, "320i", false);
        Car car10 = new Car(TOYOTA, "Corolla", false);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);


        Iterator<Car> iterator = carList.iterator();

        while (iterator.hasNext()) {
                Car car = iterator.next();
                if (car.getBrand().equals(KIA)) {
                    iterator.remove();
                } else if (car.getBrand().equals(TOYOTA)) {
                    car.setOnSale(true);
                }
            }

            for (Car car : carList) {
                System.out.println(car);
            }
        }
    }
