package Aquariumaufgabe;

public class TestAquarium {
    public static void main(String[] args) {
        char[][] aquarium = new char[10][20];
        Fisch[] fishes = new Fisch[3];
        char[] riba = {'>', '<', '>'};
        char[] riba2 = {'>', '<', '>'};
        char[] riba3 = {'<', '>', '<'};
        fishes[0] = new Fisch(4, 1, riba);
        fishes[1] = new Fisch(3, 0, riba2);
        fishes[2] = new Fisch(5, 5, riba3);

        Aquarium aquariu2 = new Aquarium(aquarium, fishes);
        aquariu2.aquariumZeigen();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();
        aquariu2.folgezustand();

    }
}
