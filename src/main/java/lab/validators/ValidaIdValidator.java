package lab.validators;

import java.util.Date;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validaIdValidator")
public class ValidaIdValidator implements Validator{

	@Override
	public void validate(FacesContext arg0, UIComponent component, Object value)
			throws ValidatorException {
		System.out.println("clientID  = "+component.getClientId().toString());
//		int id = (int) component.getAttributes().get("idEmpleado");
		Date tf = (Date) component.getAttributes().get("timeFrame");
		String inputHoras = (String) value;
		System.out.println(" "+component.getAttributes().toString());
		System.out.println(" getclass "+value.getClass());
//		int id2 = (int) value;
		System.out.println("Entre al validator "+" tf= "+tf +" inputHoras = "+ inputHoras);
		//System.out.println("Entre en el activa true");
		//System.out.println("idProject = "+idVista);
		
		
	}

}
