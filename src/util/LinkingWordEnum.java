package util;

public enum LinkingWordEnum {
    WHERE("где"), FOR("для"), SINCETHEN("С тех пор как"),ALTHOUGH("хотя"), BUT("но"), WHEN("когда"), ITCOULDBE("можно было"), STRAIGHT("прямо");
    private String translation;

    public String getTranslation(){
        return translation;
    }
    LinkingWordEnum(String translation){
        this.translation = translation;
    }
}
