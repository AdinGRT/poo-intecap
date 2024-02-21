package integrantes;

import instrumentos.IInstrumentoMusical;

public class Musico extends Integrante {

    private IInstrumentoMusical instrumentoMusical;

    public Musico(String identificador, String nombre, IInstrumentoMusical instrumentoMusical) {
        super(identificador, nombre);
        this.instrumentoMusical = instrumentoMusical;
    }

    public Musico(String identificador, String nombre) {
        super(identificador, nombre);
    }

    @Override
    public IInstrumentoMusical verInstrumentoMusical() {
        return this.instrumentoMusical;
    }

    @Override
    public void asignarInstrumentoMusical(IInstrumentoMusical instrumentoMusical) {
        this.instrumentoMusical = instrumentoMusical;
    }
}
