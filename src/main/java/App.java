

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pe.devcode.modelo.Hamburguesa;
import com.pe.devcode.modelo.PerroCaliente;
import com.pe.devcode.servicio.ComidaServicio;

public class App {

	public static ApplicationContext appContext = null;
	
	public static void main(String[] args) {
		
		appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Pan pan= appContext.getBean("pan", Pan.class);
//		System.out.println("Pan: " + pan);
//		
//		Pan panPerro= appContext.getBean("panPerro", Pan.class);
//		System.out.println("panPerro: " + panPerro);		
		
//		xmlCase();
		
//		annotationCase();
		
		comidaRapida();
	}
	
	
	public static void xmlCase() {
		Hamburguesa ham= appContext.getBean("hamburguesa", Hamburguesa.class);
		System.out.println("Hamburguesa: " + ham);
	}
	
	public static void annotationCase() {
		PerroCaliente perroCaliente= appContext.getBean("perroCaliente", PerroCaliente.class);
		perroCaliente.setTipo("Jumbo");
		perroCaliente.setPrecio(8d);
		
		System.out.println("Perro Caliente: " + perroCaliente);
	}
	
	public static void comidaRapida() {
		ComidaServicio servicio= appContext.getBean("comidaServicio", ComidaServicio.class);
		
		System.out.println("Hamburguesa: " + servicio.prepararHamburguesa());
		
		System.out.println("Perro Caliente: " + servicio.prepararPerroCaliente());
		
		System.out.println("Sandwich: " + servicio.prepararSandwich());
		
	}	
	
}