public class DiscoDuro {
    public byte[] leer (long lba, int tamano){
        System.out.println("Leyendo " + tamano + " bytes desde el sector " + lba);
        return new byte[tamano]; 
    }
}
