package com.example.exameneval1;

import android.graphics.drawable.Drawable;

public class Localidad {
    private String localidad;
    private String provincia;
    private String ubicacion;
    private Drawable imagen;
    private String web;

    public Localidad(String localidad, String provincia, String ubicacion, Drawable imagen, String web) {
        this.localidad = localidad;
        this.provincia = provincia;
        this.ubicacion = ubicacion;
        this.imagen = imagen;
        this.web = web;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public Drawable getImagen() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }
}
