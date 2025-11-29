abstract class MakhlukHidup {
    protected String nama;

    public MakhlukHidup(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama Spesies: " + nama);
    }

    public abstract void bernafas();
    public abstract void bergerak();
}