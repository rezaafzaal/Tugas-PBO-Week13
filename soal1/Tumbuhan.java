class Tumbuhan extends MakhlukHidup {
    public Tumbuhan(String nama) {
        super(nama);
    }

    @Override
    public void bernafas() {
        System.out.println("  -> Bernafas (respirasi) melalui Stomata dan Lentisel.");
    }

    @Override
    public void bergerak() {
        System.out.println("  -> Bergerak pasif (tumbuh ke arah cahaya/akar ke air).");
    }
}