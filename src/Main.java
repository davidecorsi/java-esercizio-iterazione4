import java.util.Random;

/*
 * Il package java.util fornisce la classe Random. Leggete la documentazione della classe e create un
 * applicazione che simuli i lanci di una moneta. Calcolate la percentuale di lanci, all'aumentare dei
 * lanci la percentuale si dovrebbe stabilizzare al 50%.
 */
public class Main {
	public static void main(String[] args) {
		int lanci = 1000;
		int testa = 0;
		int croce = 0;
		Random random = new Random();
		for(int i = 0; i < lanci; i++) {
			if(random.nextBoolean()) {
				testa++;
			} else {
				croce++;
			}
		}
		System.out.println("La percentuale di lanci risultati testa sono:" + (float) testa/lanci*100);
		System.out.println("La percentuale di lanci risultati croce sono:" + (float) croce/lanci*100);
	}
}
