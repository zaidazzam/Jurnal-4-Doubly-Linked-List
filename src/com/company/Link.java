package com.company;

public class Link {
     private String judulLagu;
     private String penyanyi;

    public Link (String judulLagu, String penyanyi){
        this.judulLagu = judulLagu;
        this.penyanyi = penyanyi;
    }

    public String getjudulLagu(){
        return this.judulLagu;
    }

    @Override
    public String toString() {
        return this.judulLagu;
    }
}

