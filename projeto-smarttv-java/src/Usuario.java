public class Usuario{
    public static void main(String[] args) throws Exception {
       

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        smartTv.mudarCanal(26);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();

        smartTv.desligar();

    }

}
