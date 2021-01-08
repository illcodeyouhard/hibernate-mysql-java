package Entity;

public class Delivery {

    private static final long serialVersionUID = 1L;

    private Integer ORDER_ID;
    private String type;
    private Car_orders car_orders;

    public Delivery() {
    }

    public Integer getORDER_ID() {
        return ORDER_ID;
    }

    public void setORDER_ID(Integer ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car_orders getCar_orders() {
        return car_orders;
    }

    public void setCar_orders(Car_orders car_orders) {
        this.car_orders = car_orders;
    }

    @Override
    public String toString()
    {
        return "Types [" + type + "]";
    }

}
