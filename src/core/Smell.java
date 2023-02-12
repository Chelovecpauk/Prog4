package core;

import util.ThingInterface;

public class Smell implements ThingInterface {
    private String name;
    public String characteristic;

    public Smell(){
        name = "запах";
        characteristic = "сильный";
    }

    public Smell(String name,String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }

    public String getCharacteristik(){
        return characteristic;
    }
    public String stood(){
        return "от которого в комнате стоял такой " + characteristic + " " + name + ", что";
    }

    public String wasNoticeble(){
        return "этот " + name + " был очень заметен";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smell that = (Smell) o;
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
        return "Класс Запаха";
    }
}
