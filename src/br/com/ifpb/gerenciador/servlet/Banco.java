package br.com.ifpb.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;



public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("IFPB - Campus CG");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("IFPB - Campus JP");
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	public void remove(String nome) {
		for(int i =0; i<Banco.lista.size();i++) {
			if(Banco.lista.get(i).getNome().equals(nome)) {
				Banco.lista.remove(Banco.lista.get(i));
				break;
			}
		}
	}
	public void editaNome(String nome, String novoNome) {
		for(int i =0; i<Banco.lista.size();i++) {
			if(Banco.lista.get(i).getNome().equals(nome)) {
				Banco.lista.get(i).setNome(novoNome);
				break;
			}
		}
	}
	public boolean existeEmpresa(String nome) {
		for(int i =0; i<Banco.lista.size();i++) {
			if(Banco.lista.get(i).getNome().equals(nome)) {
				Banco.lista.get(i).setNome(nome);
				return true;
			}
		}
		return false;
	}

}
