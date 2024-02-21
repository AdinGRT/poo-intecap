package integrantes;

import instrumentos.IInstrumentoMusical;
import ensambles.IEnsamble;

public interface IIntegrante {
    String getIdentificador();
    String getNombre();
    IInstrumentoMusical verInstrumentoMusical();
    void asignarInstrumentoMusical(IInstrumentoMusical instrumentoMusical);
    void asignarEnsamble(IEnsamble ensamble);

}
