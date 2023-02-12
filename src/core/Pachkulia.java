package core;

import util.ThingInterface;

public class Pachkulia implements ThingInterface {
    private String name;

    public Pachkulia(){
        name = "Пачкули Пестренького";
    }

    public Pachkulia(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pachkulia that = (Pachkulia) o;
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
        return "Класс Пачкули пестренького";
    }
}
