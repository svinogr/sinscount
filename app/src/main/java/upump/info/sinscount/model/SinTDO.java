package upump.info.sinscount.model;

public class SinTDO {
    private int id;
    private int idDay;
    private EnumSins enumSins;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDay() {
        return idDay;
    }

    public void setIdDay(int idDay) {
        this.idDay = idDay;
    }

    public EnumSins getEnumSins() {
        return enumSins;
    }

    public void setEnumSins(EnumSins enumSins) {
        this.enumSins = enumSins;
    }
}
