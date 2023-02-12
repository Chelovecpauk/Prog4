package core;

import util.ThingInterface;

public class InjenerKlepka implements ThingInterface {

    private String name;

    public InjenerKlepka(){
        name = "Инженер Клепка";
    }

    public InjenerKlepka(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String developProject(){
        return name + " разработал проект";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InjenerKlepka that = (InjenerKlepka) o;
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
        return "Класс инженера Клепки";
    }
}
