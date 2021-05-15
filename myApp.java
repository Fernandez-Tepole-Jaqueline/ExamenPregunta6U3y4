 	package poo.ito.clases;
 	import poo.ito.clases.serialClase;
 	public class myApp {

 		public static void run() {
 			serialClase s=new serialClase();
 			s.inicia(3451);
 			System.out.println(s.siguiente());
 			System.out.println(s.siguiente());
 			System.out.println(s.siguiente());
 			System.out.println(s.siguiente());
 			s.reinicia();
 			System.out.println(s.siguiente());
 			System.out.println(s.siguiente());
 		}
 		
 		public static void main(String[] args) {
 			run();
 		}

 	}