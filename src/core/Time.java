package core;

import util.ThingInterface;

public class Time implements ThingInterface {
    private String name;

    public Time(){
        name = "два с половиной года";
    }

    public Time(String name){
        this.name = name;
    }

    public String pass(){
        return " прошло " + getName();
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time that = (Time) o;
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
        return "Класс времени";
    }
}
