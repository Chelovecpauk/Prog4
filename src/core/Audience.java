package core;

import util.ThingInterface;

public class Audience implements ThingInterface {
    private String name;
    private String nameVDatelnomPadeje;

    public Audience(){
        name = "публика";
        nameVDatelnomPadeje = "публике";
    }

    public Audience(String name, String nameVDatelnomPadeje){
        this.name = name;
        this.nameVDatelnomPadeje = nameVDatelnomPadeje;
    }
    public String didNotLike(){
        return "не нравилось " + nameVDatelnomPadeje;
    }

    public String getNameVDatelnomPadeje() {return nameVDatelnomPadeje;}

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audience that = (Audience) o;
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
        return "Это класс Публики";
    }
}
