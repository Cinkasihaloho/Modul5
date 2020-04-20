public class Kel3_settergetter {

    public static void main(String[] args) {
        
        //membuat objek mobil
        Kel3_settergetter mobil_baru = new Kel3_settergetter2();
        
        //mengatur nilai atribut
        mobil_baru.setMerk("Mitsubishi");
        mobil_baru.setTipe("Mirage");
        mobil_baru.setWarna("merah");
        mobil_baru.setJenisBBM("Pertamax");
        
        //mencetak nilai
        System.out.println("Saya punya mobil dengan merk " + mobil_baru.getMerk());
        System.out.print(mobil_baru.getMerk() + " " + mobil_baru.getTipe());
        System.out.println(" berwarna " + mobil_baru.getWarna());
        System.out.println("Mobil saya menggunakan bensin berjenis " + mobil_baru.getJenisBBM() + ".");    
}
}
