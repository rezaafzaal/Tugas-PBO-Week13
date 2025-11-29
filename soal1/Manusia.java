class Manusia extends MakhlukHidup {
    public Manusia(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println("  -> Bernafas menggunakan Paru-paru.");
    }

    @Override
    public void bergerak() {
        System.out.println("  -> Bergerak dengan berjalan kaki (bipedal).");
    }
}