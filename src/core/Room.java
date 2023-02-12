package core;

import util.ThingInterface;

public class Room implements ThingInterface {
    private String name;

    public Room(){
        name = "Комната";
    }

    public Room(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String turnInto(Depot depot){
        return name + " превратилась  в какой-то " + depot.getName() + " " + depot.getCharacteristic();
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room that = (Room) o;
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
        return "Класс комнаты";
    }
}
