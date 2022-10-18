/*	
    Nome: Avaliação Pratica

	Instituição:FACULDADE DE EDUCAÇÃO TECNOLÓGIA DO ESTADO DO RIO DE JANEIRO
				FAETERJ - BARRA MANSA 
	Alunos: Otávio, Thiago, Matheus, Luan 
	Data: 26/09/22 
	Descrição: Classe Objeto
*/
public class Projects {
	private int id;
	private String title;
	private String owner;
	
	//METODOS ACESSOR
	
	public int getid() { 
		return id;
	}
	
	public String gettitle() { 
		return title;
	}
	
	public String getowner() { 
		return owner;
	}
	
	//METODOS MODIFICADOR

	public void setid(int id) {
		this.id = id;
	}
	
	public void settitle(String title) {
		this.title = title;
	}

	public void setowner(String owner) {
		this.owner = owner;
	}
	
	//METODOS CONSTRUTOR
	
	public Projects(int id, String title, String owner) {
		this.id=id;
		this.title=title;
		this.owner=owner;
	}
	
	

	
	
	
	

}
