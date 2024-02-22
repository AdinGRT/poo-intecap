package integrantes;

import instrumentos.IInstrumentoMusical;
import agrupaciones.IAgrupacionMusical;

public interface IIntegrante {
    String getIdentificador();
    String getNombre();
    IInstrumentoMusical verInstrumentoMusical();
    void asignarInstrumentoMusical(IInstrumentoMusical instrumentoMusical);
    void asignarEnsamble(IAgrupacionMusical ensamble);

}
