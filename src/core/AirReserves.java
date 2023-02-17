package core;
import util.ThingInterface;
public class AirReserves implements ThingInterface{
    private String name;
    private String characteristic;

    public AirReserves(){
        name = "запасы воздуха";
        characteristic = "в сгущенном виде";
    }
    public AirReserves(String name){
        this.name = name;
    }

    public AirReserves(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String beRunningOut(){
        return "так как " + name + " были у них на исходе";
    }
    public String otToExist(){
        return "Всем известно, что на Луне " + name + " нет и,";
    }
    public String getCharacteristic(){
        return characteristic + ", конечно";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirReserves that = (AirReserves) o;
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
        return "Класс запасов воздуха";
    }
}
