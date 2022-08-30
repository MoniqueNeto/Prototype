
public class TV50RU7100 extends SamsungPrototype {

	protected TV50RU7100 (TV50RU7100 tv) {
		this.tela = "LED 50 UHD 4K";
		this.valorVenda = tv.getValorVenda();
	}
	
	public TV50RU7100() {
		
	}


	public String infoTv() {
		
		System.out.println("A SMART TV50RU7100 POSSUI TELA " + this.tela + " e custa R$ " + getValorVenda());
		return null;
	}

	public SamsungPrototype clonar() {	
		
		return new TV50RU7100(this);
	}

	
}
