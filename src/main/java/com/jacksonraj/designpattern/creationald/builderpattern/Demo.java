package com.jacksonraj.designpattern.creationald.builderpattern;

import com.jacksonraj.designpattern.creationald.builderpattern.builders.CarBuilder;
import com.jacksonraj.designpattern.creationald.builderpattern.builders.CarManualBuilder;
import com.jacksonraj.designpattern.creationald.builderpattern.cars.Car;
import com.jacksonraj.designpattern.creationald.builderpattern.cars.Manual;
import com.jacksonraj.designpattern.creationald.builderpattern.director.Director;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
