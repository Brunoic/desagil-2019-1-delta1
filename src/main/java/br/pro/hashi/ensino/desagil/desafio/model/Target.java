package br.pro.hashi.ensino.desagil.desafio.model;
import java.util.Random;




public class Target extends Element {
    private final Board board;


    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;

    }


    public void move () {
        if(!board.isWall(row,col)){
            int r = new Random().nextInt(4);
            if(r == 0 && !board.isWall(row+1,col)){
                move(1,0);
            }
            if(r == 1 && row >0 && !board.isWall(row-1,col)){
                move(-1,0);
            }
            if(r == 2 && !board.isWall(row,col+1)){
                move(0,1);;
            }
            if(r == 3 && !board.isWall(row,col-1)){
                move(0,-1);;
            }

        }
    }
}




















