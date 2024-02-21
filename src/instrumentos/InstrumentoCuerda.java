package instrumentos;

public abstract class InstrumentoCuerda extends InstrumentoMusical {

    public InstrumentoCuerda(String identificador, String marca) {
        super(identificador, marca);
    }

    @Override
    public String getClasificacion() {
        return "Cuerda";
    }
}
