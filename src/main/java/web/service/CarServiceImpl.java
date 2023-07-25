package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Audi", 2, 1_200_000));
            carList.add(new Car("Kia", 5, 900_000));
            carList.add(new Car("Mercedes-Benz", 1, 4_300_000));
            carList.add(new Car("Lexus", 3, 3_500_000));
            carList.add(new Car("Toyota", 4, 2_200_000));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
