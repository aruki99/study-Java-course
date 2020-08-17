
public class hero2 {
		
	
		private String nickname;
		private int level;
		private int maxlife;
		private int currlife;
		
	
		
		
		
		
		public hero2() {
			super();
	//		System.out.println(/**"我是父类！hero2.java"*/);
			// TODO Auto-generated constructor stub
		}
		
		public void move(){
			System.out.println("hero2类move的方法");
		}

		

		public hero2(String nickname, int level, int maxlife, int currlife) {
			super();
			this.nickname = nickname;
			this.level = level;
			this.maxlife = maxlife;
			this.currlife = currlife;
		}
		
		
		public int compareTo(hero2 hero2){
			if(this.level > hero2.getLevel()) return 1;
			else if(this.level == hero2.getLevel()) return 0;
			else return -1;
			
		}
		
		public String getNickname() {
			return nickname;
		}
		public void setNickname(String nickname) {
			this.nickname = nickname;
		}
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public int getMaxlife() {
			
			return maxlife;
		}
		public void setMaxlife(int maxlife) {
			this.maxlife = maxlife;
		}
		public int getCurrlife() {
			return currlife;
		}
		public void setCurrlife(int currlife) {
			this.currlife = currlife;
		}
		
	

	

}
