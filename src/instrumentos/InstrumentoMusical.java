package instrumentos;

public abstract class InstrumentoMusical implements IInstrumentoMusical{
    private String identificador;
    private String marca;
    private boolean disponible;

    public InstrumentoMusical(String identificador, String marca) {
        this.identificador = identificador;
        this.marca = marca;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
