package core;

import util.ThingInterface;

public class Machine implements ThingInterface {
    private String name;

    public Machine(){
        name = "Машины";
    }

    public Machine(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String automation(FlowersCityResidents flowerCityResidents){
        return name + " делали все вместо " + flowerCityResidents.getName();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine that = (Machine) o;
        if (name == null && that.name == null){return true;}
        else if (name == null || that.name == null){return false;}

        return name.equals(that.name);
    }

    @Override
    public int hashCode(){
        int result = name == null ? 0 : name.hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Класс машин, работающих на фабрике";
    }
}
