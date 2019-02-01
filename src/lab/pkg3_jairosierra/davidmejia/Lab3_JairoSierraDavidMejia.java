/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_jairosierra.davidmejia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Jairo Sierra
 */import java.util.Scanner;
public class Lab3_JairoSierraDavidMejia {
    static ConnectiveLine c=new ConnectiveLine(); 
    static Scanner r=new Scanner(System.in);
    static ArrayList<Proyectos> proyectos = new ArrayList();
    static ArrayList<Ingresos> ingresos = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        int op=0;
        while (op!=7)
        {
            Menu();
            op=r.nextInt();
            switch (op)
            {
                case 1: System.out.println(" ");
                IngresarPersona();
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println("PERSONAS -- ");
                    PrintPersonas();
                    break;
                case 2:System.out.println(" ");
                agregarempresa();
                    break;
                case 3:System.out.println(" ");
                agregarproyecto();
                    break;
                case 4:System.out.println(" ");
                agregaringresos();
                    break;
                case 5:System.out.println(" ");
                    break;
                case 6:System.out.println(" ");
                    System.out.println("");
                    System.out.println("¿Que desea modificar? ");
                    System.out.println("1) Administrador");
                    System.out.println("2) Freelance");
                    System.out.println("3) Empresa");
                    int opc=r.nextInt();
                    switch(opc)
                    {
                        case 1: 
                            break;
                        case 2: System.out.println("");
                        modificaradm();
                        if(c.getPersonas().isEmpty())
                        {
                            System.out.println("No hay personas que modificar");
                        }
                        else
                        {
                            ModificarFreelance();
                        }
                            break;
                        case 3:System.out.println(" ");
                        modiempresas();
                            break;
                    }
                case 7: System.out.println(" ");
                        System.out.println("¿Que desea listar?");
                        System.out.println("1. Freelance");
                        System.out.println("2. Adminitrador");
                        System.out.println("3. Empresas");
                        System.out.println("4. Proyectos");
                        int opcion=r.nextInt();
                        switch(opcion)
                        {
                            case 1: System.out.println(" ");
                            ListarFreenlance();
                                break;
                            case 2: System.out.println(" ");
                            listaradmin();
                                break;
                            case 3:System.out.println(" ");
                            listarempresas();
                                break;
                            case 4:System.out.println(" ");
                            listarproyectos();
                                break;

                        }
                        break;
                case 8:
                    System.out.println(" ");
                        System.out.println("¿Que desea eliminar?");
                        System.out.println("1. Freelance");
                        System.out.println("2. Adminitrador");
                        System.out.println("3. Empresas");
                        System.out.println("4. Proyectos");
                        int opcion1=r.nextInt();
                        switch(opcion1)
                        {
                            case 1: System.out.println(" ");
                            EliminarFreelance();
                                break;
                            case 2: System.out.println(" ");
                            eliminaradministrador();
                                break;
                            case 3:System.out.println(" ");
                            eliminarempresas();
                                break;
                            case 4:System.out.println(" ");
                            eliminarpro();
                                break;

                        }
                        break;
                case 9:
                    System.exit(0);
                    break;
            }
        }
        
        
        
    }
    
    
    
    public static void Menu()
    {
        System.out.println("1) Ingresar persona");
        System.out.println("2) Ingresar empresa");
        System.out.println("3) Ingresar proyecto");
        System.out.println("4) Ingresar ingresos");
        System.out.println("6) Modificar");
        System.out.println("7) Listar");
        System.out.println("8) Eliminar"); 
        System.out.println("9)Salir");
    }
    
    public static void IngresarPersona()
    {
        String nombre="";
        int id=0;
        String correo="";
             System.out.println(" ");
                System.out.println("Ingrese correo: ");
                r.nextLine();
                correo=r.nextLine();
                System.out.println("Ingrese su ID: ");
                id=r.nextInt();
                System.out.println("¿Que es usted? 1. Freelance 2. Administrador");
                int op=r.nextInt();
                switch(op)
                {
                    case 1: System.out.println(" ");
                    String contrasena="";
                    String genero="";
                    int edad=0;
                    double dinero=0;
                    String ciudad="";
                    String telefono="";
                    String marca="";
                        System.out.println("Ingrese el nombre: ");
                        r.nextLine();
                        nombre=r.nextLine();
                        System.out.println("Ingrese su contraseña:");
                        contrasena=r.next();
                        System.out.println("Ingrese su genero: ");
                        genero=r.next();
                        System.out.println("Inngrese su edad: ");
                        edad=r.nextInt();
                        System.out.println("Ingrese su dinero: ");
                        dinero=r.nextDouble();
                        System.out.println("Ingrese su ciudad: ");
                        r.nextLine();
                        ciudad=r.nextLine();
                        System.out.println("Ingrese su telefono: ");
                        telefono=r.next();
                        System.out.println(" ");
                        System.out.println("Que tipo es: \n1. Desarrollador web  \n2.Diseñador Grafico \n3.Marketing \n4. Contador\n5.Fotografo \n6. Medios Audiovisuales ");
                        int opcion2=r.nextInt();
                        String lenguaje="";
                        String universidad="";
                        String idioma="";
                        switch(opcion2)
                        {
                            
                            case 1: System.out.println(" ");
                                System.out.println("Ingrese el lenguaje de programacion");
                                lenguaje=r.next();
                                System.out.println("Ingrese su universidad: ");
                                universidad=r.next();
                                System.out.println("Ingrese su idioma: ");
                                idioma=r.next();
                                c.getPersonas().add(new Desarrollador(lenguaje, universidad, idioma, nombre, contrasena, genero, edad, dinero, ciudad, telefono, id, correo));
                                break;
                            case 2: System.out.println(" ");
                                System.out.println("Ingrese su universidad; ");
                                universidad=r.next();
                                System.out.println("Ingrese su hobbie: ");
                                r.nextLine();
                                String hobbies=r.nextLine();
                                c.getPersonas().add(new Diseñador(universidad, hobbies, nombre, contrasena, genero, edad, dinero, ciudad,telefono, id, correo));
                                break;
                            case 3: System.out.println(" ");
                                System.out.println("Ingrese su red social: ");
                                String red=r.next();
                                c.getPersonas().add(new Marketing(red, nombre, contrasena, genero, edad, dinero, ciudad,telefono,id,correo));
                                break;
                            case 4: System.out.println(" ");
                                System.out.println("Ingrese su universidad: ");
                                universidad=r.next();
                                System.out.println("Estado de la inscripcion [true, false) : ");
                                boolean inscripcion=r.nextBoolean();
                                System.out.println("Ingrese sus hobbies: ");
                                r.nextLine();
                                hobbies=r.nextLine();
                                c.getPersonas().add(new Contador(universidad,inscripcion, hobbies,nombre,contrasena,genero,edad,dinero,ciudad,telefono,id,correo));
                                break;
                            case 5: System.out.println("Ingrese la marca: ");
                                marca=r.next();
                                System.out.println("Ingrese la marca de su camara: ");
                                String camara=r.next();
                                c.getPersonas().add(new Fotografo(marca, camara,nombre,contrasena,genero,edad,dinero,ciudad,telefono,id,correo));
                                break;
                           case 6: System.out.println(" ");
                                System.out.println("Ingrese la marca: ");
                                marca=r.next();
                                System.out.println("Ingrese la marca de la camara de video: ");
                                String modelo=r.next();
                                c.getPersonas().add(new Medios(marca, modelo,nombre,contrasena,genero,edad,dinero,ciudad,telefono,id,correo));
                                break;
                        }
                        break;
                    case 2: System.out.println(" ");
                            System.out.println("Ingrese un nombre de usuario");
                            r.nextLine();
                            String usuario=r.nextLine();
                            System.out.println("Ingrese su contraseña: ");
                            r.next();
                            contrasena=r.next();
                            c.getPersonas().add(new Administrador(usuario, contrasena, id, correo));
                            break;
                
               
        }
    }
    
    public static void PrintPersonas()
    {
        for(Object t:c.getPersonas())
        {
            System.out.println(c.getPersonas().indexOf(t)+") -- "+t);
        }
    }
    
    public static void ModificarFreelance()
    {
        System.out.println("Ingrese la posicion que desea modificar: ");
        int sub=r.nextInt();
        while (sub>c.getPersonas().size()-1 || sub<0)
        {
            System.out.println("Ingrese una posision valida: ");
            sub=r.nextInt();
        }
        System.out.println("Ingrese el correo de su posicion: ");
        String correo1=r.next();
        System.out.println("Ingrese la contraseña de su posicion: ");
        String contrasena1=r.next();
        String correo=c.getPersonas().get(sub).getCorreo();
        String contrasena=((Freelance)c.getPersonas().get(sub)).getContrasena();
        while(contrasena1.equalsIgnoreCase(contrasena)==false && correo1.equalsIgnoreCase(correo)==false)
        {
            System.out.println("Ingrese nuevamente el correo de su posicion: ");
            correo1=r.next();
            System.out.println("Ingrese nuevamente la contraseña de su posicion: ");
            contrasena1=r.next();
        }
        System.out.println("Ingrese correo: ");
        r.nextLine();
        correo=r.nextLine();
        System.out.println("Ingrese su ID: ");
        int id=r.nextInt();
        String genero="";
        int edad=0;
        double dinero=0;
        String ciudad="";
        String telefono="";
        String marca="";
        System.out.println("Ingrese el nombre: ");
        r.nextLine();
        String nombre=r.nextLine();
        System.out.println("Ingrese su contraseña:");
        contrasena=r.next();
        System.out.println("Ingrese su genero: ");
        genero=r.next();
        System.out.println("Inngrese su edad: ");
        edad=r.nextInt();
        System.out.println("Ingrese su dinero: ");
        dinero=r.nextDouble();
        System.out.println("Ingrese su ciudad: ");
        r.nextLine();
        ciudad=r.nextLine();
        System.out.println("Ingrese su telefono: ");
        telefono=r.next();
        String lenguaje,universidad,idioma, hobbies;
        if (c.getPersonas().get(sub)instanceof Desarrollador)
        {
            System.out.println("Ingrese el lenguaje de programacion");
            lenguaje=r.next();
            System.out.println("Ingrese su universidad: ");
            universidad=r.next();
            System.out.println("Ingrese su idioma: ");
            idioma=r.next();
            System.out.println("Ingrese la posicion del proyecto web: ");
            int g=r.nextInt();
//        ((Desarrollador)c.getPersonas().get(sub)).getProyecto().add((P_web)proyectos.get(g));
        ((Desarrollador)c.getPersonas().get(sub)).setId(id);
        ((Desarrollador)c.getPersonas().get(sub)).setCorreo(correo);
        ((Desarrollador)c.getPersonas().get(sub)).setNombre(nombre);
        ((Desarrollador)c.getPersonas().get(sub)).setContrasena(contrasena);
        ((Desarrollador)c.getPersonas().get(sub)).setGenero(genero);
        ((Desarrollador)c.getPersonas().get(sub)).setEdad(edad);
        ((Desarrollador)c.getPersonas().get(sub)).setDinero(dinero);
        ((Desarrollador)c.getPersonas().get(sub)).setCiudad(ciudad);
        ((Desarrollador)c.getPersonas().get(sub)).setTelefono(telefono);
        ((Desarrollador)c.getPersonas().get(sub)).setLenguaje(lenguaje);
        ((Desarrollador)c.getPersonas().get(sub)).setUniversidad(universidad);
        ((Desarrollador)c.getPersonas().get(sub)).setIdioma(idioma);
        }
        if(c.getPersonas().get(sub)instanceof Diseñador)
        {
            System.out.println("Ingrese su universidad: ");
            universidad=r.next();
            System.out.println("Ingrese su hobbie: ");
            hobbies=r.next();
            System.out.println("Ingrese la posicion del proyecto:");
            int g=r.nextInt();
            //        ((Diseñador)c.getPersonas().get(sub)).getProyecto().add((P_publicitarios)proyectos.get(g));
            ((Diseñador)c.getPersonas().get(sub)).setId(id);
            ((Diseñador)c.getPersonas().get(sub)).setCorreo(correo);
            ((Diseñador)c.getPersonas().get(sub)).setNombre(nombre);
            ((Diseñador)c.getPersonas().get(sub)).setContrasena(contrasena);
            ((Diseñador)c.getPersonas().get(sub)).setGenero(genero);
            ((Diseñador)c.getPersonas().get(sub)).setCiudad(ciudad);
            ((Diseñador)c.getPersonas().get(sub)).setTelefono(telefono);
            ((Diseñador)c.getPersonas().get(sub)).setUniversidad(universidad);
            ((Diseñador)c.getPersonas().get(sub)).setHobbies(hobbies);
        }
        if (c.getPersonas().get(id) instanceof Marketing)
        {
            System.out.println("Ingrese la red social mas utilizada: ");
            String red=r.next();
            System.out.println("Ingrese la posicion del proyecto:");
            int g=r.nextInt();
            //        ((Marketing)c.getPersonas().get(sub)).getProyecto().add((P_comerciales)proyectos.get(g));
            ((Marketing)c.getPersonas().get(sub)).setId(id);
            ((Marketing)c.getPersonas().get(sub)).setCorreo(correo);
            ((Marketing)c.getPersonas().get(sub)).setNombre(nombre);
            ((Marketing)c.getPersonas().get(sub)).setContrasena(contrasena);
            ((Marketing)c.getPersonas().get(sub)).setGenero(genero);
            ((Marketing)c.getPersonas().get(sub)).setEdad(edad);
            ((Marketing)c.getPersonas().get(sub)).setDinero(dinero);
            ((Marketing)c.getPersonas().get(sub)).setCiudad(ciudad);
            ((Marketing)c.getPersonas().get(sub)).setTelefono(telefono);
            ((Marketing)c.getPersonas().get(sub)).setRed(red);
        }
        if (c.getPersonas().get(sub) instanceof Contador)
        {
            System.out.println("Ingrese su universidad: ");
            universidad=r.next();
            System.out.println("Ingrese el estado de la inscripcion: ");
            boolean inscripcion=r.nextBoolean();
            System.out.println("Ingrese sus hobbies: ");
            r.nextLine();
            hobbies=r.nextLine();
            System.out.println("Ingrese la posicion del proyecto:");
            int g=r.nextInt();
            //        ((Contador)c.getPersonas().get(sub)).getProyecto().add((P_comerciales)proyectos.get(g));
            ((Contador)c.getPersonas().get(sub)).setId(id);
            ((Contador)c.getPersonas().get(sub)).setCorreo(correo);
            ((Contador)c.getPersonas().get(sub)).setNombre(nombre);
            ((Contador)c.getPersonas().get(sub)).setContrasena(contrasena);
            ((Contador)c.getPersonas().get(sub)).setGenero(genero);
            ((Contador)c.getPersonas().get(sub)).setEdad(edad);
            ((Contador)c.getPersonas().get(sub)).setDinero(dinero);
            ((Contador)c.getPersonas().get(sub)).setCiudad(ciudad);
            ((Contador)c.getPersonas().get(sub)).setTelefono(telefono);
            ((Contador)c.getPersonas().get(sub)).setUniversidad(universidad);
            ((Contador)c.getPersonas().get(sub)).setInscripcion(inscripcion);
            ((Contador)c.getPersonas().get(sub)).setHobbies(hobbies);
        }
        if(c.getPersonas().get(sub) instanceof Fotografo)
        {
            System.out.println("Ingrese su marca: ");
            marca=r.next();
            System.out.println("Ingrese el modelo de su camara: ");
            String camara=r.next();
            System.out.println("Ingrese la posicion del proyecto:");
            int g=r.nextInt();
            //        ((Fotografo)c.getPersonas().get(sub)).getProyecto().add((P_publicitarios)proyectos.get(g));
            ((Fotografo)c.getPersonas().get(sub)).setId(id);
            ((Fotografo)c.getPersonas().get(sub)).setCorreo(correo);
            ((Fotografo)c.getPersonas().get(sub)).setNombre(nombre);
            ((Fotografo)c.getPersonas().get(sub)).setContrasena(contrasena);
            ((Fotografo)c.getPersonas().get(sub)).setGenero(genero);
            ((Fotografo)c.getPersonas().get(sub)).setEdad(edad);
            ((Fotografo)c.getPersonas().get(sub)).setDinero(dinero);
            ((Fotografo)c.getPersonas().get(sub)).setCiudad(ciudad);
            ((Fotografo)c.getPersonas().get(sub)).setTelefono(telefono);
            ((Fotografo)c.getPersonas().get(sub)).setMarca(marca);
            ((Fotografo)c.getPersonas().get(sub)).setCamara(camara);
        }
        if (c.getPersonas().get(sub)instanceof Medios)
        {
            System.out.println("Ingrese su marca: ");
            marca=r.next();
            System.out.println("Ingrese el modelo de su camara de video: ");
            String camara=r.next();
            System.out.println("Ingrese la posicion del proyecto:");
            int g=r.nextInt();
            //        ((Medios)c.getPersonas().get(sub)).getProyecto().add((P_publicitarios)proyectos.get(g));
            ((Medios)c.getPersonas().get(sub)).setId(id);
            ((Medios)c.getPersonas().get(sub)).setCorreo(correo);
            ((Medios)c.getPersonas().get(sub)).setNombre(nombre);
            ((Medios)c.getPersonas().get(sub)).setContrasena(contrasena);
            ((Medios)c.getPersonas().get(sub)).setGenero(genero);
            ((Medios)c.getPersonas().get(sub)).setEdad(edad);
            ((Medios)c.getPersonas().get(sub)).setDinero(dinero);
            ((Medios)c.getPersonas().get(sub)).setCiudad(ciudad);
            ((Medios)c.getPersonas().get(sub)).setTelefono(telefono);
            ((Medios)c.getPersonas().get(sub)).setMarca(marca);
            ((Medios)c.getPersonas().get(sub)).setModelo(camara);
        }
        
        
    }
    
    public static void EliminarFreelance()
    {
        System.out.println("Ingrese la posicion que desea eliminar: ");
        int sub=r.nextInt();
        while (sub>c.getPersonas().size()-1 || sub<0)
        {
            System.out.println("Ingrese una posision valida: ");
            sub=r.nextInt();
        }
        System.out.println("Ingrese el correo de su posicion: ");
        String correo1=r.next();
        System.out.println("Ingrese la contraseña de su posicion: ");
        String contrasena1=r.next();
        String correo=c.getPersonas().get(sub).getCorreo();
        String contrasena=((Freelance)c.getPersonas().get(sub)).getContrasena();
        while(contrasena1.equalsIgnoreCase(contrasena)==false && correo1.equalsIgnoreCase(correo)==false)
        {
            System.out.println("Ingrese nuevamente el correo de su posicion: ");
            correo1=r.next();
            System.out.println("Ingrese nuevamente la contraseña de su posicion: ");
            contrasena1=r.next();
        }
        c.getPersonas().remove(sub);
    }
    
    public static void ListarFreenlance()
    {
        
        for(Object t:c.getPersonas())
        {
            if(t instanceof Freelance)
            {
                if (t instanceof Desarrollador)
                {
                    System.out.println("DESAROLLADOR\n"+t);
                }
            }
        }
        for(Object t:c.getPersonas())
        {
            if(t instanceof Freelance)
            {
                if (t instanceof Marketing)
                {
                    System.out.println("MARKETING\n"+t);
                }
            }
        }
        for(Object t:c.getPersonas())
        {
            if(t instanceof Freelance)
            {
                if (t instanceof Diseñador)
                {
                    System.out.println("DISEÑADOR\n"+t);
                }
            }
        }
        for(Object t:c.getPersonas())
        {
            if(t instanceof Freelance)
            {
                if (t instanceof Contador)
                {
                    System.out.println("CONTADOR\n"+t);
                }
            }
        }
        for(Object t:c.getPersonas())
        {
            if(t instanceof Freelance)
            {
                if (t instanceof Fotografo)
                {
                    System.out.println("FOTOGRAFO\n"+t);
                }
            }
        }
        for(Object t:c.getPersonas())
        {
            if(t instanceof Freelance)
            {
                if (t instanceof Medios)
                {
                    System.out.println("MEDIOS\n"+t);
                }
            }
        }
    }
        public static void agregarempresa() {
        String nombre = "";
        String telefono = "";
        String correo = "";
        String contrasena = "";
        String descripcion = "";
        System.out.println("Ingrese su nombre: ");
        r.nextLine();
        nombre = r.nextLine();
        System.out.println("Ingrese su telefono: ");
        telefono = r.next();
        System.out.println("Ingrese su correo: ");
        correo = r.next();
        System.out.println("Ingrese su contraseña: ");
        contrasena = r.next();
        System.out.println("Ingrese la descripcion de la empresa: ");
        r.nextLine();
        descripcion = r.nextLine();
        System.out.println("Menu de empresas: ");
        System.out.println("1) Extranjeras");
        System.out.println("2) Nacionales");
        int opcion = r.nextInt();
        while (opcion < 1 || opcion > 2) {
            System.out.println("Menu de empresas: ");
            System.out.println("1) Extranjeras");
            System.out.println("2) Nacionales");
            opcion = r.nextInt();
        }
        switch (opcion) {
            case 1:
                System.out.println("Ingrese el pais: ");
                String pais = r.next();
                System.out.println("Ingrese la ciudad: ");
                r.nextLine();
                String ciudad = r.nextLine();
                System.out.println("Ingrese la pagina web: ");
                String pagina = r.next();
                c.getEmpresas().add(new Extranjeras(pais, ciudad, pagina, nombre, telefono, correo, contrasena, descripcion));
                break;
            case 2:
                System.out.println("Ingrese departamento: ");
                String departamento = r.next();
                System.out.println("Ingrese municipio: ");
                String municipio = r.next();
                System.out.println("Ingrese la ciudad: ");
                String ciudad1 = r.next();
                System.out.println("Ingrese la mision: ");
                r.nextLine();
                String mision = r.nextLine();
                System.out.println("Ingrese la vision: ");
                r.nextLine();
                String vision = r.nextLine();
                c.getEmpresas().add(new Nacionales(departamento, municipio, ciudad1, mision, vision, nombre, telefono, correo, contrasena, descripcion));
                break;
        }//fin del switch
    }//fin de agregar empresas
        public static void agregarproyecto() throws ParseException {
        String nombre = "";
        String empresa = "";
        String precio = "";
        String estado = "";
        String descripcion = "";
        Date inicio;
        Date entrega;
        System.out.println("Ingrese el nombre: ");
        nombre = r.next();
        System.out.println("Ingrese la empresa: ");
        r.nextLine();
        empresa = r.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = r.next();
        System.out.println("Ingrese la descripcion: ");
        r.nextLine();
        descripcion = r.nextLine();
        System.out.println("Ingrese estado: ");
        estado = r.next();
        System.out.println("Ingresar fecha de inicio yyyy/MM/dd: ");
        String fecha1 = r.next();
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
        inicio = df2.parse(fecha1);
        System.out.println("Ingresar fecha de entrega yyyy/MM/dd: ");
        String fecha2 = r.next();
        DateFormat df3 = new SimpleDateFormat("yyyy/MM/dd");
        entrega = df2.parse(fecha2);
        System.out.println("Menu de proyectos: ");
        System.out.println("1) Proyectos web");
        System.out.println("2) Proyectos publicitarios");
        System.out.println("3) Proyectos comerciales");
        int op = r.nextInt();

        switch (op) {
            case 1:
                proyectos.add(new P_web(nombre, empresa, precio, estado, descripcion, inicio, entrega));
                break;
            case 2:
                proyectos.add(new P_publicitarios(nombre, empresa, precio, estado, descripcion, inicio, entrega));
                break;
            case 3:
                proyectos.add(new P_comerciales(nombre, empresa, precio, estado, descripcion, inicio, entrega));
                break;
        }
    }//fin de agregar proyecto

    public static void agregaringresos() {
        System.out.println("Ingrese su dinero: ");
        String dinero = r.next();
        ingresos.add(new Ingresos(dinero));
    }

    public static void modificaradm() {
        System.out.println("Ingrese la posicion del administrador: ");
        int pos = r.nextInt();
        System.out.println("Ingrese el correo del administrador: ");
        String correo = r.nextLine();
        System.out.println("Ingrese la contraseña del administrado: ");
        String contrasena = r.next();
        String correo1 = ((Administrador) c.getPersonas().get(pos)).getCorreo();
        String contrasena1 = ((Administrador) c.getPersonas().get(pos)).getContrasena();
        while (correo.equals(correo1) == false && contrasena.equals(contrasena1) == false) {
            System.out.println("Ingrese el correo del administrador: ");
            correo = r.nextLine();
            System.out.println("Ingrese la contraseña del administrador: ");
            contrasena = r.next();
        }
        System.out.println("Menu de elementos: ");
        System.out.println("1) Nombre de usuario: ");
        System.out.println("2) Contraseña: ");
        System.out.println("3) Correo");
        System.out.println("4) ID");
        int opc = r.nextInt();
        while (opc < 1 || opc > 4) {
            System.out.println("Menu de elementos: ");
            System.out.println("1) Nombre de usuario: ");
            System.out.println("2) Contraseña: ");
            System.out.println("3) Correo");
            System.out.println("4) ID");
            opc = r.nextInt();
        }
        switch (opc) {
            case 1:
                System.out.println("Ingrese el nombre de usuario: ");
                r.nextLine();
                String nombre1 = r.nextLine();
                ((Administrador) c.getPersonas().get(pos)).setUsuario(nombre1);
                break;
            case 2:
                System.out.println("Ingrese la contraseña: ");
                String contrasena2 = r.next();
                ((Administrador) c.getPersonas().get(pos)).setContrasena(contrasena);
                break;
            case 3:
                System.out.println("Ingrese el correo: ");
                String correo2 = r.next();
                c.getPersonas().get(pos).setCorreo(correo2);
                break;
            case 4:
                System.out.println("Ingrese el ID: ");
                int id = r.nextInt();
                c.getPersonas().get(pos).setId(id);
                break;
        }
    }//fin de modificar administrador

    public static void modiempresas() {
        System.out.println("Ingrese la posicion de la empresa: ");
        int pos = r.nextInt();
        String correo = c.getEmpresas().get(pos).getCorreo();
        String contrasena = c.getEmpresas().get(pos).getContrasena();
        System.out.println("Ingrese el correo: ");
        String correo1 = r.next();
        System.out.println("Ingrese la contraseña: ");
        String contrasena1 = r.next();
        while (correo.equals(correo1) == false && contrasena.equals(contrasena1) == false) {
            System.out.println("Ingrese el correo del administrador: ");
            correo = r.nextLine();
            System.out.println("Ingrese la contraseña del administrador: ");
            contrasena = r.next();
        }
        System.out.println("Menu de empresas: ");
        System.out.println("1) Extranjeras");
        System.out.println("2) Nacionales");
        int op = r.nextInt();
        switch (op) {
            case 1:
                System.out.println("Menu de elementos: ");
                System.out.println("1) Nombre");
                System.out.println("2) Telefono");
                System.out.println("3) Proyectos");
                System.out.println("4) Correo");
                System.out.println("5) Contraseña");
                System.out.println("6) Descripcion");
                System.out.println("7) Pais");
                System.out.println("8) Ciudad");
                System.out.println("9) Pagina web");
                int o = r.nextInt();
                while (o < 1 || o > 9) {
                    System.out.println("Menu de elementos: ");
                    System.out.println("1) Nombre");
                    System.out.println("2) Telefono");
                    System.out.println("3) Proyectos");
                    System.out.println("4) Correo");
                    System.out.println("5) Contraseña");
                    System.out.println("6) Descripcion");
                    System.out.println("7) Pais");
                    System.out.println("8) Ciudad");
                    System.out.println("9) Pagina web");
                    o = r.nextInt();
                }
                switch (o) {
                    case 1:
                        System.out.println("Ingrese su nombre: ");
                        r.nextLine();
                        String nombre = r.nextLine();
                        c.getEmpresas().get(pos).setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese su telefono: ");
                        String telefono = r.next();
                        c.getEmpresas().get(pos).setTelefono(telefono);
                        break;
                    case 3:
                        System.out.println("Ingrese la posicion del proyecto: ");
                        int c1 = r.nextInt();
                        c.getEmpresas().get(pos).getProyecto().add((Proyectos) proyectos.get(c1));
                        break;
                    case 4:
                        System.out.println("Ingrese su correo: ");
                        String correo3 = r.next();
                        c.getEmpresas().get(pos).setCorreo(correo3);
                        break;
                    case 5:
                        System.out.println("Ingrese su contraseña: ");
                        String contrasena3 = r.next();
                        c.getEmpresas().get(pos).setContrasena(contrasena3);
                        break;
                    case 6:
                        System.out.println("Ingrese la descripcion de la empresa: ");
                        r.nextLine();
                        String descripcion = r.nextLine();
                        c.getEmpresas().get(pos).setDescripcion(descripcion);
                        break;
                    case 7:
                        System.out.println("Ingrese el pais: ");
                        String pais = r.next();
                        ((Extranjeras) c.getEmpresas().get(pos)).setPais(pais);
                        break;
                    case 8:
                        System.out.println("Ingrese la ciudad: ");
                        r.nextLine();
                        String ciudad = r.nextLine();
                        ((Extranjeras) c.getEmpresas().get(pos)).setCiudad(ciudad);
                        break;
                    case 9:
                        System.out.println("Ingrese la pagina web: ");
                        String pagina = r.next();
                        ((Extranjeras) c.getEmpresas().get(pos)).setPagina(pagina);
                        break;
                }//fin del switch extranjeras
            case 2:
                System.out.println("Menu de elementos: ");
                System.out.println("1) Nombre");
                    System.out.println("2) Telefono");
                    System.out.println("3) Proyectos");
                    System.out.println("4) Correo");
                    System.out.println("5) Contraseña");
                    System.out.println("6) Descripcion");
                    System.out.println("7) Departamento");
                    System.out.println("8) Municipio");
                    System.out.println("9) Ciudad");
                    System.out.println("10) Mision");
                    System.out.println("11) Vision");
                int o1 = r.nextInt();
                while (o1 < 1 || o1 > 11) {
                    System.out.println("Menu de elementos: ");
                    System.out.println("1) Nombre");
                    System.out.println("2) Telefono");
                    System.out.println("3) Proyectos");
                    System.out.println("4) Correo");
                    System.out.println("5) Contraseña");
                    System.out.println("6) Descripcion");
                    System.out.println("7) Departamento");
                    System.out.println("8) Municipio");
                    System.out.println("9) Ciudad");
                    System.out.println("10) Mision");
                    System.out.println("11) Vision");
                    o1 = r.nextInt();
                }
                switch(o1){
                    case 1:
                        System.out.println("Ingrese su nombre: ");
                        r.nextLine();
                        String nombre = r.nextLine();
                        c.getEmpresas().get(pos).setNombre(nombre);
                        break;
                    case 2:
                        System.out.println("Ingrese su telefono: ");
                        String telefono = r.next();
                        c.getEmpresas().get(pos).setTelefono(telefono);
                        break;
                    case 3:
                        System.out.println("Ingrese la posicion del proyecto: ");
                        int c1 = r.nextInt();
                        c.getEmpresas().get(pos).getProyecto().add((Proyectos) proyectos.get(c1));
                        break;
                    case 4:
                        System.out.println("Ingrese su correo: ");
                        String correo3 = r.next();
                        c.getEmpresas().get(pos).setCorreo(correo3);
                        break;
                    case 5:
                        System.out.println("Ingrese su contraseña: ");
                        String contrasena3 = r.next();
                        c.getEmpresas().get(pos).setContrasena(contrasena3);
                        break;
                    case 6:
                        System.out.println("Ingrese la descripcion de la empresa: ");
                        r.nextLine();
                        String descripcion = r.nextLine();
                        c.getEmpresas().get(pos).setDescripcion(descripcion);
                        break;
                    case 7:
                        System.out.println("Ingrese departamento: ");
                String departamento = r.next();
                ((Nacionales)c.getEmpresas().get(pos)).setDepartamento(departamento);
                break;
                    case 8:
                        System.out.println("Ingrese municipio: ");
                String municipio = r.next();
                ((Nacionales)c.getEmpresas().get(pos)).setMision(municipio);
                break;
                    case 9:
                        System.out.println("Ingrese la ciudad: ");
                String ciudad1 = r.next();
                ((Nacionales)c.getEmpresas().get(pos)).setCiudad(ciudad1);
                break;
                    case 10:
                       System.out.println("Ingrese la mision: ");
                r.nextLine();
                String mision = r.nextLine();
                ((Nacionales)c.getEmpresas().get(pos)).setMision(mision);
                break;
                    case 11:
                        System.out.println("Ingrese la vision: ");
                r.nextLine();
                String vision = r.nextLine();
                ((Nacionales)c.getEmpresas().get(pos)).setVision(vision);
                break;
                }//fin de nacionales
                break;
        }//fin del switch de empresas
    }//fin de modificar empresas
    public static void eliminaradministrador(){
        System.out.println("Ingrese la posicion del administrador: ");
        int pos = r.nextInt();
        System.out.println("Ingrese el correo del administrador: ");
        String correo = r.nextLine();
        System.out.println("Ingrese la contraseña del administrado: ");
        String contrasena = r.next();
        String correo1 = ((Administrador) c.getPersonas().get(pos)).getCorreo();
        String contrasena1 = ((Administrador) c.getPersonas().get(pos)).getContrasena();
        while (correo.equals(correo1) == false && contrasena.equals(contrasena1) == false) {
            System.out.println("Ingrese el correo del administrador: ");
            correo = r.nextLine();
            System.out.println("Ingrese la contraseña del administrador: ");
            contrasena = r.next();
        }
        c.getPersonas().remove(pos);
    }
    public static void eliminarempresas(){
        System.out.println("Ingrese la posicion de la empresa: ");
        int pos = r.nextInt();
        String correo = c.getEmpresas().get(pos).getCorreo();
        String contrasena = c.getEmpresas().get(pos).getContrasena();
        System.out.println("Ingrese el correo: ");
        String correo1 = r.next();
        System.out.println("Ingrese la contraseña: ");
        String contrasena1 = r.next();
        while (correo.equals(correo1) == false && contrasena.equals(contrasena1) == false) {
            System.out.println("Ingrese el correo del administrador: ");
            correo = r.nextLine();
            System.out.println("Ingrese la contraseña del administrador: ");
            contrasena = r.next();
        }
        c.getEmpresas().remove(pos);
    }
    public static void listaradmin(){
        String salida = "";
        for (Object ob : c.getPersonas()) {
            if(ob instanceof Administrador){
                salida += c.getPersonas().indexOf(ob) + "- " + ob + "\n";
            }
        }
        System.out.println(salida);
    }
    public static void listarempresas(){
        String salida = "";
        for (Object ob : c.getEmpresas()) {
            salida += c.getEmpresas().indexOf(ob) + "- " + ob + "\n";
        }
        System.out.println(salida);
    }
    public static void listarproyectos(){
        String salida = "";
        for(Proyectos ob: proyectos){
            salida += proyectos.indexOf(ob) + "- " + ob + "\n";
        }
    }
    public static void eliminarpro(){
    System.out.println("Ingrese la posicion del proyecto");
    int c=r.nextInt();
    proyectos.remove(c);
}
}
