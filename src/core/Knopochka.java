package core;

import util.ThingInterface;

public class Knopochka implements ThingInterface {
    private String name;

    public Knopochka(){
        name = "Кнопочки";
    }

    public Knopochka(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knopochka that = (Knopochka) o;
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
        return "Класс Кнопочки";
    }
}
