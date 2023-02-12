package util;

public abstract class CityResidentsAbstract implements ThingInterface{
    private String name;

    public CityResidentsAbstract(String name){this.name = name;}

    public abstract String build();

    @Override
    public String getName() {return name;}
}
