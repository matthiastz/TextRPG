import data.GameProgress;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			GameProgress gameProgress = new GameProgress("Matthias");
			gameProgress.gameLoop();

			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
