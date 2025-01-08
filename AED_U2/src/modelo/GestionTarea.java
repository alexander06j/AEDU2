package modelo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GestionTarea {

	private Stack<Tarea> tareasPendientes;
	private Queue<Tarea> tareasCompletadas;

	public GestionTarea() {
		tareasPendientes = new Stack<>();
		tareasCompletadas = new LinkedList<>();
	}

	public void agregarTarea(String descripcion) {
		Tarea nuevaTarea = new Tarea(descripcion);
		tareasPendientes.push(nuevaTarea);
	}

	public void marcarTareaComoCompletada() {
		if (!tareasPendientes.isEmpty()) {
			Tarea tareaCompletada = tareasPendientes.pop();
			tareasCompletadas.add(tareaCompletada);
		} else {
			System.out.println("No hay tareas pendientes para completar.");
		}
	}

	public void eliminarTarea() {
		if (!tareasPendientes.isEmpty()) {
			tareasPendientes.pop();
		} else {
			System.out.println("No hay tareas pendientes para eliminar.");
		}
	}

	public void verTareasPendientes() {
		if (tareasPendientes.isEmpty()) {
			System.out.println("No hay tareas pendientes.");
		} else {
			System.out.println("Tareas pendientes:");
			for (Tarea tarea : tareasPendientes) {
				System.out.println(tarea);
			}
		}
	}

	public void verProximaTarea() {
		if (tareasPendientes.isEmpty()) {
			System.out.println("No hay tareas pendientes.");
		} else {
			System.out.println("Próxima tarea a realizar: " + tareasPendientes.peek());
		}
	}

}
