package core;

import util.ThingInterface;

public class Owner implements ThingInterface {
    private String name;

    public Owner(){
        name = "хозяев";
    }

    public Owner(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner that = (Owner) o;
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
        return "Класс хозяина";
    }

    public class Head implements  ThingInterface{
        private String name;

        public String dizzy(){
            return "у " + Owner.this.name + " сейчас же начинала кружиться от одурения " + name;
        }

        @Override
        public String getName(){
            return name;
        }

    }
}
