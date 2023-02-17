package core;

import util.LinkingWordEnum;
import util.PronounEnum;
import util.ThingInterface;

public class Crater implements ThingInterface {
    private String name;
    private String characteristic;
    private String quantity;

    public Crater(){
        name = "кратеров";
        characteristic = "космическая ";
        quantity = "тысячи";
    }
    public Crater(String name){
        this.name = name;
    }

    public Crater(String name, String characteristic,String quantity){
        this.name = name;
        this.characteristic = characteristic;
        this.quantity = quantity;
    }
    public String getQuantity(){
        return quantity;
    }


    public String getCharacteristic() {
        return characteristic;
    }

    public String issueQuantity(){
        return "Таких " + name + " на Луне " + quantity;
    }
    public String bringOutVariety(){
        return "Есть маленькие -- километра в два, но есть и  гигантские -- до ста сорока километров в диаметре";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Crater that = (Crater) o;
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
