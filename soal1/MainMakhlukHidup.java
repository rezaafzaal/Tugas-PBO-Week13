public class MainMakhlukHidup {
    public static void main(String[] args) {
        System.out.println("=== IMPLEMENTASI ABSTRACT CLASS MAKHLUK HIDUP ===");
        
        // Kita tidak bisa melakukan: new MakhlukHidup("Test"); -> Error
        
        MakhlukHidup m = new Manusia("Reza (Manusia)");
        MakhlukHidup h = new Hewan("Kucing (Hewan)");
        MakhlukHidup t = new Tumbuhan("Bunga Matahari (Tumbuhan)");

        m.info(); m.bernafas(); m.bergerak(); System.out.println();
        h.info(); h.bernafas(); h.bergerak(); System.out.println();
        t.info(); t.bernafas(); t.bergerak();
    }
}