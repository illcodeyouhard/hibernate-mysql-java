package Entity;

public class Car_creators {

    private static final long serialVersionUID = 1L;

    private Integer WORKER_ID;
    private String name;
    private String surname;
    private Integer CAR_ID;
    private Car car;

    public Car_creators() {
    }

    public Integer getWORKER_ID() {
        return WORKER_ID;
    }

    public void setWORKER_ID(Integer WORKER_ID) {
        this.WORKER_ID = WORKER_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getCAR_ID() {
        return CAR_ID;
    }

    public void setCAR_ID(Integer CAR_ID) {
        this.CAR_ID = CAR_ID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

//    @Override
//    public String toString()
//    {
//        return "Surnames ["+ surname + "]";
//    }
}