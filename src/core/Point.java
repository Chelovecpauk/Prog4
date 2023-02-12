package core;

import util.ThingInterface;

public class Point implements ThingInterface {
    private String name;

    public Point(){
        name = "главное";
    }

    public Point(String name){
        this.name = name;
    }

    public String be(){
        return "Впрочем, " + name + " было не это." + name + " было то, что ";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point that = (Point) o;
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
        return "Класс Главное";
    }
}
