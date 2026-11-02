void main(){

    Random random = new Random();

    int dias = 30;

    int visitantesEngajados = 0;
    int visitantesMedianamenteEngajados = 0;
    int visitantesPoucoEngajados = 0;

    double lucroMensalEsperado = dias * (0.4*0.5*100 + 0.35*0.3*50 + 0.25*0.1*20);
    double lucroSimuladoAcumulado = 0;

    for (int i = 0; i < dias; i++){
        int demanda = random.nextInt(1, 101);
        if(demanda <= 40){
            visitantesEngajados++;
        } else if (demanda <= 75) {
            visitantesMedianamenteEngajados++;
        }
        else {
            visitantesPoucoEngajados++;
        }

        lucroSimuladoAcumulado = visitantesEngajados*0.5*100 + visitantesMedianamenteEngajados*0.3*50 + visitantesPoucoEngajados*0.1*20;

        System.out.println();
        System.out.println("Dia " + (i+1));
        System.out.println("Lucro Mensal: " + lucroMensalEsperado);
        System.out.println("Lucro: " + lucroSimuladoAcumulado);
        System.out.println("Diferença: " + (lucroMensalEsperado - lucroSimuladoAcumulado) );
    }

    System.out.println();
    System.out.println();

    System.out.println("Resultado Final após " + dias + " dias: ");
    System.out.println("Lucro Mensal: " + lucroMensalEsperado);
    System.out.println("Lucro final: " + lucroSimuladoAcumulado);
    System.out.println("Diferença: " + (lucroMensalEsperado - lucroSimuladoAcumulado) );
}