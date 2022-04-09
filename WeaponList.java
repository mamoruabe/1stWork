public class WeaponList{

	private Weapon[] wpList;
	int wpCount;
	Weapon sude ;
	
	public WeaponList(){
	
		wpList = new Weapon[100];
		wpCount =0;
		sude = new SUDE();
		
		addWeaponList(new Wood());
	
	}
	
	public void addWeaponList(Weapon wp){
	
		wpList[wpCount] = wp;
		wpCount++;
	
	}
	
	public Weapon getSUDE(){return sude;}

}