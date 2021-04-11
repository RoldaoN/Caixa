package feriadao;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float d2,c5,d10,v20,c50,c100,d200;
		double cent5,cent10,cent25,cent50,total=0,troco,troco2,troco3,pago2=0,troco4=0,compra2=0,tcaixa=0;
		int op,compra,centa,pago,um,dois,cinco,dez,vinte,cinq,cem,duz,cincc,dezc,vintec,cinqc;
		int n50=0,n20=0,n10=0,n5=0,n2=0,m1=0,m5=0,m10=0,m25=0,m50=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("H� notas no caixa? \n1-Sim \n2-N�o"); // Inicio do programa, escolha op��o de inicializa��o de sistema
		op = leia.nextInt();
		
		switch(op)// Verifica��o de dinheiro no caixa, verifica��o e inser��o de dados manualmente
		{
		case 1: // Entrada de valores de dinheiro do caixa
			
			System.out.println("Quantas notas de R$200.00 h�?");
			duz = leia.nextInt();
			System.out.println("Quantas notas de R$100.00 h�?");
			cem = leia.nextInt();
			System.out.println("Quantas notas de R$50.00 h�?");
			cinq = leia.nextInt();
			System.out.println("Quantas notas de R$20.00 h�?");
			vinte = leia.nextInt();
			System.out.println("Quantas notas de R$10.00 h�?");
			dez = leia.nextInt();
			System.out.println("Quantas notas de R$5.00 h�?");
			cinco = leia.nextInt();
			System.out.println("Quantas notas de R$2.00 h�?");
			dois = leia.nextInt();
			System.out.println("Quantas moeda de R$1.00 h�?");
			um = leia.nextInt();
			System.out.println("Quantas moedas de R$00.50 h�?");
			cinqc = leia.nextInt();
			System.out.println("Quantas moedas de R$00.25 h�?");
			vintec = leia.nextInt();
			System.out.println("Quantas moedas de R$00.10 h�?");
			dezc = leia.nextInt();
			System.out.println("Quantas moedas de R$00.05 h�?");
			cincc = leia.nextInt();
			
			classedesafio notas = new classedesafio(cincc,dezc,vintec,cinqc,dois,cinco,dez,vinte,cinq,cem,duz,um);
			System.out.println("H� R$"+notas.total()+" total no caixa");		
			break;

		case 2:
			total = 0.0;
			System.out.println("Aten��o!N�o h� dinheiro  no caixa!");
			break;
		}
		
		while(op<4)// Inializa��o de opera�a� do sistema, 4 op��es de funcionamento com escolha do usuario
		{
			System.out.println("O Que deseja fazer agora?");
			System.out.printf("\n1-Nova compra \n2-Total no caixa \n3-Faturamento \n4-Finalizar");
			op = leia.nextInt();
		
			switch(op)
			{
		
			case 1: //Entrada do valor que tem a pagar, o dinheiro que foi dado para pagar e o troco se necessario.
			
				
				System.out.println("Valor da compra em R$");
				compra = leia.nextInt();
				System.out.println("Centavos restantes:");
				centa = leia.nextInt();
				System.out.println("Valor pago:");
				pago = leia.nextInt();
				troco= pago - compra;
				troco = troco -1;
				troco2 = 100 - centa;
				troco3 = troco + (troco2/100);
			
				classetroco caltroco = new classetroco();
			
				caltroco.troco(n50,n20,n10,n5,n2,m1,m5,m10,m25,m50,troco,troco2);
				System.out.println("Deve devolver de troco R$"+troco3+" sendo em notas de:");
				System.out.println("Notas de R$50.00: "+String.format("%2.0f",caltroco.getN50()));
				System.out.println("Notas de R$20.00: "+String.format("%2.0f",caltroco.getN20()));
				System.out.println("Notas de R$10.00: "+String.format("%2.0f",caltroco.getN10()));
				System.out.println("Notas de R$5.00: "+String.format("%2.0f",caltroco.getN5()));
				System.out.println("Notas de R$2.00: "+String.format("%2.0f",caltroco.getN2()));
			
				System.out.println("E em moedas de:");
				System.out.println("Moedas de R$1.00: "+String.format("%2.0f",caltroco.getM1()));
				System.out.println("Moedas de R$0.50: "+String.format("%2.0f",caltroco.getM50()));
				System.out.println("Moedas de R$0.25: "+String.format("%2.0f",caltroco.getM25()));
				System.out.println("Moedas de R$0.10: "+String.format("%2.0f",caltroco.getM10()));
				System.out.println("Moedas de R$0.05: "+String.format("%2.0f",caltroco.getM5()));
			
				
				pago2 = pago2 + pago;
				troco4 = troco4 + troco3;
				compra2 = compra2 + compra;
				break;
			
			case 2://Dinheiro total no caixa
				
				tcaixa = (pago2 - troco4) + total;
				System.out.println("No momento h� R$"+tcaixa+" co caixa.");
				break;
			
			case 3://Faturamento at� o momento
				System.out.println("Vendemos um total de R$"+compra2);
				System.out.println("Um total de R$"+pago2+" foi pago at� agora");
				System.out.println("No caixa tem um total de R$"+tcaixa);
				break;
			
			case 4://Finaliza��o do sistema e faturamento total do dia
				System.out.println("Vendemos um total de R$"+compra2);
				System.out.println("Um total de R$"+pago2+" foi pago at� agora");
				System.out.println("No caixa tem um total de R$"+tcaixa);
				System.out.println("Obrigado por utilizar nossos servi�os! Tenha uma boa noite. ");
				break;
			}
		}
	}

}
