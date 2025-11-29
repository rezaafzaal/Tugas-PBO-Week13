class Fox extends Animal {
    private static final int MAX_AGE = 10; // Rubah hidup lebih lama

    @Override
    int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    void bertindak() {
        if (isAlive) {
            System.out.println("🦊 Rubah (Umur " + age + "): Mencari kelinci untuk dimangsa.");
            incrementAge();
        }
    }
}