public class FachadaComputadora {
    private CPU cpu;
    private Memoria memoria;
    private DiscoDuro discoDuro;

    public FachadaComputadora(){
        this.cpu = new CPU();
        this.memoria = new Memoria();
        this.discoDuro = new DiscoDuro();
    }
    public void iniciar(){
        System.out.println("Iniciando computadora...");
        cpu.iniciar();
        byte[] bootData = discoDuro.leer(0, 512);
        memoria.cargar(0, bootData);
        cpu.ejecutar();
        System.out.println("Computadora iniciada con exito");
    }
    public void apagar(){
        System.out.println("Apagando la computadora...");
        cpu.apagar();
        memoria.liberar(0);
        System.out.println("Computadora apagada");
    }
}
