public class SimulasiFoxRabbit {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI FOXES AND RABBITS (ABSTRACT) ===");

        Animal[] ekosistem = { new Rabbit(), new Fox() };

        for (int i = 1; i <= 6; i++) {
            System.out.println("\n--- Putaran ke-" + i + " ---");
            for (Animal a : ekosistem) {
                if (a.isAlive()) {
                    a.bertindak();
                }
            }
        }
    }
}