package core;

import util.ThingInterface;

public class House implements ThingInterface {
    private String name;
    private String nameVRoditelnomPadeje;

    public House(){
        name = "Дом";
        nameVRoditelnomPadeje = "Дома";
    }

    public House(String name, String nameVRoditelnomPadeje){
        this.name = name;
        this.nameVRoditelnomPadeje = nameVRoditelnomPadeje;
    }

    public String getNameVRoditelnomPadeje() {
        return nameVRoditelnomPadeje;
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House that = (House) o;
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
        return "Класс про Дом";
    }
}
