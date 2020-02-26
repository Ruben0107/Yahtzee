import java.util.Random;

public class DobbelSteen extends YahtzeeSpel {

	static int werpen() {

		Random r = new Random();
		int r1 = (r.nextInt(6)) + 1;
		return r1;

	}

}
