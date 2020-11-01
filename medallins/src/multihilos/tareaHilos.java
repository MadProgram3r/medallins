package multihilos;

public class tareaHilos {
public static void main(String args[]) {
	Hilo hilo10 = new Hilo();
	Thread miHilo = new Thread(hilo10);
	Hilo2 hilo30 = new Hilo2();
	Thread otroHilo = new Thread(hilo30);
	otroHilo.start();
	miHilo.start();
	try {Thread.sleep(1000);}
	catch(InterruptedException ex) {ex.printStackTrace(); }
	for(int x = 11; x <= 20; x++ ) {
		System.out.println(x);
	}
}


}

class Hilo implements Runnable{
	@Override
	public void run() {
		try {Thread.sleep(500);}
		catch(InterruptedException ex) {ex.printStackTrace(); }
		contarHasta10();
	}
	
	public void contarHasta10() {
		for(int x = 1; x <= 10; x++ ) {
			System.out.println(x);
		}
	}
}

class Hilo2 implements Runnable{
	@Override
	public void run() {
		try {Thread.sleep(1500);}
		catch(InterruptedException ex) {ex.printStackTrace(); }
		contarHasta10();
	}
	
	public void contarHasta10() {
		for(int x = 21; x <= 30; x++ ) {
			System.out.println(x);
		}
		System.out.println("Fin del programa");
	}
}
