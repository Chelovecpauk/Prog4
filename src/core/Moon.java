package core;

import util.ThingInterface;

public class Moon implements ThingInterface {
    private String name;

    public Moon(){
        name = "Луну";
    }

    public Moon(String name){
        this.name = name;
    }
    public String describeSurface(){
        return "поверхность Луны не ровная, а гористая, ";
    }
    public String describeMountains(){
        return "причем многие горы на Луне не такие, как у нас на Земле, а почему-то круглые, вернее сказать -- кольцеобразные";
    }
    public  String compareSurface(){
        return "что лунная поверхность очень похожа на поверхность хорошо пропеченного блина с его ноздреватыми дырками";
    }
    @Override
    public String getName() {return name;}


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moon that = (Moon) o;
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
        return "Класс Луны";
    }
}
