package core;

import util.*;

public class Ponchik implements ThoughtsInterface, ThrowAwaySuitsInterface, ThingInterface {
    private String name;
    private final RiverEnum RIVER = RiverEnum.OGURCOVAIYA;

    public Ponchik(){
        name = "Пончик";
    }

    public Ponchik(String name){
        this.name = name;
    }

    public String natascat(){
        return name + " вместо них натаскал";
    }

    public String take(){
        return "брать";
    }

    public String hadToPoison(){
        return name + " приходилось ежедневно травить ее нафталином, ";
    }

    public String reek(){
        return name + " и сам пропах, насквозь этим одуряющим запахом,";
    }
    public String getUsedTo(){
        return "но настолько привык к нему,";
    }
    public String stopNoticing(){
        return "что даже перестал замечать";
    }

    public String comeToVisit(){
        return "Как только " + name + " приходил к кому-нибудь в гости,";
    }
    public String notBeAble(){
        return "По этой же причине " + name + " не имел даже возможности поиграть с коротышками во дворе";
    }
    public String feelOffended(){
        return "Нечего и говорить, что для Пончика это было страшно обидно, ";
    }
    public String hadTo() {
        return "и пришлось ему все ненужные для него костюмы отнести на чердак";
    }
    public String effectDriveAway(){
        return "Пончика" + effect.driveAway();
    }


    public String effectOpen() {
        return effect.open();
    }


    public String effectVentilate() {
        return effect.ventilate();
    }


    public String effectFaint() {
        return effect.faint();
    }


    public String effectGoCrazy() {
        return effect.goCrazy();
    }
    @Override
    public String getName() {return name;}

    @Override
    public String ponyat(Clothes clothes){
        return name + " понял, что теперь можно " + take() +  " в магазине " + clothes.getCharacteristic1() + " "  + clothes.getName() + ", какая только могла " + clothes.becomeNecessary();
    }

    @Override
    public String nedoumevat(NewSuits newSuits, House house){
        return "он стал недоумевать, к чему ему вся та " + newSuits.getName() + ", которая накопилась у него " + house.getNameVRoditelnomPadeje();
    }

    @Override
    public String vuibrat(Night night){
        return name + " выбрал " + night.getCharacteristic() + " " + night.getName();
    }

    @Override
    public String zavyazat(Knot knot){
        return name + " завязал " + knot.getCharacteristic() + " " + knot.getName();
    }

    @Override
    public String vuinesti(House house){
        return "вынес тайком из " + house.getNameVRoditelnomPadeje();
    }

    @Override
    public String utopit(){
        return "утопил в " + RIVER + " реке";
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ponchik that = (Ponchik) o;

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
        return "Класс Пончика";
    }

    EffectsOfBadSmellInterface effect = new EffectsOfBadSmellInterface() {
        @Override
        public String driveAway() {
            return " моментально прогоняли и";
        }

        @Override
        public String open() {
            return " поскорей открывали настежь все окна и двери, ";
        }

        @Override
        public String ventilate() {
            return "чтобы проветрить помещение,";
        }

        @Override
        public String faint() {
            return "иначе можно было упасть в обморок";
        }

        @Override
        public String goCrazy() {
            return "или сойти с ума";
        }
    };
}
