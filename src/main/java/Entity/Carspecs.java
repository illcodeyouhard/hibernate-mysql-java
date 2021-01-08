package Entity;

public class Carspecs {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String body;
    private String color;
    private Integer engine_size;
    private Car car;

    public Carspecs() {}


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEngine_size() {
        return engine_size;
    }

    public void setEngine_size(Integer engine_size) {
        this.engine_size = engine_size;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    @Override
    public String toString()
    {
        return "Car_specs [" + color + "]";
    }
}