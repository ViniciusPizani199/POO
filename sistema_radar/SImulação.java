package sistema_radar;

public class SImulação {
    public static void main(String[] args) {
        Carro opala = new Carro();
        opala.ano = 76;
        opala.modelo = "Comodoro";
        opala.placa = "ACRL300";
        opala.velocidade = 0;

        Radar radar = new Radar();
        radar.localização = "Pistão Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(opala);

        opala.acelerar(); // 10
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar();
        opala.acelerar(); // 70

        radar.avaliarVelocidade(opala);
    }
}
