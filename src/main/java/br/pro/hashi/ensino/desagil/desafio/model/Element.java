package br.pro.hashi.ensino.desagil.desafio.model;

public class Element {
    protected int row;
    protected int col;

    protected Element(int row, int col) {
        this.row = row;
        this.col = col;
    }

    void move(int rowShift, int colShift) {
        row += rowShift;
        col += colShift;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}
