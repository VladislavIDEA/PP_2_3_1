package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final String modelCar;
    private final String countryCar;
    private final int ageOfTheCar;

    public Car(String modelCar, String countryCar, int ageOfTheCar) {
        this.modelCar = modelCar;
        this.countryCar = countryCar;
        this.ageOfTheCar = ageOfTheCar;
    }

    public String getModelCar() {
        return modelCar;
    }


    public String getCountryCar() {
        return countryCar;
    }


    public int getAgeOfTheCar() {
        return ageOfTheCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelCar='" + modelCar + '\'' +
                ", countryCar='" + countryCar + '\'' +
                ", ageOfTheCar=" + ageOfTheCar +
                '}';
    }
}
