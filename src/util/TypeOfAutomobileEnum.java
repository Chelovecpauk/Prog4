package util;

public enum TypeOfAutomobileEnum {
    SPIRALEHOD("Спиралеходов"),TRUBOLET("Труболетов"),AVIAGIDROMOTOKOLIASKA("Авиагидромотоколясок"), GUSENICHNIVESDEHOD("Гусенничных вездеходов");
    private String translation;
    public String getTranslation(){
        return translation;
    }

    TypeOfAutomobileEnum(String translation){
        this.translation = translation;
    }
}
