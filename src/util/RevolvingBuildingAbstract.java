package util;

public abstract class RevolvingBuildingAbstract implements ThingInterface{
    private String name;

    public RevolvingBuildingAbstract(String name){this.name = name;}

    public abstract String upbuild();

    @Override
    public String getName() {return name;}
}
