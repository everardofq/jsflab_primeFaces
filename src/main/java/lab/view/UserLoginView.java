package lab.view;
import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
 


import org.primefaces.context.RequestContext;
 
@ManagedBean
@ViewScoped
public class UserLoginView implements Serializable{

	private static final long serialVersionUID = -7447265692326018261L;

	private String username;
     
    private String password;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
    	System.out.println("insertando useName...");
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
    	System.out.println("Insertando la contraseña");
        this.password = password;
    }
   
    public void login(ActionEvent event) {
    	System.out.println("en el method login()");
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;
        boolean loggedIn = false;
        message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome",null);
         
//        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
//            loggedIn = true;
//            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
//        } else {
//            loggedIn = false;
//            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
//        }
//         
        context.execute("dlg2.show();");
        
//        context.addCallbackParam("loggedIn", loggedIn);
    }   
}