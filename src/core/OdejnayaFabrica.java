package core;

import util.ThingInterface;

public class OdejnayaFabrica implements ThingInterface {
    private String name;

    public OdejnayaFabrica(){
        name = "Одежная фабрика";
    }

    public OdejnayaFabrica(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String produceClothes(Clothes clothes, Clothes clothes1, Clothes clothes2){

        return name + " выпускала множество " + clothes.getCharacteristic1() + " " + clothes.getCharacteristic2() + " " + clothes.getName() + ", начиная с " +  clothes1.getCharacteristic1() + " " + clothes1.getName() + " и кончая " + clothes2.getCharacteristic1() + " " + clothes2.getName() + " " + clothes2.getCharacteristic2();

    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OdejnayaFabrica that = (OdejnayaFabrica) o;
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
        return "Кллаасс Одежной фабрики";
    }
}
