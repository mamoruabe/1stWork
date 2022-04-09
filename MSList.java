public class MSList{

	MainSceneFlame[] ms;
	int MSCount;
	
	public MSList(){
	
	ms = new MainSceneFlame[20];
	MSCount = 0;
	
	}
	
	public void addList(MainSceneFlame msn){
	
		ms[MSCount] = msn;
	
	}
	
	public MainSceneFlame getMs(int n){return ms[n];}


}