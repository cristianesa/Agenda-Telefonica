package com.agendaapp.agendaapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agendaapp.agendaapp.models.Cliente;
import com.agendaapp.agendaapp.models.Contato;
import com.agendaapp.repository.ClienteRepository;
import com.agendaapp.repository.ContatoRepository;

@Controller
public class ContatoController {
	
	@Autowired
	private ContatoRepository cor;
	
	@Autowired
	private ClienteRepository cr;
	
	@RequestMapping(value="/cadastrarContato", method=RequestMethod.GET)
	public String form() {
		return "contato/formContato";
	}
	
	@RequestMapping(value="/cadastrarContato", method=RequestMethod.POST)
	public String form(Contato contato) {
		cor.save(contato);
		
		return "redirect:/cadastrarContato";
	}
	
	@RequestMapping("/contato")
	public ModelAndView listaContatos() {
		ModelAndView mv = new ModelAndView("");
		Iterable<Contato> contato = cor.findAll();
		mv.addObject("contato", contato); 
		return mv;
		
	}
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ModelAndView detalhesContato(@PathVariable("codigo") long codigo){
		Contato contato = cor.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("detalhesContato");
		mv.addObject("contato", contato);
		return mv;
			
	}


	@RequestMapping(value="/{codigo}", method=RequestMethod.POST)
	public String detalhesContato(@PathVariable("codigo") long codigo, Cliente cliente){
		Contato contato = cor.findByCodigo(codigo);
		cliente.setContato(contato);
		cr.save(cliente);
		return "redirect:/{codigo}";
			
	}

}
