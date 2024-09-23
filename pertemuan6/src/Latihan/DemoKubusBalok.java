package Latihan;

public class DemoKubusBalok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KubusBalok kb = new KubusBalok(10);
		
		KubusBalok kb1 = new KubusBalok(4, 8, 11);
		
		System.out.println("Volume Kubus: " + kb.volumekbs() + " cm");
		System.out.println("Volume Balok: " + kb1.volumeblk() + " cm\n");
		
		System.out.println("Luas Permukaan Kubus: " + kb.lpkbs() + " cm");
		System.out.println("Luas Permukaan Balok: " + kb1.lpblk() + " cm");
	}

}
