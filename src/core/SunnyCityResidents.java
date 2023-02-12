package core;

import util.CityResidentsAbstract;

public class SunnyCityResidents extends CityResidentsAbstract {
    public SunnyCityResidents(){
        super("Жители солнечного города");
    }

    public SunnyCityResidents(String name){
        super(name);
    }

    @Override
    public String build(){
        return getName() + " помогли построить";
    }

    public String toKnow(){
        return getName() + " узнали, что" ;
    }

    public String help(){
        return getName() + " пришли на помощь" ;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SunnyCityResidents that = (SunnyCityResidents) o;
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
        return "Класс жителей цветочного города";
    }
}
