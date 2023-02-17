package core;

import util.RocketReadinessException;
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
    public String gotIntoWork(){
        return name + " тоже включился в работу по постройке космической ракеты и, ";
    }
    public String travele(Rocket rocket) throws RocketReadinessException {
        if(rocket.getReady()) {
            return "совершил с Фуксией и Селедочкой межпланетное путешествие";
        }else{throw new RocketReadinessException("Ракета не готова, дуранчоус");}
    }

    public String havingBeenOnTheMoon(){
        return "Пробыв на Луне около четырех часов, ";
    }
    public String beForced(){
        return name + " и его спутницы принуждены были поскорей отправиться в обратный путь,";
    }
    public String comeBackHome(){
        return "Вернувшись в Цветочный город";
    }
    public String tellALot(){
        return  name + " много рассказывал о своем путешествии";
    }
    public String didNotAgree(){
        return name + ", однако ж, не был согласен ни с вулканической, ни с метеоритной теорией";
    }
    public String createTheory(){
        return "Еще до путешествия на Луну он содал свою собственную теорию происхождения лунных кратеров";
    }
    public String observe(){
        return "Однажды он вместе со Стекляшкиным наблюдал Луну в телескоп, и ему бросилось в глаза, ";
    }
    public String lookOn(){
        return "После этого " + name + " часто ходил на кухню и наблюдал, как ";
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
