package agrupaciones;

import integrantes.IIntegrante;

import java.util.Map;

public interface IAgrupacionMusical {
    String getIdentificador();
    String getNombre();
    void addIntegrante(String identificador, IIntegrante integrante);
    void removeIntegrante(IIntegrante integrante);
    Map<String, IIntegrante> obtenerIntegrantes();
    int obtenerCantidadIntegrantesActivos();
    String getTipoAgrupacion();

}
