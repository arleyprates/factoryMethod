package mata62;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		// TODO Auto-generated method stub

		return new Palio();

	}

	@Override
	public Carro criarCarro(String carro) {
		// TODO Auto-generated method stub
		
		return new Palio(carro);

	}

}
