package com.toadsdewin.CocheProyecto.personal;

public class Persona
{

	private String nombre;
	private String apellido;
	private int edad;
	private int altura;
	private int masa;

	public  Persona()
	{
		nombre = "Pepito";
		apellido = "Pérez";
		edad     = 25;
		altura	 = 180;
		masa     = 75;
	}
	public Persona (String nombre, String apellido, int edad, int altura, int masa)
	{
		this.nombre   = nombre;
		this.apellido = apellido;
		this.edad     = edad;
		this.altura   = altura;
	}
	
	public String getName()
	{
	   return nombre;
	}
	public String getSurname()
	{
	   return apellido;
	}
	public int getAge()
	{
	   return edad;
	}
	public int getHeight()
	{
	   return altura;
	}

	//Setters
	public void setName(String nombre)
	{
	  this.nombre = nombre;
	}
	public void setSurname(String apellido)
	{
	  this.apellido = apellido;
	}
	public void setAge(int edad)
	{
          this.edad = edad;
	}
	

	public static void main(String args[])
	{
		Persona persona1 = new Persona();
		persona1.setName("Juan");
		persona1.setSurname("Pérez");
		persona1.setAge(29);

		System.out.println("Nombre: "+persona1.getName());
		System.out.println("Apellido: "+persona1.getSurname());
		System.out.println("Edad: "+persona1.getAge());
	}
}

