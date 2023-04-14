package service;

import com.highfive.demo.domain.Car;
import com.highfive.demo.repository.CarRepository;

public class CarService extends CrudService<Car, Long> {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        super(carRepository);
        this.carRepository = carRepository;
    }
}
