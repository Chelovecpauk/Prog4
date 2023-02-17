package core;

import util.ThingInterface;

public class Stories implements ThingInterface {
    private String name;

    public Stories(){
        name = "рассказы";
    }

    public Stories(String name){
        this.name = name;
    }

    public String interest(Astronomer astronomer){
        return "Его " + name + " очень заинтересовали всех, и собенно астронома " + astronomer.getName() + ", который";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stories that = (Stories) o;
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
        return "Класс про рассказы";
    }
}
