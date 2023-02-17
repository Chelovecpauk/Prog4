package core;

import util.ThingInterface;

public class Cave implements ThingInterface {
    private String name;
    private String location;
    public Cave(){
        name = "пещера";
        location = "в центре этого кратера";
    }

    public Cave(String name, String location){
        this.name = name;
        this.location = location;
    }
    public String be(){
        return "которая находилась " + location + ",";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cave that = (Cave) o;
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
        return "Класс Пещеры";
    }
}
