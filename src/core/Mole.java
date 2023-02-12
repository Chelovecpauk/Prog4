package core;

import util.ThingInterface;

public class Mole implements ThingInterface {
    private String name;

    public Mole(){
        name = "моль";
    }

    public Mole(String name){
        this.name = name;
    }

    public String divorce(){
        return "От такого обилия шерстяных изделий в доме развелась " + name + ", ";
    }
    public String doNotGnaw(){
        return "и, чтоб она не изгрызла костюмов, ";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mole that = (Mole) o;
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
        return "Класс про насекомое моль";
    }
}
