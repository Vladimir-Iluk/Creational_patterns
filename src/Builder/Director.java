package Builder;

public class Director {

    public void constructSportsCar(IBuilder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(Engine.SPORT_ENGINE);

    }

    public void constructCityCar(IBuilder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(Engine.CLASSIC_ENGINE);
    }
}
