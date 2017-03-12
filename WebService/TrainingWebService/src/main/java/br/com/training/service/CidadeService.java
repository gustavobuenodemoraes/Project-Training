package br.com.training.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.google.gson.Gson;

import br.com.training.dao.CidadeDAO;
import br.com.training.model.Cidade;

@Path("cidade")
public class CidadeService {
	@GET
	public String listar(){
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> cidades = cidadeDAO.listar("nome");

		Gson gson = new Gson();
		String json = gson.toJson(cidades);

		return json;
	}
}