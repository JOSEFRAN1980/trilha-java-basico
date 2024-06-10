public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("CANAL ATUAL: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("CANAL ATUAL: " +smartTv.canal);

        System.out.println("volume atual : " + smartTv.volume);

        System.out.println("TV LIGADA ?" +smartTv.ligada);
        System.out.println("CANAL ATUAL: " +smartTv.canal);
        System.out.println("VOLUME ATUAL: " +smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status -> : TV LIGADA : "  +smartTv.ligada);
    }
}
