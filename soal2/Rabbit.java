class Rabbit extends Animal {
    private static final int MAX_AGE = 5; // Kelinci cepat mati

    @Override
    int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    void bertindak() {
        if (isAlive) {
            System.out.println("🐇 Kelinci (Umur " + age + "): Makan rumput & berkembang biak.");
            incrementAge();
        }
    }
}