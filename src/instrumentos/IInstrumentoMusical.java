package instrumentos;

public interface IInstrumentoMusical {

    void tocarDemo();

    String getIdentificador();

    String getClasificacion();

    String getMarca();

    boolean isDisponible();

    void setDisponible(boolean disponible);

}
