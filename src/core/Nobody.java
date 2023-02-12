package core;

import util.ThingInterface;

public class Nobody implements ThingInterface {
    private String name;

    public Nobody(){
        name = "Никто";
    }

    public Nobody(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String doNotWant(){
        return name + " не хотел с ним водиться";
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nobody that = (Nobody) o;
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
        return "Класс Никто";
    }
}
