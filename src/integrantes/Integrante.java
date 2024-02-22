package integrantes;

import agrupaciones.IAgrupacionMusical;

public abstract class Integrante implements IIntegrante{

    private String identificador;
    private String nombre;

    public Integrante(String identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    @Override
    public String getIdentificador() {
        return this.identificador;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void asignarEnsamble(IAgrupacionMusical ensamble) {
        ensamble.addIntegrante(this);
    }
}
