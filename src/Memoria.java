public class Memoria {
    public void cargar(long posicion, byte[] datos){
        System.out.println("Cargando datos en la posicion " + posicion);
    }
    public void liberar(long posicion){
        System.out.println("Liberando memoria en la posicion " + posicion);
    }
}
