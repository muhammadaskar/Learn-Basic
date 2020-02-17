package com.askar.learnbasicprogramming.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Materi implements Parcelable {

    private String photoMateri;
    private String babMateri;
    private String judulMateri;
    private String isiMateri;
    private String video;

    public Materi(){

    }

    public Materi(String photoMateri, String babMateri, String judulMateri) {
        this.photoMateri = photoMateri;
        this.babMateri = babMateri;
        this.judulMateri = judulMateri;
    }

    public Materi(String photoMateri, String babMateri, String judulMateri, String isiMateri) {
        this.photoMateri = photoMateri;
        this.babMateri = babMateri;
        this.judulMateri = judulMateri;
        this.isiMateri = isiMateri;
    }

    public Materi(String photoMateri, String babMateri, String judulMateri, String isiMateri, String video) {
        this.photoMateri = photoMateri;
        this.babMateri = babMateri;
        this.judulMateri = judulMateri;
        this.isiMateri = isiMateri;
        this.video = video;
    }

    public String getPhotoMateri() {
        return photoMateri;
    }

    public void setPhotoMateri(String photoMateri) {
        this.photoMateri = photoMateri;
    }

    public String getBabMateri() {
        return babMateri;
    }

    public void setBabMateri(String babMateri) {
        this.babMateri = babMateri;
    }

    public String getJudulMateri() {
        return judulMateri;
    }

    public void setJudulMateri(String judulMateri) {
        this.judulMateri = judulMateri;
    }

    public String getIsiMateri() {
        return isiMateri;
    }

    public void setIsiMateri(String isiMateri) {
        this.isiMateri = isiMateri;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public static Creator<Materi> getCREATOR() {
        return CREATOR;
    }

    protected Materi(Parcel in) {
        photoMateri = in.readString();
        babMateri = in.readString();
        judulMateri = in.readString();
        isiMateri = in.readString();
        video = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(photoMateri);
        dest.writeString(babMateri);
        dest.writeString(judulMateri);
        dest.writeString(isiMateri);
        dest.writeString(video);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Materi> CREATOR = new Creator<Materi>() {
        @Override
        public Materi createFromParcel(Parcel in) {
            return new Materi(in);
        }

        @Override
        public Materi[] newArray(int size) {
            return new Materi[size];
        }
    };
}
