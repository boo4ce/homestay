/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nguye
 */
public class Room {
    private short roomID;
    private String name;
    private String kind;
    private short numBed;
    private int price;
    private boolean available;

    public Room(short roomID, String name, String kind, short numBed, boolean available, int price) {
        this.roomID = roomID;
        this.name = name;
        this.kind = kind;
        this.numBed = numBed;
        this.price = price;
        this.available = available;
    }

    public short getRoomID() {
        return roomID;
    }

    public void setRoomID(short roomID) {
        this.roomID = roomID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getNumBed() {
        return numBed;
    }

    public void setNumBed(short numBed) {
        this.numBed = numBed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
}
