package core;

import util.ThingInterface;

public class Knot implements ThingInterface {
    private String name;
    private String characteristic;


    public Knot(){
        name = "узел";
        characteristic = "огромный";
    }

    public Knot(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knot that = (Knot) o;
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
        return "Класс описывающий ночь";
    }
}
