interface Animal {
    boolean feed(boolean timeToEat);

    void groom();

    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("The gorilla is being fed.");
            return true;
        } else {
            System.out.println("It's not feeding time yet.");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming the gorilla is complete.");
    }

    @Override
    public void pet() {
        System.out.println("Attempting to pet the gorilla...");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();

        myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}