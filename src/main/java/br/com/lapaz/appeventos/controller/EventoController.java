package br.com.lapaz.appeventos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.lapaz.appeventos.models.Evento;
import br.com.lapaz.appeventos.repository.EventoRepository;

@Controller
public class EventoController {
	@Autowired
	private EventoRepository repo;
	@RequestMapping(value = "/cadastrarEvento",method = RequestMethod.GET)
	public String form() {
		return "evento/formEvento";
	}
	@RequestMapping(value = "/cadastrarEvento",method = RequestMethod.POST)
	public String form(Evento evento) {
		repo.save(evento);
		return "redirect:/cadastrarEvento";
	}
	public EventoRepository getRepo() {
		return repo;
	}
	public void setRepo(EventoRepository repo) {
		this.repo = repo;
	}
}
