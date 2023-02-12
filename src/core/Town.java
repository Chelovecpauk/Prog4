package core;

import util.ThingInterface;

public class Town implements ThingInterface {
    private String name;

    public Town(){
        name = "Солнечный";
    }

    public Town(String name){
        this.name = name;
    }

    public String change(){
        return getName() + " город изменился с тех пор так, что теперь его и не узнать";
    }

    public String appear(){
        return "В нем появилось много новых, больших и очень красивых домов";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town that = (Town) o;
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
        return "Класс Описывающий город";
    }
}
