package core;

import util.ThingInterface;

public class Depot implements ThingInterface {
    private String name;
    private String characteristic;


    public Depot(){
        name = "склад";
        characteristic = "готового платья";
    }

    public Depot(String name, String characteristic){
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
        Depot that = (Depot) o;
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
        return "Класс описывающий склад";
    }
}
