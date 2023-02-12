package core;

import util.ThingInterface;

public class NewSuits implements ThingInterface {

    private String name;

    public NewSuits(){
        name = "Новые костюмы";
    }

    public NewSuits(String name){
        this.name = name;
    }

    @Override
    public String getName() {return name;}

    public String location(Closed closed, Table table, BookShelf bookShelf, Wall wall, ChairBacks chairBacks, Ceiling ceiling, Ropes ropes){
        return name + " лежали у него и в " + closed.getNameVPredlojnomPadeje() + ", и на " + closed.getNameVPredlojnomPadeje() + ", и на " + table.getNameVPredlojnomPadeje() +", и под " + table.getNameVTvoritelnomPadeje() + ", и на " + bookShelf.getNameVPredlojnomPadeje() + ", висели на " + wall.getNameVPredlojnomPadeje() + ", на " + chairBacks.getNameVPredlojnomPadeje() + " и даже под " + ceiling.getNameVTvoritelnomPadeje() + ", на " + ropes.getNameVPredlojnomPadeje();
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewSuits that = (NewSuits) o;
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
        return "Класс новой одежды";
    }
}
