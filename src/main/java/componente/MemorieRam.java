package componente;

public class MemorieRam {
    private String tipMemorie;
    private int capacitate;
    private String unitateDeMasura;

    public MemorieRam(String tipMemorie,int capacitate,String unitateDeMasura){
        this.tipMemorie = tipMemorie;
        this.capacitate = capacitate;
        this.unitateDeMasura = unitateDeMasura;
    }

    public String getTipMemorie(){
        return tipMemorie;
    }

    public void setTipMemorie(String tipMemorie) {
        this.tipMemorie = tipMemorie;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public String getUnitateDeMasura() {
        return unitateDeMasura;
    }

    public void setUnitateDeMasura(String unitateDeMasura) {
        this.unitateDeMasura = unitateDeMasura;
    }
}
