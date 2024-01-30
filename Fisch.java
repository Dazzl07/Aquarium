package Aquariumaufgabe;

public class Fisch {
    private int x;
    private int y;
    private char[] symbol;

    public Fisch(int x, int y, char[] symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char[] getSymbol() {
        return symbol;
    }

    public void move() {
        if (symbol[0] == '>') {
            x++;
        } else if (symbol[0] == '<') {
            x--;
        }
    }




    public void changeDirection(){
        if (symbol[0]=='<'){
            symbol[0]='>';
            symbol[1]='<';
            symbol[2]='>';




        } else if (symbol[0]=='>') {
            symbol[0]='<';
            symbol[1]='>';
            symbol[2]='<';


        }

    }
}
