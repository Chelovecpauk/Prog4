package core;

import util.HalfAbstract;
import util.LinkingWordEnum;
import util.PronounEnum;

public class OneHalf extends HalfAbstract {
    public OneHalf(){
        super("Одна половина");
    }

    public OneHalf(String name){
        super(name);
    }

    @Override
    public String approve(){
        return getName() + " утверждает, что лунные кратеры произошли от вулканов,";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OneHalf that = (OneHalf) o;
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
        return "Класс первой половины";
    }
}
