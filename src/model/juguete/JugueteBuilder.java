package model.juguete;

public class JugueteBuilder {
    private Juguete juguete;
    private Atributos atributos;

    public JugueteBuilder() {
        this.juguete = new Juguete();
        this.atributos = new Atributos(0,0,false);
    }

    public JugueteBuilder antiguedad(int antiguedad) {
        this.atributos.setAntiguedad(antiguedad);
        return this;
    }

    public JugueteBuilder porcentajeMetal(double porcentaje) {
        this.atributos.setPorcentajeMetal(porcentaje);
        return this;
    }

    public JugueteBuilder agregarBrazos() {
        this.atributos.setTieneBrazos(true);
        return this;
    }

    public Juguete build() {
        this.juguete.setAtributos(this.atributos);
        return this.juguete;
    }
}
