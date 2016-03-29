/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package colegio;
//import javax.swing.JOptionPane;

// para leer de teclado necesitamos la clase Scanner
import java.util.Scanner;

/**
 *
 * @author hdr5474
 */


public class main {
// Declaracion Variable Global de Tipo Clase Perros
    public static Perros[] ListaPerros = new Perros[10];
    public static Integer n;
    public static  Scanner sc = new Scanner(System.in);

     public static void main(String[] args) {

// Menu de opciones
  Integer op;

   boolean bandera=false;
   op = 0;
   n=0;
    do{
        cls();
        System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
        System.out.println("\n");
        

    System.out.println("1. Cargar Datos a Base de Datos ");
    System.out.println("2. Visualizar Datos a Base de Datos ");
    System.out.println("3. Ordenar Datos por Ubicación ");
    System.out.println("4. Buscar información por Ubicación ");
    System.out.println("5. Salir ");
    System.out.println("Ingrese opción ");
    op = sc.nextInt();
  //  op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Opción : "));

    switch(op)
    {
        case 1: Llenardatos();
                break;
        case 2: if (n>0)
                 {   Mostrardatos();
                  }
                else
                { //JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                  System.out.println("Debe ingresar primero los datos de la Base de Datos ");
                }
                break;
        case 3:  if( n > 0)
                { Ordenardatos();
                   Mostrardatos();
                }
               else
               {//JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                   System.out.println("Debe ingresar primero los datos de la Base de Datos ");
               }
                break;
        case 4: if(n>0)
                { Buscarlocalidad();
                }  
               else
               {// JOptionPane.showMessageDialog(null, "Debe ingresar primero los datos de la BD");
                  System.out.println("Debe ingresar primero los datos de la Base de Datos ");
               }
                break;
        case 5: bandera = true;
                break;


        default:
               System.out.println("Opción no válida");
               break;

    }


    } while (bandera != true);

         
     }


     /******************************************/
      public static void  Llenardatos()
     {   cls();
         System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
         System.out.println("\n");
      
         //n =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de Perros : "));
         System.out.println("Ingrese Numero de Perros : ");
         n =sc.nextInt();

         String nombre,localidad,raza,propietario,dia;
         Integer cedula, telefono;

     for(int i=0; i<n;i++)
        {
        ListaPerros[i] = new Perros();
        //ListaPerros[i].setNombre( JOptionPane.showInputDialog("Ingrese Nombre : "));
        System.out.println("Ingrese Nombre: ");
        nombre =sc.next();
        ListaPerros[i].setNombre(nombre);
        
        System.out.println("Ingrese Cedula: ");
        cedula =sc.nextInt();
        ListaPerros[i].setCedula(cedula);

        System.out.println(" Ingrese Raza: ");
        raza = sc.next();
        ListaPerros[i].setRaza(raza);
        
       // ListaPerros[i].setRaza( JOptionPane.showInputDialog("Ingrese Raza : "));
        System.out.println(" Ingrese Localidad: ");
        localidad = sc.next();
         
        ListaPerros[i].setLocalidad(localidad);
        //ListaPerros[i].setLocalidad( JOptionPane.showInputDialog("Ingrese Localidad : "));

     
       
        System.out.println("Ingrese Propietario: ");
        propietario = sc.next();
        
         ListaPerros[i].setPropietario(propietario);

 

        
         System.out.println("Ingrese Telefono: ");
         telefono = sc.nextInt();
         ListaPerros[i].setTelefono(telefono);



        System.out.println("Ingrese Dia: ");
        dia = sc.next();
        ListaPerros[i].setDia(dia);

                 }

      System.out.println("Presione x  y enter para continuar");
       sc.next();

    }

/******************************************/
     public static void  Mostrardatos()
     {
         cls();
          System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
         System.out.println("\n");
               // Lectura de los datos de la clase
        for(int i=0; i<n;i++)
        {

        System.out.println("Nombre: " + ListaPerros[i].getNombre());
        System.out.println("Raza:" +ListaPerros[i].getRaza());
        System.out.println("Localidad:"+ListaPerros[i].getLocalidad());
        System.out.println("Cedula:"+ListaPerros[i].getCedula());
        System.out.println("Propietario:"+ListaPerros[i].getPropietario());
        System.out.println("Telefono:"+ListaPerros[i].getTelefono());
        System.out.println("Dia:"+ListaPerros[i].getDia());

        System.out.println("\n");


        }
        
       System.out.println("Presione x y enter para continuar");
       sc.next();


     }

/******************************************/
// Funcion Ordenarcion de Datos  por localidad
       public static void  Ordenardatos()
     {   cls();
         System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
         System.out.println("\n");
         System.out.println("Ordenación por localización");
         Integer m;
         m = n-1;

         for(int k=0;k<m;k++)
         {
            for(int f=0;f<m-k;f++)
            {
                if (ListaPerros[f].getLocalidad().compareTo(ListaPerros[f+1].getLocalidad())>0)
                {
                    String auxl;
                    String auxn;
                    String auxr;
                    Integer auxc;
                    String auxp;
                    Integer auxt;
                    String auxd;


                    auxl=ListaPerros[f].getLocalidad();
                    auxn = ListaPerros[f].getNombre();
                    auxr = ListaPerros[f].getRaza();
                    auxc = ListaPerros[f].getCedula();
                    auxp=  ListaPerros[f].getPropietario();
                    auxt=  ListaPerros[f].getTelefono();
                    auxd=  ListaPerros[f].getDia();

                   // paises[f]=paises[f+1];
                    ListaPerros[f].setLocalidad(ListaPerros[f+1].getLocalidad());
                    ListaPerros[f].setNombre(ListaPerros[f+1].getNombre());
                    ListaPerros[f].setRaza(ListaPerros[f+1].getRaza());
                    ListaPerros[f].setCedula(ListaPerros[f+1].getCedula());
                    ListaPerros[f].setPropietario(ListaPerros[f+1].getPropietario());
                    ListaPerros[f].setTelefono(ListaPerros[f+1].getTelefono());
                    ListaPerros[f].setDia(ListaPerros[f+1].getDia());

                   //  paises[f+1]=aux;
                   ListaPerros[f+1].setLocalidad(auxl);
                   ListaPerros[f+1].setNombre(auxn);
                   ListaPerros[f+1].setRaza(auxr);
                   ListaPerros[f+1].setCedula(auxc);
                   ListaPerros[f+1].setPropietario(auxp);
                   ListaPerros[f+1].setTelefono(auxt);
                   ListaPerros[f+1].setDia(auxd);


                }
            }
        }



  }

/******************************************/
 public static void  Buscarlocalidad()
    {
    cls();
   String blocalidad;
   //blocalidad =JOptionPane.showInputDialog("Ingrese Localidad : ");
   System.out.println("Ingrese Localidad:");
   blocalidad = sc.nextLine();
   System.out.println("COLEGIO DE PERROS CIUDAD BOGOTA");
   System.out.println("\n");
   System.out.println("Localidad: " + blocalidad);
   for(int i=0; i<n;i++)
   {
        if ( ListaPerros[i].getLocalidad().equals(blocalidad) )
        {
        System.out.println("Nombre: " + ListaPerros[i].getNombre());
        System.out.println("Raza:" +ListaPerros[i].getRaza());
        System.out.println("Localidad:"+ListaPerros[i].getLocalidad());
        System.out.println("Cedula:"+ListaPerros[i].getCedula());
        System.out.println("Propietario:"+ListaPerros[i].getPropietario());
        System.out.println("Telefono:"+ListaPerros[i].getTelefono());
        System.out.println("Dia:"+ListaPerros[i].getDia());

        System.out.println("\n");

        }
     }
   
   System.out.println("Presione x  y enter para continuar");
       sc.next();

  }



/******************************************/

  public static void cls()
    {
        for (int y = 0; y < 25; y++)
        System.out.println("\n");
      }
        

}





