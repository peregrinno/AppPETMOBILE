package com.example.myapphelloworld;

public class Usuario {

    private String email;
    private int password;

    Usuario(String email, int psw){
        this.email = email;
        this.password =  psw;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPassword(int psw){
        this.password = psw;
    }

    public int getPassword(){
        return this.password;
    }
}
