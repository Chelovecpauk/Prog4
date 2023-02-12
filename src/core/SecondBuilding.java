package core;

import util.LinkingWordEnum;
import util.RevolvingBuildingAbstract;

public class SecondBuilding extends RevolvingBuildingAbstract {
    private String height;

    public SecondBuilding(){
        super("Одно");
        height = "пятиэтажное";
    }

    public SecondBuilding(String name, String height, String type){
        super(name);
        this.height = height;
    }

    public String getHeight(){
        return height;
    }

    @Override
    public String upbuild(){
        return getName() + " возведено";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondBuilding that = (SecondBuilding) o;
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
    public String toString() {
        return "Класс второго здания";
    }

    public class Balcon{
        private String name;
        private String typeOfBalcon;

        public String getName() {
            return name;
        }
        public String getTypeOfBalcon() {
            return typeOfBalcon;
        }

        public Balcon(){
            name = "балконами";
            typeOfBalcon = "качающимися";
        }
        public Balcon(String name, String typeOfBalcon){
            this.name = name  ;
            this.typeOfBalcon = typeOfBalcon;
        }

        public String designateBuilding(){
            return SecondBuilding.this.getName() + " " + SecondBuilding.this.height + ", c " + typeOfBalcon + " " + name + ", ";
        }
    }

    public class Tower {
        private String name;
        private String typeOfTower;


        public String getName() {
            return name;
        }

        public String getTypeOfTower() {
            return typeOfTower;
        }

        public Tower() {
            name = "вышкой";
            typeOfTower = "парашютной";
        }

        public Tower(String name, String typeOfBalcon) {
            this.name = name;
            this.typeOfTower = typeOfBalcon;
        }

        public String declareTower() {
            return typeOfTower + " " + name;
        }
    }

    public class Wheel {
        private String name;
        private String typeOfWheel;
        private String location;

        Wheel() {
            typeOfWheel = "чертовым";
            name = "колесом";
            location = "на крыше";
        }

        Wheel(String name, String typeOfPool, String location) {
            this.name = name;
            this.typeOfWheel = typeOfPool;
            this.location = location;
        }

        public String declareWheel() {
            return " и " + typeOfWheel + " " + name + " " + location;
        }
    }
}
