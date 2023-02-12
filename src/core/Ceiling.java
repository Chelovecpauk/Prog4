package core;

import util.ThingInterface;

public class Ceiling implements ThingInterface {
    private String name;
    private String nameVTvoritelnomPadeje;

    public Ceiling(){
        name = "потолок";
        nameVTvoritelnomPadeje = "потолком";
    }

    public Ceiling(String name, String nameVTvoritelnomPadeje){
        this.name = name;
        this.nameVTvoritelnomPadeje = nameVTvoritelnomPadeje;
    }

    public String getNameVTvoritelnomPadeje() {return nameVTvoritelnomPadeje;}


    @Override
    public String getName() {return name;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ceiling that = (Ceiling) o;
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
        return "Это класс про Потолок";
    }
}
