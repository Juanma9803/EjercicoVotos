import java.util.Scanner;

public class EjercicioVotos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Sistema de votación representante municipal ***");

        double candidato1 =0;
        double candidato2 =0;
        double candidato3 =0;

        double votoInternet = 700000;
        double votoRadio = 200000;
        double votoTelevision= 600000;

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosBlanco = 0;

        int voto;
        int medio;

        do {
            System.out.print("\nIngrese su voto\n1. candidato1\n2. candidato2\n3. candidato3\n4. voto en blanco\n5. salir");
            voto = sc.nextInt();

            switch (voto) {
                case 1:
                    System.out.println("*** Votó por el candidato 1 ***");
                    System.out.println("Indique el medio \n1. Internet\n2. Radio\n3. Televisión");
                    medio = sc.nextInt();
                    if (medio == 1) {
                        System.out.println("Indico el medio Internet");
                        candidato1 += votoInternet;
                    }else if(medio == 2){
                        System.out.println("Indico el medio Radio");
                        candidato1 += votoRadio;
                    }else if(medio == 3){
                        System.out.println("Indico el medio Televisión");
                        candidato1 += votoTelevision;
                    }
                    votosCandidato1++;
                    break;
                case 2:
                    System.out.println("*** Votó por el candidato 2 ***");
                    System.out.println("Indique el medio \n1. Internet\n2. Radio\n3. Televisión");
                    medio = sc.nextInt();
                    if (medio == 1) {
                        System.out.println("Indico el medio Internet");
                        candidato2 += votoInternet;
                    }else if(medio == 2){
                        System.out.println("Indico el medio Radio");
                        candidato2 += votoRadio;
                    }else if(medio == 3){
                        System.out.println("Indico el medio Televisión");
                        candidato2 += votoTelevision;
                    }
                    votosCandidato2++;
                    break;
                case 3:
                    System.out.println("*** Votó por el candidato 3 ***");
                    System.out.println("Indique el medio \n1. Internet\n2. Radio\n3. Televisión");
                    medio = sc.nextInt();
                    if (medio == 1) {
                        System.out.println("Indico el medio Internet");
                        candidato3 += votoInternet;
                    }else if(medio == 2){
                        System.out.println("Indico el medio Radio");
                        candidato3 += votoRadio;
                    }else if(medio == 3){
                        System.out.println("Indico el medio Televisión");
                        candidato3 += votoTelevision;
                    }
                    votosCandidato3++;
                    break;
                case 4:
                    System.out.println("*** Votó en blanco ***");
                    votosBlanco++;
                    break;
                case 5:
                    System.out.println("Fin de la votación");
                    break;
                default:
                    System.out.println("Voto inválido");
                    break;
            }
        } while (voto != 5);
        System.out.println("\n*** Costo de campaña por candidato ***");
        System.out.println("candidato1 = " + candidato1);
        System.out.println("candidato2 = " + candidato2);
        System.out.println("candidato3 = " + candidato3);
        double costoPromedio = (candidato1+candidato2+candidato3)/3.0;
        System.out.println("Costo promedio campaña = " + costoPromedio);


        System.out.println("\n*** Numero total de votos ***");
        System.out.println("votosCandidato1 = " + votosCandidato1);
        System.out.println("votosCandidato2 = " + votosCandidato2);
        System.out.println("votosCandidato3 = " + votosCandidato3);
        System.out.println("votosBlanco = " + votosBlanco);
        int totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosBlanco;
        System.out.println("Total votos: "+ totalVotos);

        System.out.println("\n*** Candidato ganador ***");
        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("Candidato ganador: candidato 1");
        } else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3) {
            System.out.println("Candidato ganador: candidato 2");
        } else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2) {
            System.out.println("Candidato ganador: candidato 3");
        } else if (votosCandidato1 == votosCandidato2 && votosCandidato1 > votosCandidato3) {
            System.out.println("Empate entre candidato 1 y candidato 2");
        } else if (votosCandidato1 == votosCandidato3 && votosCandidato1 > votosCandidato2) {
            System.out.println("Empate entre candidato 1 y candidato 3");
        } else if (votosCandidato2 == votosCandidato3 && votosCandidato2 > votosCandidato1) {
            System.out.println("Empate entre candidato 2 y candidato 3");
        } else {
            System.out.println("Empate entre los tres candidatos");
        }

        double porcentajeCandidato1 = (votosCandidato1*100)/totalVotos;
        double porcentajeCandidato2 = (votosCandidato2*100)/totalVotos;
        double porcentajeCandidato3 = (votosCandidato3*100)/totalVotos;

        System.out.println("\n*** Porcentaje de votos por candidato ***");
        System.out.println("porcentajeCandidato1 = " + porcentajeCandidato1);
        System.out.println("porcentajeCandidato2 = " + porcentajeCandidato2);
        System.out.println("porcentajeCandidato3 = " + porcentajeCandidato3);





    }
}



