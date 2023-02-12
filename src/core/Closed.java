package core;

import util.ThingInterface;

public class Closed implements ThingInterface {
    private String name;
    private String nameVPredlojnomPadeje;

    public Closed(){
        name = "шкаф";
        nameVPredlojnomPadeje = "шкафу";
    }

    public Closed(String name, String nameVPredlojnomPadeje){
        this.name = name;
        this.nameVPredlojnomPadeje = nameVPredlojnomPadeje;
    }

    public String getNameVPredlojnomPadeje() {return nameVPredlojnomPadeje;}

    @Override
    public String getName() {return name;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Closed that = (Closed) o;
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
        return "Это класс описывающий шкаф";
    }

}
