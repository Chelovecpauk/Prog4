package util;

public enum PronounEnum {
    THEM("ними"), SOME("кое-какие"), MYSELF("себя");
    private String translation;
    public String getTranslation(){
        return translation;
    }

    PronounEnum(String translation){
        this.translation = translation;
    }
    public String getTraslation(){
        return translation;
    }
}
