package view;

import model.PessoaFisica;

public class Execucao {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		PessoaFisica pf = new PessoaFisica();
		
		pf.setCpf(889609);
		System.out.println(pf.getCpf());
		
		pf.setBairro("Rua Sonho Gaucho");
		System.out.println(pf.getBairro());
		
		pf.setCep(243461);
		System.out.println(pf.getCep());
		
		pf.setCidade("S�o Paulo");
		System.out.println(pf.getCidade());
		
		pf.setEndereco("Rua Raimundo Brand�o");
		System.out.println(pf.getEndereco());
		
		pf.setEstado("S�o Paulo");
		System.out.println(pf.getEstado());
		
	}
	

}
