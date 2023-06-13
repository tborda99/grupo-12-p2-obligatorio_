package Entities;

import uy.edu.um.prog2.adt.Entities.MyHashTableImp;

import java.util.Objects;

public class Tweet {

    //VARIABLES
    private long id; //codigo identificador del tweet
    private String content; //contenido escrito del tweet
    private String source; //TODO: ni idea que es esto
    private boolean isRetweet; //si es un retweet (lo publico alguien más y el usuario lo retweetio

    private long user_id; //id del usuario que lo publico.
    private MyHashTableImp hashtag; //los hashtags que se usan en el tweet.


    //CONSTRUCTOR VACIO
    public Tweet() {
    }

    //CONSTRUCTOR COMPLETO


    public Tweet(long id, String content, String source, boolean isRetweet, long user_id, MyHashTableImp hashtag) {
        this.id = id;
        this.content = content;
        this.source = source;
        this.isRetweet = isRetweet;
        this.user_id = user_id;
        this.hashtag = hashtag;
    }

    //GETTERS & SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public boolean isRetweet() {
        return isRetweet;
    }

    public void setRetweet(boolean retweet) {
        isRetweet = retweet;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public MyHashTableImp getHashtag() {
        return hashtag;
    }

    public void setHashtag(MyHashTableImp hashtag) {
        this.hashtag = hashtag;
    }

    //EQUALS & HASHCODE
    //Un tweet va ser igual a otros <=> tiene mismo id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tweet tweet = (Tweet) o;
        return id == tweet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
