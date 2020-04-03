package com.example.projectuts.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    private String gambarAlbum,judulAlbum,daftarLagu;

    public String getJudulAlbum() {
        return judulAlbum;
    }

    public void setJudulAlbum(String judulAlbum) {
        this.judulAlbum = judulAlbum;
    }

    public String getDaftarLagu() {
        return daftarLagu;
    }

    public void setDaftarLagu(String daftarLagu) {
        this.daftarLagu = daftarLagu;
    }

    public String getGambarAlbum() {
        return gambarAlbum;
    }

    public void setGambarAlbum(String gambarAlbum) {
        this.gambarAlbum = gambarAlbum;
    }

    public Song() {
    }

    protected Song(Parcel in) {
        judulAlbum = in.readString();
        daftarLagu = in.readString();
        gambarAlbum = in.readString();
    }

    public static final Creator<Song> CREATOR = new Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel in) {
            return new Song(in);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(judulAlbum);
        parcel.writeString(daftarLagu);
        parcel.writeString(gambarAlbum);
    }
}
