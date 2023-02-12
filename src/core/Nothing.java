package core;

import util.ThingInterface;

public class Nothing implements ThingInterface {
    private String name;
    public Nothing(){
        this.name = "ничего";
    }
    public Nothing(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String produced(){
        return "производилось " + name;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nothing that = (Nothing) o;
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
        return "Класс о местоимении 'ничего' ";
    }
}
