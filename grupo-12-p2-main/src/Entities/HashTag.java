package Entities;

import uy.edu.um.prog2.adt.Entities.MyHashTableImp;

import java.util.Objects;

public class HashTag {

    //VARIABLES
    private long id; //Identificador del hashtag
    private String text; //Texto del hashtag

    private MyHashTableImp tweet; //Lista de tweets que usan ese hashtag

    //CONSTRUCTOR VACIO
    public HashTag() {
    }

    //CONSTRUCTOR COMPLETO

    public HashTag(long id, String text, MyHashTableImp tweet) {
        this.id = id;
        this.text = text;
        this.tweet = tweet;
    }

    //GETTERS & SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public MyHashTableImp getTweet() {
        return tweet;
    }

    public void setTweet(MyHashTableImp tweet) {
        this.tweet = tweet;
    }

    //EQAULS & HASHCODE
    //Un hastag va ser igual a otro <=> su id es el mismo.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTag hashTag = (HashTag) o;
        return id == hashTag.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
