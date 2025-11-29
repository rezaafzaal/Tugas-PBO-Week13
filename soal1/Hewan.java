class Hewan extends MakhlukHidup {
    public Hewan(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println("  -> Bernafas menggunakan Paru-paru/Insang/Trakea.");
    }

    @Override
    public void bergerak() {
        System.out.println("  -> Bergerak menggunakan kaki, sirip, atau sayap.");
    }
}