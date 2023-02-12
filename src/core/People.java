package core;

import util.LinkingWordEnum;
import util.ThingInterface;

public class People implements ThingInterface {
    private String name;

    public People(){
        name = "нас с вами";
    }

    public People(String name){
        this.name = name;
    }

    public String expressAttitude(LinkingWordEnum link1, LinkingWordEnum link2){
        return link1.getTranslation() + " " + link2.getTranslation() + " " + getName() + " это не так уж много,";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People that = (People) o;
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
        return "Класс описывающий людей";
    }
}
