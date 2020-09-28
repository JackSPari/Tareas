package entities;
import entities.Finca;

public class Vaca {
    int id;
    String arete;
    String fechaNaci;
    Finca fincaId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArete() {
        return arete;
    }

    public void setArete(String arete) {
        this.arete = arete;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }
}