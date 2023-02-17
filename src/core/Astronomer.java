package core;

import util.ThingInterface;

public class Astronomer implements ThingInterface {
    private String name;

    public Astronomer(){
        name = "Стекляшкина";
    }
    public Astronomer(String name){
        this.name = name;
    }
    public String observe(){
        return "не раз наблюдал Луну в телескоп";
    }
    public String managedToSee(){
        return "В свой телескоп " + name + " сумел раглядеть, что";
    }

    public String quarrel(){
        return "В солнечном городе все астрономы даже поссорились между собой,";
    }
    public String tryToSolve(){
        return "стараясь разрешить этот сложный вопрос,";
    }
    public String splitUp(){
        return "и разделились на две половины";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Astronomer that = (Astronomer) o;
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
        return "Класс про астронома";
    }
}
