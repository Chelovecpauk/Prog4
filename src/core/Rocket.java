package core;

import util.LinkingWordEnum;
import util.PronounEnum;
import util.ThingInterface;

public class Rocket implements ThingInterface {
    private String name;
    private String characteristic;
    private boolean ready;

    public Rocket(){
        name = "ракета";
        characteristic = "космическая ";
        ready = false;
    }
    public Rocket(String name){
        this.name = name;
    }

    public Rocket(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
        ready =false;
    }
    public boolean getReady(){
        return ready;
    }
    public String happen(LinkingWordEnum link, PronounEnum pronoun){
        return link.getTranslation() + " с " + pronoun.getTranslation() + " происходит " + getCharacteristic() + getName();
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String beReady(){
        ready = true;
        return "когда " + name + " была готова,";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rocket that = (Rocket) o;
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
        return "Класс ракеты";
    }
}
