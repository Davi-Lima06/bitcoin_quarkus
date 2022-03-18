package br.com.alure.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import br.com.alure.model.Bitcoin;
import br.com.alure.service.BitcoinService;

@Path("/bitcoins")
public class BitcoinResource {

	@Inject
	@RestClient
	BitcoinService bitService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> lista(){
		return bitService.listar();
	}
}
