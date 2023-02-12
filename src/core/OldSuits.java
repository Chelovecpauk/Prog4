package core;

import util.ThingInterface;

public class OldSuits implements ThingInterface {
    private String name;

    public OldSuits(){
        name = "Старые костюмы";
    }

    public OldSuits(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String relevance(){
        return name + " вышли из моды";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldSuits that = (OldSuits) o;
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
        return "Класс старой одежды";
    }
}
