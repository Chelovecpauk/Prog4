package core;

import util.ThingInterface;

public class Znaika implements ThingInterface {
    private String name;

    public Znaika(){
        name = "Знайка";
    }

    public Znaika(String name){
        this.name = name;
    }

    public String visit(){
        return name + " тоже побывал в Солнечном городе";
    }
    public String met(){
        return "Там он познамолися с учеными малышками Фуксией и Селедочкой, которые в то время готовили свой второй полет на Луну";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Znaika that = (Znaika) o;
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
        return "Класс ро Знайку";
    }
}
