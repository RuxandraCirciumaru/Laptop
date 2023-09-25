package componente;

public class MemorieSSd {
    private int capacitateStocare;
    private String UnitMasura;

    public MemorieSSd(int capacitateStocare, String UnitMasura){
        this.capacitateStocare = capacitateStocare;
        this.UnitMasura = UnitMasura;
    }

    public int getCapacitateStocare() {
        return capacitateStocare;
    }

    public void setCapacitateStocare(int capacitateStocare) {
        this.capacitateStocare = capacitateStocare;
    }

    public String getUnitMasura() {
        return UnitMasura;
    }

    public void setUnitMasura(String unitMasura) {
        this.UnitMasura = unitMasura;
    }
}

