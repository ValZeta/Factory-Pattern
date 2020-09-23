package factory.pattern;

public class SekolahFactory {
    
    public Sekolah getSekolah(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("SISWA")){
            return new Siswa();
        } else if(shapeType.equalsIgnoreCase("ALAMAT")){
            return new Alamat();
        } else if(shapeType.equalsIgnoreCase("TELPON")){
            return new Telpon();
        }
        return null;
    }
}