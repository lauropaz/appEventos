package br.com.lapaz.appeventos.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.lapaz.appeventos.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long> {


}
