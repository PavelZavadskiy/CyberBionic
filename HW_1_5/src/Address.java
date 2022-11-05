public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public Address() {

    }

    public Address(String index,
            String country,
            String city,
            String street,
            String house,
            String apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;

    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getIndex() {
        return this.index;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return this.street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {
        return this.house;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getApartment() {
        return this.apartment;
    }

    @Override
    public String toString() {
        return String.format("Index: %s\nCountry: %s\nCity: %s\nStreet: %s\nHouse: %s\nApartment: %s\n",
                this.index,
                this.country,
                this.city,
                this.street,
                this.house,
                this.apartment);
    }
}
