
public class warrior extends hero2{			//warrior 继承了 hero2
											//extends（继承）
											//继承了hero2
											//私有的方法，构造，属性无法继承
		private int pina;       //战士 普通攻击伤

		
		
		
		public warrior(){
			super();	//子类构造默认调用父类构造
	//		System.out.println(/**"我是子类！warrior.java"*/);
		}
		
		public warrior(String nickname,  int pina, int maxlife, int currlife){
			setNickname(nickname);
			setPina(pina);
		}
		
		/**
		 * 重写父类方法
		 */
//		public void move(){
//			System.out.println(getNickname()+"移动靠腿！");	//重写父类方法
//		}
//		
//		
		@Override	//重写
		public void move() {
		
		System.out.println("战士移动靠走");
		}
		
		
		
		
		public warrior(int pina) {
			super();
			this.pina = pina;
		}

		public int getPina() {
			return pina;
		}

		public void setPina(int pina) {
			this.pina = pina;
		}
		
		
}
