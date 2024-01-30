package Aquariumaufgabe;

public class Aquarium {
    private char[][] aquarium;
    private Fisch[] fishes;


    public Aquarium(char[][] aquarium, Fisch[] fisches) {
        this.aquarium = aquarium;
        this.fishes = fisches;
    }

    public void aquariumZeigen() {
        aquarium[aquarium.length - 1][0] = '+';
        aquarium[aquarium.length - 1][aquarium[0].length - 1] = '+';

        for (int i = 0; i < aquarium.length - 1; i++) {
            aquarium[i][0] = '|';
        }

        for (int i = 0; i < aquarium.length - 1; i++) {
            aquarium[i][aquarium[0].length - 1] = '|';
        }

        for (int i = 0; i < aquarium[0].length; i++) {
            aquarium[aquarium.length - 1][aquarium[0].length - (i + 1)] = '-';
        }

        aquarium[aquarium.length - 1][0] = '+';
        aquarium[aquarium.length - 1][aquarium[0].length - 1] = '+';

        for (int i = 0; i < aquarium.length; i++) {
            for (int j = 0; j < aquarium[i].length; j++) {
                if (aquarium[i][j] != '+' && aquarium[i][j] != '|' && aquarium[i][j] != '-') {
                    aquarium[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < fishes.length ; i++) {
            char [] fisch = fishes[i].getSymbol();
            if (fisch[0]=='>'&&aquarium[fishes[i].getY()][fishes[i].getX()+1]!='|'){
                for (int j = 0; j <fisch.length ; j++) {
                    aquarium[fishes[i].getY()][fishes[i].getX()+j]=fisch[j];


                }
            } else if (fisch[0]=='>'&&aquarium[fishes[i].getY()][fishes[i].getX()+1]=='|') {
                fishes[i].changeDirection();



            } else if (fisch[0]=='<'&&aquarium[fishes[i].getY()][fishes[i].getX()-1]=='|') {
                fishes[i].changeDirection();




            } else if (fisch[0]=='<'&&aquarium[fishes[i].getY()][fishes[i].getX()-1]!='|') {
                for (int j = 0; j <fisch.length ; j++) {
                    aquarium[fishes[i].getY()][fishes[i].getX()-j] = fisch[j];

                }
            }


        }



        for (int i = 0; i < aquarium.length; i++) {
            for (int j = 0; j < aquarium[i].length; j++) {
                System.out.print(aquarium[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void folgezustand() {
        for (int i = 0; i < fishes.length; i++) {

            fishes[i].move();

        }
        System.out.println();
        aquariumZeigen();

    }
}




