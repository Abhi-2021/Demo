package in.sp.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import in.sp.beans.Employee;
import in.sp.beans.Student;

public class BeanProcessor implements BeanPostProcessor
{

	@Override
	public Object postProcessBeforeInitialization(Object obj, String arg1) throws BeansException {
		if(obj instanceof Student) {
			Student std = (Student) obj;
			std.setName(std.getName()+" java");
			return std;
			
			
		}else if(obj instanceof Employee) {
			Employee emp = (Employee) obj;
			emp.setPhoneno("+91-"+emp.getPhoneno());
			return emp;
		}
		
		return null;
	}
	

	@Override
	public Object postProcessAfterInitialization(Object obj, String arg1) throws BeansException {
	
		return obj;
	}

	

}
