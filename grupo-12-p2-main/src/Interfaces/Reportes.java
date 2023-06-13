package Interfaces;

import java.util.Date;

public interface Reportes {

    //Los hice todos void, para que impriman dentro del metodo y sea menos engorroso el front end.

    void pilotosMasActivos();

    void usuariosMasTweets();

    void cantidadHastags(Date fecha);

    void hasthagMasUsado(Date fecha);

    void cuentasMasFavoritos();

    void cantidadTweets(String frase);
}
