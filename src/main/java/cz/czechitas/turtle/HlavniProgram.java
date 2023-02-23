package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    private Turtle zofka = new Turtle();

    public void start() {
        zofka.setLocation(100.0,200.0);
        nakresliRovnostrannyTrojuhelnik(50);
        zofka.setLocation(300.0,200.0);
        nakresliCtverec(100);
        zofka.setLocation(400,400);
        nakresliKruh(30);
        zofka.setLocation(500,500);
        nakresliObdelnik(50);

    }

    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        // Zde lze používat proměnnou velikostStrany.
        // Jeji hodnota je takova, s jakou byla metoda zavolana
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
    }
    public void nakresliCtverec(double velikostStran){
        for(int i = 0; i < 4; i++) {
            zofka.move(velikostStran);
            zofka.turnRight(90);
        }
    }

    public void nakresliKruh(double velStran){
        for(int i = 0; i < 20; i++) {
        zofka.move(velStran);
        zofka.turnRight(20);
    }
    }

    public void nakresliObdelnik(double velikostStr){
        zofka.turnRight(50);
        for(int i = 0; i < 2; i++) {
            zofka.move(velikostStr);
            zofka.turnRight(90);
            zofka.move(100);
            zofka.turnRight(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

