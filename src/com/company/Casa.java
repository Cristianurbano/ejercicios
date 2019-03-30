package com.company;

public class Casa {



    private String direccion;
    private int codigoPostal;
    private int rooms;
    private int size;

    public Casa(String direccion, int codigoPostal, int rooms, int size) {
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.rooms = rooms;
        this.size = size;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", codigoPostal=" + codigoPostal +
                ", rooms=" + rooms +
                ", size=" + size +
                '}';
    }
}
