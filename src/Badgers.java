
public class Badgers {
	public static void main(String[] args) {

		/*
		 * Badger, badger, badger, badger, badger, badger, badger, badger, badger,
		 * badger Mushroom, mushroom, Badger, badger, badger, badger, badger, badger,
		 * badger, badger, badger, badger Mushroom, mushroom, Badger, badger, badger,
		 * badger, badger, badger, badger, badger, badger, badger Mush-mushroom, Badger,
		 * badger, badger, badger, badger, badger, badger, badger, badger, badger Snake,
		 * a snake Snake! A snake, ooh it's a snake badger, badger, badger, badger,
		 * badger, badger, badger, badger, badger, badger Mushroom, mushroom,
		 */
		for (int q = 0; q < 3; q++) {

			for (int i = 0; i < 10; i++) {
				System.out.print("badger, ");
			}
			System.out.println();
			for (int o = 0; o < 2; o++) {

				System.out.print("mushroom, ");

			}
			System.out.println();
			if (q == 2) {
				for (int s = 0; s < 4; s++) {
					System.out.print("snake! ");
				    if (s == 2) {
				    System.out.print("oh its a ");
				    }
			}
		}
	}

}
}