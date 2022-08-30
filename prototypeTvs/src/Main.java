
public class Main {
		
	public static void main(String[] args) {
		
		TV43J5290 TV43J5290prototype = new TV43J5290();
		SamsungPrototype TV43J5290nova =  TV43J5290prototype.clonar();
		TV43J5290nova.setValorVenda(1890);
		TV43J5290nova.infoTv();
		
		
		TV50RU7100 TV50RU7100prototype = new TV50RU7100();
		SamsungPrototype TV50RU7100nova =  TV50RU7100prototype.clonar();
		TV50RU7100nova.setValorVenda(2099);
		TV50RU7100nova.infoTv();	
		
		

		TV55PUG6794 TV55PUG6794prototype = new TV55PUG6794();
		PhillipsPrototype TV55PUG6794nova =  TV55PUG6794prototype.clonar();
		TV55PUG6794nova.setValorVenda(3199);
		TV55PUG6794nova.infoTv();	
		
		
}
}
