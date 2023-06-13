package Entities;

import uy.edu.um.prog2.adt.Entities.*;

import java.util.Objects;

public class Usuario {

    //VARIABLES
    private long id;
    private String name;
    private MyHashTableImp tweets;

    //CONSTRUCTOR VACIO
    public Usuario() {
    }

    //CONSTRUCTOR COMPLETO
    public Usuario(long id, String name, MyHashTableImp tweets) {
        this.id = id;
        this.name = name;
        this.tweets = tweets;
    }

    //GETTERS & SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyHashTableImp getTweets() {
        return tweets;
    }

    public void setTweets(MyHashTableImp tweets) {
        this.tweets = tweets;
    }

    //EQUALS & HASHCODE
    //Un usuario va ser igual a otro <=> el id es el mismo.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
