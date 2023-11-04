public class Car {
    private String model;
    private double obem;
    private String country;

    public Car(String model, double obem, String country) {
        this.model = model;
        this.obem = obem;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getObem() {
        return obem;
    }

    public void setObem(double obem) {
        this.obem = obem;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getInfoCar(){
        return STR."""
                    car:
                model: \{getModel()}
                obem: \{getObem()}
                country: \{getCountry()}
                """;
    }
}
