package core;

import util.ThingInterface;

public class Holes implements ThingInterface {
    private String name;
    private String characteristic;

    public Holes(){
        name = "дырки";
        characteristic = "неглубокие";
    }

    public Holes(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }
    public String appear(){
        return  "в результате чего на блине образуются " + characteristic + " " + name + ",";
    }
    public String stay(){
        return  "которые так и остаются,";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Holes that = (Holes) o;
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
        return "Класс Луны";
    }
}
