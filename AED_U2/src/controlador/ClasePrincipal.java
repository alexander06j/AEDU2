package controlador;

import java.util.Scanner;
import modelo.GestionTarea;

public class ClasePrincipal {
	public static void main(String[] args) {

		GestionTarea gestionTareas = new GestionTarea();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		try {
			do {
				System.out.println("---Sistema de Gestión de Tareas---");
				System.out.println("1. Agregar tarea");
				System.out.println("2. Marcar tarea como completada");
				System.out.println("3. Eliminar tarea");
				System.out.println("4. Ver tareas pendientes");
				System.out.println("5. Ver próxima tarea");
				System.out.println("6. Salir");
				System.out.print("Seleccione una opción: ");
				opcion = scanner.nextInt();
				scanner.nextLine(); // Consumir el salto de línea

				switch (opcion) {
				case 1:
					System.out.println("Ingrese la descripción de la tarea: ");
					String descripcion = scanner.nextLine();
					gestionTareas.agregarTarea(descripcion);
					System.out.println();
					break;
				case 2:
					gestionTareas.marcarTareaComoCompletada();
					System.out.println();
					break;
				case 3:
					gestionTareas.eliminarTarea();
					System.out.println();
					break;
				case 4:
					gestionTareas.verTareasPendientes();
					System.out.println();
					break;
				case 5:
					gestionTareas.verProximaTarea();
					System.out.println();
					break;
				case 6:
					System.out.println("---Saliendo del programa---");
					break;
				default:
					System.out.println("Opción incorrecta, ingrese otro número. ");
				}

			} while (opcion != 6);

			scanner.close();
		} catch (Exception e) {
			System.out.println("ERROR! Debe ingresar un valor númerico");
		}
	}
}
