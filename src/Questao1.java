void main(){

    Random random = new Random();

    int dias = 30;

    int altaDemanda = 0;
    int mediaDemanda = 0;
    int baixaDemanda = 0;

    double lucroMensalEsperado = dias * (0.5 *2000 + 0.3*1200 + 0.2*500);
    double lucroSimuladoAcumulado = 0;

    for (int i = 0; i < dias; i++){
        int demanda = random.nextInt(1, 101);
        if(demanda <= 50){
            altaDemanda++;
        } else if (demanda <= 80) {
            mediaDemanda++;
        }
        else {
            baixaDemanda++;
        }

        lucroSimuladoAcumulado = altaDemanda*2000 + mediaDemanda*1200 + baixaDemanda*500;

        System.out.println();
        System.out.println("Dia " + (i+1));
        System.out.println("Lucro Mensal: " + lucroMensalEsperado);
        System.out.println("Lucro: " + lucroSimuladoAcumulado);
        System.out.println("Diferença: " + (lucroMensalEsperado - lucroSimuladoAcumulado) );
    }

    System.out.println();
    System.out.println();

    System.out.println("Resultado Final após "+ dias +" dias: ");
    System.out.println("Lucro Mensal: " + lucroMensalEsperado);
    System.out.println("Lucro final: " + lucroSimuladoAcumulado);
    System.out.println("Diferença: " + (lucroMensalEsperado - lucroSimuladoAcumulado) );
}