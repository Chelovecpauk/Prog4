package core;

import util.ThingInterface;

public class Travelers implements ThingInterface {
    private String name;
    private String characteristic;


    public Travelers(){
        name = "путешественники";
        characteristic = "отважные";
    }

    public Travelers(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public String arrive(){
        return "Прилетев на Луну,";
    }
    public String survey(){
        return "наши " + characteristic + " " + name  + " обследовали один из небольших лунных кратеров в районе лунного Моря Ясности,";
    }
    public String visitCave(){
        return "побывали в пещере, ";
    }
    public String makeObservations(){
        return "и произвели наблюдения над изменениями силы тяжести";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Travelers that = (Travelers) o;
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
        return "Класс описывающий путешественников";
    }
}
