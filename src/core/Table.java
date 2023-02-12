package core;

import util.ThingInterface;

public class Table implements ThingInterface {
    private String name;
    private String nameVPredlojnomPadeje;

    private String nameVTvoritelnomPadeje;

    public Table(){
        name = "стол";
        nameVPredlojnomPadeje = "столе";
        nameVTvoritelnomPadeje = "столом";

    }

    public Table(String name, String nameVPredlojnomPadeje, String nameVTvoritelnomPadeje){
        this.name = name;
        this.nameVPredlojnomPadeje = nameVPredlojnomPadeje;
        this.nameVTvoritelnomPadeje = nameVTvoritelnomPadeje;
    }

    public String getNameVPredlojnomPadeje() {return nameVPredlojnomPadeje;}

    public String getNameVTvoritelnomPadeje() {return nameVTvoritelnomPadeje;}


    @Override
    public String getName() {return name;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table that = (Table) o;
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
        return "Это класс описывающий стол";
    }
}
