package sistema_radar;

public class Radar {

    public String localização;
    public Integer limiteVelocidade;

    public void emitirNotificação(String placa, Integer velocidadeObservada) {
        System.out.println("placa: " +placa);
        System.out.println("velocidede observada: " +velocidadeObservada);
        System.out.println("localização: " +this.localização);
        System.out.println("velocidade da via: " +this.limiteVelocidade);
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            emitirNotificação(carro.placa, carro.velocidade);
        }
    }
}