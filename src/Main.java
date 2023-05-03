public class Main {

    public static void main(String[] args) {
        int distancia = 100; // km
        int velocidadeCarro = 110; // km/h
        int velocidadeCaminhao = 80; // km/h
        int tempoPedagio = 5; // min

        // Transformando o tempo de pedágio em horas
        double tempoPedagioHoras = tempoPedagio / 60.0;

        // Calculando o tempo
        double tempoCarro = distancia / (velocidadeCarro * 1.0);

        // Calculando o tempo com os pedágios
        double tempoCaminhao = (distancia / (velocidadeCaminhao * 1.0)) + (2 * tempoPedagioHoras);

        // Calculando a distância percorrida
        double distanciaCarro = tempoCarro * velocidadeCarro;

        // Calculando a distância percorrida pelo caminhão quando eles se cruzarem
        double distanciaCaminhao = distancia - (tempoCaminhao * velocidadeCaminhao);

        // Verificando qual veículo estará mais próximo de Ribeirão Preto
        if (distanciaCarro < distanciaCaminhao) {
            System.out.println("O carro estara mais perto de Ribeirão Preto.");
        } else if (distanciaCarro > distanciaCaminhao) {
            System.out.println("O caminhao estara mais perto de Ribeirao Preto.");
        } else {
            System.out.println("Os dois estarao na mesma distancia");
        }
    }
}
