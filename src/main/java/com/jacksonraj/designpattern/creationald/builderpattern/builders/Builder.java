package com.jacksonraj.designpattern.creationald.builderpattern.builders;

import com.jacksonraj.designpattern.creationald.builderpattern.cars.CarType;
import com.jacksonraj.designpattern.creationald.builderpattern.components.Engine;
import com.jacksonraj.designpattern.creationald.builderpattern.components.GPSNavigator;
import com.jacksonraj.designpattern.creationald.builderpattern.components.Transmission;
import com.jacksonraj.designpattern.creationald.builderpattern.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);
}
