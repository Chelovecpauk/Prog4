package core;

import util.ThingInterface;

public class FactoryWorkers implements ThingInterface {
    private String name;

    public FactoryWorkers(){
        name = "Работники фабрики";
    }

    public FactoryWorkers(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String invent(ClothingStyles clothingStyles){
        return name + " придумывали новые " + clothingStyles.getName();
    }
    public String track(Nothing nothing, Audience audience){
        return name + " следили, чтоб не " + nothing.produced() + " такого, что " + audience.didNotLike() ;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactoryWorkers that = (FactoryWorkers) o;
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
        return "Это класс работников фабрики";
    }
}
