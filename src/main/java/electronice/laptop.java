package electronice;

import componente.MemorieRam;
import componente.MemorieSSd;

public class laptop {

    private String marca;
    private String culoare;
    private double dimensiuneEcran;
    private MemorieSSd memorieSSd;
    private MemorieRam memorieRam;

    public laptop(String marca,String culoare,double dimensiuneEcran,MemorieSSd memorieSSd,MemorieRam memorieRam){
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
        this.memorieSSd = memorieSSd;
        this.memorieRam = memorieRam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }
    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public MemorieSSd getMemorieSSd() {
        return memorieSSd;
    }

    public void setMemorieSSd(MemorieSSd memorieSSd) {
        this.memorieSSd = memorieSSd;
    }

    public MemorieRam getMemorieRam() {
        return memorieRam;
    }

    public void setMemorieRam(MemorieRam memorieRam) {
        this.memorieRam = memorieRam;
    }
}
