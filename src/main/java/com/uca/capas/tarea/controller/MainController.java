package com.uca.capas.tarea.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/alumno")
	public @ResponseBody String ejemplo() {
		return 	"Nombre: Luis Adalberto" + "\n" +
				"Apellido: Trujillo Perez" + "\n" +
				"Carnet: 00127717" + "\n"+ 
				"Carrera: Ingeniería Informática" + "\n"+
				"Año Cursado: 3°" + "\n";
		
	}

	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request, HttpServletRequest request2, HttpServletRequest request3) {
		Integer param = Integer.parseInt(request.getParameter("dia"));
		Integer param2 = Integer.parseInt(request.getParameter("mes"));
		Integer param3 = Integer.parseInt(request.getParameter("año"));
		
		Calendar c = Calendar.getInstance();
		c.set(param3,param2,param);
		int intDia = c.get(Calendar.DAY_OF_WEEK);
		String dia;
		switch(intDia) {
		case 2: dia="Lunes";
		break;
		case 3: dia="Martes";
		break;
		case 4: dia="Miercoles";
		break;
		case 5: dia="Jueves";
		break;
		case 6: dia="Viernes";
		break;
		case 7: dia="Sabado";
		break;
		case 1: dia="Domingo";
		break;
		default: dia="Ningun día seleccionado";
		break;
		}
		return "El dia de la semana es   "+dia;
	}
	
}