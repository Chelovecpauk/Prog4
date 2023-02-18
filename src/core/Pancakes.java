package core;

import util.LinkingWordEnum;
import util.ThingInterface;

public class Pancakes implements ThingInterface {
    private String name;
    private static String characteristic;

    public Pancakes(){
        name = "блины";
        characteristic = "жидкий";
    }

    public Pancakes(String name, String characteristic){
        this.name = name;
        this.characteristic = characteristic;
    }
    public String bake(){
        return "пекутся " + name;
    }
    public String warmUp(LinkingWordEnum link1, LinkingWordEnum link2){
        return link1.getTranslation() + " " + link2.getTranslation() + " он подогревается на сковородке,";
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pancakes that = (Pancakes) o;
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
        return "Класс блинов";
    }

    public static class Surface{
        private String name = "поверхность";
        private static String condition = "совершенно гладкая";
        public Surface(){}
        public Surface(String name){
            this.name = name;
        }
        public Surface(String name, String condition){
            this.name = name;
            this.condition = condition;
        }
        public String getName(){
            return name;
        }

        public static String returnCondition(){
            return "что пока блин " + characteristic + ", его поверхность " + condition;
        }
    }

    public class Bubbles{
        private String name;

        public Bubbles(){
            name = "пузырьки";
        }
        public Bubbles(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
        public String startToAppear(String nameOfSurface){
            Surface surface = new Surface(nameOfSurface);
            return "на его " + surface.getName() + " начинают появляться " + Bubbles.this.getName() + " нагретого пара";
        }
        public String breakSurface(){
            return "Проступив на поверхность блина,";
        }
        public String burst(){
            return name + " лопаются,";
        }
    }
}
