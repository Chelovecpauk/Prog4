package core;

import util.ThingInterface;


public class Neznaika implements ThingInterface {
    private String name;

    public Neznaika(){
        name = "Незнайка";
    }

    public Neznaika(String name){
        this.name = name;
    }

    public String commit(Adventure adventure){
        return getName() + " совершил " + adventure.getName() + " в солнечный город, ";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Neznaika that = (Neznaika) o;
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
        return "Класс о Незнайке";
    }
}
