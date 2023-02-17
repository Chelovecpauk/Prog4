package core;

import util.ThingInterface;

public class Gravity implements ThingInterface {
    private String name;

    public Gravity(){
        name = "сила тяжести";
    }

    public Gravity(String name){
        this.name = name;
    }

    public String compareGravities(){
        return "На Луне, как известно, " + name + " сила тяжести значительно меньше, чем на Земле,";
    }
    public String countForMuch(){
        return "и поэтому наблюдения над изменением " + name + " имеют боольшое научное значение";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gravity that = (Gravity) o;
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
        return "Класс о силе тяжести";
    }
}
