import java.time.LocalDate;
import java.util.Scanner;

/*Este exemplo visa implementar um gerador de calendário com base no ano. */

public class CalendarioEx {
	public static void main(String[] args) {
	  	//Lê o ano
		Scanner leitor = new Scanner(System.in);
		System.out.printf("Entre com o ano: ");
		int ano = leitor.nextInt();
		leitor.close();
		/*System.out.printf("\nEntre com mês: ");
		int mes = leitor.nextInt();*/
		//System.out.println();
		//definindo a data inicial
		LocalDate data = LocalDate.of(ano, 1, 1);
		int dataAnt;
		
		//imprime o calendário
		while(data.getYear() == ano){
        	System.out.printf("\n\t%s", data.getMonth());
			System.out.println("\nSu Mo Tu We Th Fr Sa");
			
			for(int i = 0; i < (data.getDayOfWeek().getValue() % 7); i++){
				System.out.print("   ");
            }
			
			dataAnt = data.getMonthValue();
			while(dataAnt == data.getMonthValue()){
				System.out.printf("%2d ", data.getDayOfMonth());
			    
        		if((data.getDayOfWeek().getValue() % 6) == 0){
					System.out.println();
        		}
			
				data = data.plusDays(1);
			}
            //System.out.printf("Mes: %d\n", data.getMonthValue());
            //System.out.printf("MesAnt: %d\n", dataAnt);
		}
      	System.out.println();	
	}
}