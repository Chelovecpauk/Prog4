package core;

import util.ThingInterface;

public class Scientists implements ThingInterface {
    private String name;

    public Scientists(){
        name = "Ученые";
    }

    public Scientists(String name){
        this.name = name;
    }

    public String callMountains(Mountains mountains){
        return  "Эти " + mountains.getCharacteristic() + " " + mountains.getName() + " ученые называют лунными кратерами, или цирками";
    }
    public String beInterersted(){
        return "Многих ученых интересует вопрос, как образовались лунные кратеры, от чего они произошли";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scientists that = (Scientists) o;
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
        return "Класс ученых";
    }
}
