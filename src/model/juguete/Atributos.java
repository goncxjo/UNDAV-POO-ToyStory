package model.juguete;

public class Atributos {
    private int antiguedad;
    private double porcentajeMetal;
    private boolean tieneBrazos;

    public Atributos(int antiguedad, double porcentajeMetal, boolean tieneBrazos) {
        this.antiguedad = antiguedad;
        this.porcentajeMetal = porcentajeMetal;
        this.tieneBrazos = tieneBrazos;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public double getPorcentajeMetal() {
        return porcentajeMetal;
    }

    public boolean tieneBrazos() {
        return tieneBrazos;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void setPorcentajeMetal(double porcentajeMetal) {
        this.porcentajeMetal = porcentajeMetal;
    }

    public void setTieneBrazos(boolean tieneBrazos) {
        this.tieneBrazos = tieneBrazos;
    }
}
