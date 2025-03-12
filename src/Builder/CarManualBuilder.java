package Builder;

public class CarManualBuilder implements IBuilder{
    private CarType type;
    private int seats;
    private Engine engine;
    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }
    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine);
    }
}
