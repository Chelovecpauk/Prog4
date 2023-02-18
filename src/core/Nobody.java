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
    public String doNotSuffocate(){
        return "чтоб не задохнуться,";
    }
    public String takeWithYou(AirReserves air){
        return "всегда нужно брать с собой " + air.getName();
    }
    public String imagine(){
        return "Чтобы понять, как выглядит такой лунный цирк, или кратер,\nвообразите себе огромное круглое поле,\nв поперечнике километров двадцать, тридцать, пятьдесят или даже сто,\nи представьте, что это огромное круглое поле окружено земляным валом\nили горой высотой всего в два или три километра,\n-- вот и получится лунный цирк, или кратер";
    }
    public String call(){
        return "Первую половину астрономов называют поэтому последователями вулканической теории или попросту вулканистами,\nа вторую -- последователями метеоритной теории или метеоритчиками";
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
