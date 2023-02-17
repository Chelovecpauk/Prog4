package util;

public abstract class HalfAbstract implements ThingInterface{
    private String name;

    public HalfAbstract(String name){this.name = name;}

    public abstract String approve();

    @Override
    public String getName() {return name;}
}
