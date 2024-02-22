package agrupaciones;

import integrantes.IIntegrante;

import java.util.HashMap;
import java.util.Map;

public abstract class AgrupacionMusical implements IAgrupacionMusical {

    private String identificador;
    private String nombre;
    private Map<String, IIntegrante> integrantes;
    private int integrantesActivos;

    public AgrupacionMusical(String identificador, String nombre, int integrantesActivos) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.integrantesActivos = integrantesActivos;
        this.integrantes = new HashMap<>();
    }

    @Override
    public void addIntegrante(String identificador, IIntegrante integrante) {
        this.integrantes.put(identificador, integrante);
        this.integrantesActivos++;
    }

    @Override
    public void removeIntegrante(IIntegrante integrante) {
        this.integrantes.remove(integrante.getIdentificador());
        this.integrantesActivos--;
    }

    @Override
    public Map<String, IIntegrante> obtenerIntegrantes() {
        return this.integrantes;
    }

    @Override
    public int obtenerCantidadIntegrantesActivos() {
        return integrantesActivos;
    }
}
