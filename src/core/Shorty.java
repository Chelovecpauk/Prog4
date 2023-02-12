package core;

import util.ThingInterface;

public class Shorty implements ThingInterface {
    private String name;

    public Shorty(){
        name = "коротышка";
    }

    public Shorty(String name){
        this.name = name;
    }

    public String fell(){
        return "непривычного " + name + "валило с ног";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shorty that = (Shorty) o;
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
        return "Класс Коротышки";
    }

}
