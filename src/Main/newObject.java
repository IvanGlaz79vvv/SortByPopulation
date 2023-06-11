package Main;

public class newObject {
    int id;
    String name;
    String CountryCode;
    String District;
    int Population;

    public newObject(int id, String name, String countryCode, String district, int population) {
        this.id = id;
        this.name = name;
        CountryCode = countryCode;
        District = district;
        Population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return id+" " + name+" " + CountryCode+" " + District+" " + Population;
    }
}
