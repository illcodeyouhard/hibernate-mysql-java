package Entity;

public class Car  {

    private static final long serialVersionUID = 1L;

    private Integer ID;
    private String creator;
    private String model;
    private String country;

    public Car() {}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString()
    {
        return "Car ["+ "ID:" + ID +" Creator:"+ creator +" Model:"+ model +" Country:"+ country +"]";
    }

}
