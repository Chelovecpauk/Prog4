package core;

import util.CityResidentsAbstract;
import util.LinkingWordEnum;
import util.PronounEnum;

public class FlowersCityResidents extends CityResidentsAbstract {

    public FlowersCityResidents(){
        super("Коротышки из цветочного города");
    }

    public FlowersCityResidents(String name){
        super(name);
    }

    public String buildRocket(){
        return getName() + ", построив ракету, ";
    }

    public String goOnSpaceTrip(Moon moon){
        return "Отправляются в космичесмкое путешествие на " + moon.getName();
    }

    public String expressAttitude(LinkingWordEnum link1, LinkingWordEnum link2, Time time){
        return link1.getTranslation() + " " + link2.getTranslation() + " " + getName() + " " + time.getName() + " -- срок очень большой";
    }

    public String hearEnough(Neznaika neznaika, Knopochka knopochka, Pachkulia pachkulia, Town town){
        return "Наслушавшись рассказов " + neznaika.getName() + ", " + knopochka.getName() + " и " + pachkulia.getName() + ", ";
    }
    public String makeTrip(Town town){
        return getName() + " тоже совершили поездку в " + town.getName() + " город, ";
    }

    public  String returnBack(LinkingWordEnum link){
        return "а, " + link.getTranslation() + " возвратились, ";
    }
    public  String decide(PronounEnum pronoun1, PronounEnum pronoun2){
        return "решили и у " + pronoun1.getTranslation() + " сделать " + pronoun2.getTranslation() + " усовершенствования";
    }
    @Override
    public String build(){
        return getName() + " занялись строительством";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowersCityResidents that = (FlowersCityResidents) o;
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
        return "Класс коротышек из цветочного города";
    }

}
