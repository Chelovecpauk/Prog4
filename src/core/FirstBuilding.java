package core;

import util.RevolvingBuildingAbstract;
import util.LinkingWordEnum;

public class FirstBuilding extends RevolvingBuildingAbstract {
    private String height;
    private String type;

    public FirstBuilding(){
        super("Одно");
        height = "пятиэтажное";
        type = "башенного типа";
    }

    public FirstBuilding(String name, String height, String type){
        super(name);
        this.height = height;
        this.type = type;
    }

    public String getType(){
        return type;
    }
    public String getHeight(){
        return height;
    }

    @Override
    public String upbuild(){
        return getName() + " построено";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstBuilding that = (FirstBuilding) o;
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
        return "Класс Первого здания";
    }

    public class Descent{
        private String name;
        private String typeOfDescent;
        public Descent(){
            typeOfDescent = "спиральным";
            name = "спуском";
        }
        public Descent(String name, String typeOfDescent){
            this.name = name;
            this.typeOfDescent = typeOfDescent;
        }

        public String designateBuilding(){
            return FirstBuilding.this.getName() + " " + FirstBuilding.this.height + ", " + FirstBuilding.this.type + ", со " + typeOfDescent + " " + name;
        }
        public String goingDown(){
            return "(спустившись по " + typeOfDescent + " " + name + ", ";
        }
    }

    public class Pool {
        private String name;
        private String typeOfPool;
        private String location;

        public Pool() {
            typeOfPool = "плавательным";
            name = "бассейном";
            location = "вокруг";
        }

        public Pool(String name, String typeOfPool, String location) {
            this.name = name;
            this.typeOfPool = typeOfPool;
            this.location = location;
        }

        public String declarePool() {
            return " и " + typeOfPool + " " + name + " " + location;
        }
        public String dive(LinkingWordEnum link1, LinkingWordEnum link2, Water water){
            return link1.getTranslation() + " нырять " + link2.getTranslation() + " в " + water.getName() + "),";
        }
    }
}
