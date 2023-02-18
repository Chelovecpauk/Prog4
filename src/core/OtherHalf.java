package core;

import util.HalfAbstract;

public class OtherHalf extends HalfAbstract {
    public OtherHalf(){
        super("другая половина");
    }

    public OtherHalf(String name){
        super(name);
    }

    @Override
    public String approve(){
        return getName() + "говорит, что лунные кратеры -- это следы от падения крупных метеоритов";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtherHalf that = (OtherHalf) o;
        if (getName() == null && that.getName() == null){return true;}
        else if (getName() == null || that.getName() == null){return false;}

        return getName().equals(that.getName());
    }

    @Override
    public int hashCode(){
        int result = getName() == null ? 0 : getName().hashCode();
        return result;
    }

    @Override
    public String toString(){
        return "Класс другой половины";
    }
}
