package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList;

    public CarServiceImpl() {
        this.carList = List.of(new Car("BMW", "Germany", 2015),
                new Car("Mercedes", "Germany", 2019),
                new Car("Audi", "Germany", 2000),
                new Car("Lada", "Russia", 2010),
                new Car("Cadillac", "USA", 2025));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCars(int count) {
        return carList.subList(0, Math.min(count, carList.size()));
    }
}
