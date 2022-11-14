package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> list = new ArrayList<>();

    {
        list.add(new Car(1, "BMW", "black"));
        list.add(new Car(2, "Audi", "orange"));
        list.add(new Car(3, "Range", "blue"));
        list.add(new Car(4, "Mitsubishi", "red"));
        list.add(new Car(5, "Toyota", "white"));
    }

    @Override
    public List<Car> getListCars(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
