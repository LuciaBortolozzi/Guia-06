public class CasilleroDoble <T1, T2>{
	
	private T1 x; 
	private T2[] y;
	
	public CasilleroDoble(){}

	public CasilleroDoble(T1 x, T2[] y) {
	
		this.x = x;
		this.y = y;
	}
	
	public T1 getX() {
		return x;
	}
	public void setX(T1 x) {
		this.x = x;
	}
	public T2[] getY() {
		return y;
	}
	public void setY(T2[] y) {
		this.y = y;
	}
	
	public static void main(String[] args) {
		
		Double[] arrayDouble = {1.1 , 2.2, 3.3};
		Integer[] arrayInteger = {1 , 2, 3};
		
		CasilleroDoble <Integer,Double> a = new CasilleroDoble<Integer, Double>(5, arrayDouble);
		
		CasilleroDoble <Double,Integer> b = new CasilleroDoble<Double,Integer>(8.2, arrayInteger);
		
		CasilleroDoble <Double,Double> c = new CasilleroDoble<Double, Double>(5.5, arrayDouble);
		
	    Golosinas golosina1 = new Golosinas(1245, "Milka", new String[]{"dulce", "amargo"}, 156.1);
        Golosinas golosina2 = new Golosinas(1246, "Sugus", new String[]{"dulce", "acido"}, 156.7);
        Golosinas golosina3 = new Golosinas(1247, "Bazooka", new String[]{"dulce", "acido"}, 98.6);
        Golosinas golosina4 = new Golosinas(1248, "Rocklets", new String[]{"dulce", "amargo"}, 98.9);
        Golosinas[] golosinas = new Golosinas[4];
		
		CasilleroDoble <Integer,Golosinas> d = new CasilleroDoble<Integer, Golosinas>(4, golosinas);
			
	}
}



