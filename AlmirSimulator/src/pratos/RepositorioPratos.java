package pratos;

public interface RepositorioPratos {
	void inserir(Prato prato);
	
	void atualizar(Prato prato) throws PNEException;
	
	void remover(int codigoPrato) throws PNEException;
	
	Prato procurar(int codigoPrato) throws PNEException;
	
	boolean existe(int codigoPrato);
	
	int getCodigo();
	
}
