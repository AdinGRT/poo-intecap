package agrupaciones;

import integrantes.IIntegrante;

import java.util.List;

public interface IAgrupacionMusical {
    void addIntegrante(IIntegrante integrante);
    void removeIntegrante(IIntegrante integrante);
    List<IIntegrante> obtenerIntegrantes();
    int obtenerCantidadIntegrantes();
    String getTipoAgrupacion();

}
