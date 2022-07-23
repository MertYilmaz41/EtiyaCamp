package intro;

public class Main {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,3,4,5,6,7,8,9};
		int aranacak = 5;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			if (sayilar[i]==aranacak) {
				System.out.println("sayý " + sayilar[i]);
				break;
			}
			
			else
			{
				System.out.println("aranan sayý deðil");
			}
		}
		
    }    
}
