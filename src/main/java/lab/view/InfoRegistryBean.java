package lab.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@ViewScoped				//@Scope("view")
public class InfoRegistryBean implements Serializable {
	private static final long serialVersionUID = -3831420168878300735L;
	
	private int idEmpleado;
	private List <Usuario> listEmpleado;
	private List <Usuario> listEmpleadoF;
	private Date periodo;
	private List<Cliente> listClient;
	private int idClient;
	private List<Proyecto> listProject;
	private int idProject;
	private List<Double> listTarifa;
	private double horas;
	@PostConstruct
	public void init() {
		
		initListas();
	}
	
	public void  initListas(){
		listEmpleado = new ArrayList<Usuario>();
		Usuario user1 = new Usuario(1, "Javier Castillo");
		Usuario user2 = new Usuario(2, "Ever Quiroz");
		Usuario user3 = new Usuario(3, "Ricardo Richard");
		
		listEmpleado.add(user1);
		listEmpleado.add(user2);
		listEmpleado.add(user3);
		
		for(Usuario us: listEmpleado)
		{
			System.out.println(" id= "+us.getId()+" name= "+us.getName());
		}
		
		listTarifa = new ArrayList<Double>();
		Double t1 = 12234.89;
		Double t2 = 65438.89;
		Double t3 = 55238.89;
		
		listTarifa.add(t1);
		listTarifa.add(t2);
		listTarifa.add(t3);
	}
	
	
	public static void main(String args[])
	{
//		getListUser();
	}
	
	
	
	public List<Usuario> getListEmpleado() {
		return listEmpleado;
	}

	public void setListEmpleado(List<Usuario> listUser) {
		this.listEmpleado = listUser;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idUser) {
		this.idEmpleado = idUser;
		System.out.println("Recibiendo id: "+idUser);
	}

	public Date getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Date periodo) {
		this.periodo = periodo;
	}
	
	//actualizar la lista segun sea el idUser
	public List<Cliente> getListClient() {
		switch(getIdEmpleado())
		{
			case 1:
					listClient = new ArrayList<Cliente>();
					Cliente cl1 = new Cliente(1,"Oracle");
					Cliente cl2 = new Cliente(2,"Virgin");
					Cliente cl3 = new Cliente(3,"Bancomer");
					listClient.add(cl1);
					listClient.add(cl2);
					listClient.add(cl3);
					
					break;
			case 2:
					listClient = new ArrayList<Cliente>();
					Cliente cl12 = new Cliente(1,"Amazone");
					Cliente cl22 = new Cliente(2,"IBM");
					Cliente cl32 = new Cliente(3,"Inbursa");
					listClient.add(cl12);
					listClient.add(cl22);
					listClient.add(cl32);
				break;
			case 3:
				listClient = new ArrayList<Cliente>();
				Cliente cl13 = new Cliente(1,"Google");
				Cliente cl23 = new Cliente(2,"Carsoft");
				Cliente cl33 = new Cliente(3,"Banorte");
				listClient.add(cl13);
				listClient.add(cl23);
				listClient.add(cl33);
				break;
		}
		return listClient;
	}

	public void setListClient(List<Cliente> listClient) {
		this.listClient = listClient;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public List<Proyecto> getListProject() {
		switch(getIdClient())
		{
			case 1:

				listProject = new ArrayList<Proyecto>();
				Proyecto py1 = new Proyecto(1,"XideralProject");
				Proyecto py2 = new Proyecto(1,"FlashMovilProject");
				Proyecto py3 = new Proyecto(1,"BancomerProject");
				
				listProject.add(py1);
				listProject.add(py2);
				listProject.add(py3);
				
				break;
			case 2:
				listProject = new ArrayList<Proyecto>();
				Proyecto py12 = new Proyecto(1,"SIGAFT");
				Proyecto py22 = new Proyecto(2,"SIGEMA");
				Proyecto py32 = new Proyecto(3,"VEUREKA");
				
				listProject.add(py12);
				listProject.add(py22);
				listProject.add(py32);
				
				break;
			case 3:
				listProject = new ArrayList<Proyecto>();
				Proyecto py13 = new Proyecto(1,"SICAM project");
				Proyecto py23 = new Proyecto(2,"Project2");
				Proyecto py33 = new Proyecto(3,"Project3");
				
				listProject.add(py13);
				listProject.add(py23);
				listProject.add(py33);
				
				break;
		}
		return listProject;
	}
	
	public void saveValues(ActionEvent evt)
	{
		System.out.println("####################### Aqui en el metodo saveValues()");
	}

	public void setListProject(List<Proyecto> listProject) {
		this.listProject = listProject;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	public List<Double> getListTarifa() {
		return listTarifa;
	}

	public void setListTarifa(List<Double> listTarifa) {
		this.listTarifa = listTarifa;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public List<Usuario> getListEmpleadoF() {
		return listEmpleadoF;
	}

	public void setListEmpleadoF(List<Usuario> listEmpleadoF) {
		this.listEmpleadoF = listEmpleadoF;
	}
	
	
	
}
