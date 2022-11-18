package App;

import java.beans.Beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DAO.empleadosImpl;

public class Controlador {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		empleadosImpl obj = (empleadosImpl) context.getBean("empleados");
		obj.insertar(null);
		
		
	}

}
