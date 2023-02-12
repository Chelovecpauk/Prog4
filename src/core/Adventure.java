package core;

import util.ThingInterface;
import util.LinkingWordEnum;
import util.PronounEnum;

public class Adventure implements ThingInterface {
    private String name;
    private String characteristic;

    public Adventure(){
        name = "приключений";
        characteristic = "множество необычайных ";
    }
    public Adventure(String name){
        this.name = name;
    }

    public Adventure(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String happen(LinkingWordEnum link, PronounEnum pronoun){
        return link.getTranslation() + " с " + pronoun.getTranslation() + " происходит " + getCharacteristic() + getName();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adventure that = (Adventure) o;
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
        return "Класс Приключения";
    }
}
