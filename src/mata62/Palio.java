package mata62;

public class Palio implements Carro {

	private String modelo;
	
	public Palio(String carro) {
		// TODO Auto-generated constructor stub
		setModelo(carro);
		exibirInfo();
	}

	public Palio() {
		// TODO Auto-generated constructor stub
		exibirInfo();
	}

	@Override
	public void exibirInfo() {
		// TODO Auto-generated method stub
		System.out.println(getModelo());
		
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
