
public class car extends Veiculo {
	
	private boolean semParar;
	
	car(){}
	
	car(short velocidade, boolean semParar){
		velocidade = super.velocidade;
		this.semParar = semParar;
		velocidade = 110;
		semParar = true;
	}

	public boolean isSemParar() {
		return semParar;
	}

	public void setSemParar(boolean semParar) {
		this.semParar = semParar;
	}
	
	public short getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(short velocidade) {
		this.velocidade = velocidade;
	}
	
	/*
	@Override
	public void setVelocidade(short velocidade) {
		// TODO Auto-generated method stub
		super.setVelocidade(velocidade);
	}*/
	
	
	

}
