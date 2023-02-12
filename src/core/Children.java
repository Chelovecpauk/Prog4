package core;

import util.LinkingWordEnum;
import util.PronounEnum;
import util.ThingInterface;

public class Children implements ThingInterface {
    private String name;
    private String characteristic;

    public Children(){
        name = "детей";
        characteristic = "младшего школьного возраста";
    }

    public Children(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }


    public String getCharacteristic() {
        return characteristic;
    }

    public String makeSentence(LinkingWordEnum link){
        return link.getTranslation() + " " + getName() + " " + getCharacteristic();
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Children that = (Children) o;
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
        return "Класс Дети";
    }
}
