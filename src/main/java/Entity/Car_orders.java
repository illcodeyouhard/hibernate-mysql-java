package Entity;

public class Car_orders {

    private static final long serialVersionUID = 1L;

    private Integer ORDER_ID;
    private Integer CAR_ID;
    private String comments;
    private String city;
    private Integer amount;
    private Car car;

    public Car_orders() {
    }

    public Integer getORDER_ID() {
        return ORDER_ID;
    }

    public void setORDER_ID(Integer ORDER_ID) {
        this.ORDER_ID = ORDER_ID;
    }

    public Integer getCAR_ID() {
        return CAR_ID;
    }

    public void setCAR_ID(Integer CAR_ID) {
        this.CAR_ID = CAR_ID;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
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
        return "Amount [" + amount + "]";
    }

}