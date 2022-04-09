public class MonsterList{

	Monster[] msList;
	int ListCount ;
	
	public MonsterList(){
	
		msList = new Monster[100];
		ListCount = 0;
		addMonsterList(new Slaim());
		addMonsterList(new Goburin());
	
	}
	
	public void addMonsterList(Monster ms){
	
		msList[ListCount] = ms;
		ListCount++;
	
	}
	
	public Monster getMonster(){
	
		//double K = Math.random();
		//return ms[(int)(ListCount*K)];
		return msList[1];
	
	}

}