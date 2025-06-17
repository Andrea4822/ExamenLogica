package org.example;
import java.util.Scanner;
import java.time.LocalDate;
public class Main {
    public static void main (String[] args) {
        System.out.printf("exámen logica");
        Scanner logica=new Scanner(System.in);

        // Información general
        String nombreProgramador;
        String correo;
        String pais;
        String ciudad;
        String tipoContrato;
        String nivelExperiencia;
        String cliente1;
        String cliente3;
        String cliente2;
        int edad;
        byte aniosExperiencia;
        double tarifaBase;
        double tarifaExperiencia;
        float tarifaNivel;

        // Entrada de información general
        System.out.println("Ingrese el nombre del programador");
        nombreProgramador =logica.next();

        System.out.print("Ingrese el correo electrónico: ");
        correo = logica.next();

        System.out.print("Ingrese la ciudad: ");
        ciudad = logica.nextLine();

        System.out.print("Ingrese el país: ");
        pais = logica.nextLine();

        System.out.print("Ingrese el tipo de contrato (Fulltime/Parttime/Freelance): ");
        tipoContrato = logica.nextLine();

        System.out.print("Ingrese el nivel de experiencia (Junior/Senior): ");
        nivelExperiencia = logica.nextLine();

        System.out.print("Ingrese la edad del programador: ");
        edad = logica.nextInt();

        System.out.print("Ingrese los años de experiencia: ");
        aniosExperiencia = logica.nextByte();

        // Ajuste de tarifa según experiencia

        tarifaBase = 50.00;  // base por hora
        tarifaNivel = (nivelExperiencia.equalsIgnoreCase("Senior")) ? 20 : 0;
        tarifaExperiencia = aniosExperiencia * 1.5;
        double tarifaHoraFinal = tarifaBase + tarifaNivel + tarifaExperiencia;

        System.out.println("\nTarifa final por hora calculada: $" + tarifaHoraFinal);

        // Información de proyectos
        System.out.println("\nIngrese los nombres de los 3 clientes:");
        logica.nextLine(); // limpiar buffer
        System.out.print("Cliente 1: ");
        cliente1 = logica.next();
        System.out.print("Cliente 2: ");
        cliente2 = logica.next();
        System.out.print("Cliente 3: ");
        cliente3 = logica.next();

        int horasProyecto1;
        int horasProyecto3;
        int horasProyecto2;
        double bonusCliente1;
        double bonusCliente2;
        double bonusCliente3;
        double pagoProyecto1;
        double pagoProyecto2;
        double pagoProyecto3;
        double subtotal;
        double descuentos;
        double impuestos;
        double totalFinal;

        // Captura de horas
        System.out.print("Horas trabajadas para " + cliente1 + ": ");
        horasProyecto1 = logica.nextInt();
        System.out.print("Bono adicional para " + cliente1 + ": ");
        bonusCliente1 = logica.nextDouble();
        System.out.print("Horas trabajadas para " + cliente2 + ": ");
        horasProyecto2 = logica.nextInt();
        System.out.print("Bono adicional para " + cliente2 + ": ");
        bonusCliente2 =logica.nextDouble();

        System.out.print("Horas trabajadas para " + cliente3 + ": ");
        horasProyecto3 = logica.nextInt();
        System.out.print("Bono adicional para " + cliente3 + ": ");
        bonusCliente3 = logica.nextDouble();

        // Cálculos de pago por proyecto
        pagoProyecto1 = (horasProyecto1 * tarifaHoraFinal) + bonusCliente1;
        pagoProyecto2 = (horasProyecto2 * tarifaHoraFinal) + bonusCliente2;
        pagoProyecto3 = (horasProyecto3 * tarifaHoraFinal) + bonusCliente3;

        subtotal = pagoProyecto1 + pagoProyecto2 + pagoProyecto3;

        // Operaciones adicionales
        descuentos = subtotal * 0.03; // 3% de fondo de ahorro
        impuestos = subtotal * 0.09;  // 9% de retenciones

        totalFinal = subtotal - descuentos - impuestos;

        // Captura fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Impresión del reporte
        System.out.println("\n----- REPORTE DE PAGO -----");
        System.out.println("Nombre del programador: " + nombreProgramador);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad: " + ciudad + ", " + pais);
        System.out.println("Fecha de liquidación: " + fechaActual);
        System.out.println("Tipo de contrato: " + tipoContrato);
        System.out.println("Nivel de experiencia: " + nivelExperiencia);
        System.out.println("Tarifa por hora: $" + tarifaHoraFinal);

        System.out.println("\nDetalle por cliente:");
        System.out.println(cliente1 + ": $" + pagoProyecto1);
        System.out.println(cliente2 + ": $" + pagoProyecto2);
        System.out.println(cliente3 + ": $" + pagoProyecto3);

        System.out.println("\nSubtotal: $" + subtotal);
        System.out.println("Descuentos (3%): $" + descuentos);
        System.out.println("Impuestos (9%): $" + impuestos);
        System.out.println("Total a recibir: $" + totalFinal);

        logica.close();
    }
}