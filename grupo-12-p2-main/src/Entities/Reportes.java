package Entities;

import uy.edu.um.prog2.adt.Entities.MyHashTableImp;

import java.util.Date;

public class Reportes implements Interfaces.Reportes {

    public static MyHashTableImp<Long, Usuario> listaUsuarios = new MyHashTableImp<>(5000);
    public static MyHashTableImp<Long, Tweet> listaTweets = new MyHashTableImp<>(5000);
    public static MyHashTableImp<Long, HashTag> listaHashtag = new MyHashTableImp<>(5000);

    @Override
    public void pilotosMasActivos() {

    }

    @Override
    public void usuariosMasTweets() {

    }

    @Override
    public void cantidadHastags(Date fecha) {

    }

    @Override
    public void hasthagMasUsado(Date fecha) {

    }

    @Override
    public void cuentasMasFavoritos() {

    }

    @Override
    public void cantidadTweets(String frase) {

    }
}
