void main(){
    Random random = new Random();
    int totalSimulacoes = 1_000_000;
    int pontosDentroDaCurva = 0;

    double areaTeorica = (double) 1/3; //Fiz a integral para chegar nesse valor
    double areaEstimada = 0;

    for (int i = 0; i < totalSimulacoes; i++){
        double x = random.nextFloat(0, 1);
        double y = random.nextFloat(0, 1);

        if(y <= x*x){
            pontosDentroDaCurva++;
        }

        if(i > 0 && i < 10){
            System.out.println();
            areaEstimada = (double) pontosDentroDaCurva / (i + 1);
            System.out.println("Resultado após " + (i + 1) + " testes: ");
            System.out.println("Área Correta: " + areaTeorica);
            System.out.println("Área Especulada: " + areaEstimada);
            System.out.println("Diferença: " + String.format("%.5f", (areaTeorica - areaEstimada)));
        }

        if(i > 0 && i < 1000 && (i % 100) == 0){
            System.out.println();
            areaEstimada = (double) pontosDentroDaCurva / (i + 1);
            System.out.println("Resultado após " + (i + 1) + " testes: ");
            System.out.println("Área Correta: " + areaTeorica);
            System.out.println("Área Especulada: " + areaEstimada);
            System.out.println("Diferença: " + String.format("%.5f", (areaTeorica - areaEstimada)));
        }


        if(i > 0 && i < 10_000 && (i % 1000) == 0){
            System.out.println();
            areaEstimada = (double) pontosDentroDaCurva / (i + 1);
            System.out.println("Resultado após " + (i + 1) + " testes: ");
            System.out.println("Área Correta: " + areaTeorica);
            System.out.println("Área Especulada: " + areaEstimada);
            System.out.println("Diferença: " + String.format("%.5f", (areaTeorica - areaEstimada)));
        }


        if(i > 0 && i%100_000 == 0){
            System.out.println();
            areaEstimada = (double) pontosDentroDaCurva / (i + 1);
            System.out.println("Resultado após " + (i + 1) + " testes: ");
            System.out.println("Área Correta: " + areaTeorica);
            System.out.println("Área Especulada: " + areaEstimada);
            System.out.println("Diferença: " + String.format("%.5f", (areaTeorica - areaEstimada)));
        }
    }

    areaEstimada = (double) pontosDentroDaCurva / totalSimulacoes;

    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println("Resultado Final:");
    System.out.println("Área Correta: " + areaTeorica);
    System.out.println("Área Especulada: " + areaEstimada);
    System.out.println("Diferença: " + String.format("%.5f", (areaTeorica - areaEstimada)));
}