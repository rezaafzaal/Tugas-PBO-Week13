import java.util.Random;

abstract class Animal {
    protected int age;
    protected boolean isAlive;
    protected Random rand = new Random();

    public Animal() {
        this.age = 0;
        this.isAlive = true;
    }

    public void incrementAge() {
        age++;
        if (age > getMaxAge()) {
            isAlive = false;
            System.out.println("   (Mati karena tua)");
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    abstract int getMaxAge(); 
    abstract void bertindak(); 
}