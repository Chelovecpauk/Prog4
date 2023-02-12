package core;

import util.ThingInterface;

public class Clothes implements ThingInterface {
    private String name;

    private String characteristic1;
    private String characteristic2;


    public Clothes(){
        name = "одежды";
        characteristic1 = "самой";
        characteristic2 = "разнообразной";
    }
    public Clothes(String name, String characteristic1){
        this.name = name;
        this.characteristic1 = characteristic1;
    }

    public Clothes(String name, String characteristic1, String characteristic2){
        this.name = name;
        this.characteristic1 = characteristic1;
        this.characteristic2 = characteristic2;
    }


    public String getCharacteristic1() {
        return characteristic1;
    }

    public String getCharacteristic2() {
        return characteristic2;
    }

    public String becomeNecessary(){
        return "понадобиться";
    }


    @Override
    public String getName() {return name;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes that = (Clothes) o;
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
        return "Это класс про одежду";
    }
}
