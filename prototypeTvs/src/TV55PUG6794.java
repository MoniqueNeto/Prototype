
public class TV55PUG6794 extends PhillipsPrototype{

	protected TV55PUG6794 (TV55PUG6794 tv) {
		this.tela = "LED 55 4K Ultra HD AMBILIGHT";
		this.valorVenda = tv.getValorVenda();
	}
	
	public TV55PUG6794() {
		
	}
	

	@Override
	public String infoTv() {
		System.out.println("A TV PHILLIPS TV55PUG6794 POSSUI TELA " + this.tela + "custa R$ " + getValorVenda());
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhillipsPrototype clonar() {
		// TODO Auto-generated method stub
		return new TV55PUG6794(this);
	}

}
