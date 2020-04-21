package com.uca.capas.tarea.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/ejemplo")
	public @ResponseBody String ejemplo() {
		String texto = "Hola Mundo desde Spring MVC! La hora actual es: ";
		return texto.concat(Calendar.getInstance().getTime().toString());
	}

	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param = Integer.parseInt(request.getParameter("dia"));
		String dia;
		switch (param) {
			case 1: dia = "Lunes";
			break;
			case 2: dia = "Martes";
			break;
			case 3: dia = "Miercoles";
			break;
			case 4: dia = "Jueves";
			break;
			case 5: dia = "Viernes";
			break;
			case 6: dia = "Sabado";
			break;
			case 7: dia = "Domingo";
			break;
			default: dia = "Ningun dia seleccionado";
			break;
		}
		
		return "Dia de la semana enviado: " + dia;
	}

}