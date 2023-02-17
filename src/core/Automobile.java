package core;

import util.ThingInterface;

public class Automobile implements ThingInterface {
    private String name;

    public Automobile(){
        name = "автомобилей";
    }

    public Automobile(String name){
        this.name = name;
    }

    public String appear(){
        return "На улицах появилось множество " +  name + ", ";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
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
        return "Класс Луны";
    }
}
