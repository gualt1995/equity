package com.tndnc.equity.models;

public class Actor implements IPiece {
    private int id;
    private Position pos;

    public Actor(int id, int ncol, int nlig) {
        this.id = id;
        pos = new Position(ncol, nlig);
    }

    public int getId() {
        return id;
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }
}
