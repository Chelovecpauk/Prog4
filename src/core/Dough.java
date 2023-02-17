package core;

import util.LinkingWordEnum;
import util.ThingInterface;

public class Dough implements ThingInterface {
    private String name;

    public Dough(){
        name = "тесто";
    }

    public Dough(String name){
        this.name = name;
    }

    public  String bake(LinkingWordEnum link){
        return link.getTranslation() + " " + name + " как следует пропечется";
    }
    public  String loseViscosity(){
        return "и потеряет вязкость";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dough that = (Dough) o;
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
        return "Класс теста";
    }
}
