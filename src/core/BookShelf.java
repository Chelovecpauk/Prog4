package core;

import util.ThingInterface;

public class BookShelf implements ThingInterface {
    private String name;
    private String nameVPredlojnomPadeje;

    public BookShelf(){
        name = "книжная полка";
        nameVPredlojnomPadeje = "книжных полках";
    }

    public BookShelf(String name, String nameVPredlojnomPadeje){
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
        BookShelf that = (BookShelf) o;
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
        return "Это класс книжной полки";
    }
}
