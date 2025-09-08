package sistema_radar;

public class SImulação {
    public static void main(String[] args) {
        Carro opala = new Carro("ACRL300", 0, 76, "Comodoro");
        
        Radar radar = new Radar("Pistão Sul", 60);

        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); // 70
        opala.setVelocidade(-60);
        radar.avaliarVelocidade(opala);
    }
}
