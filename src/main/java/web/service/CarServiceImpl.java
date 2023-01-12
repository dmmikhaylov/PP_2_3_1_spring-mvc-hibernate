package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "a", 1));
        cars.add(new Car(2, "b", 2));
        cars.add(new Car(3, "c", 3));
        cars.add(new Car(4, "d", 4));
        cars.add(new Car(5, "e", 5));
    }
    @Override
    public List<Car> getCarsByCount(int count) {
        if(count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
