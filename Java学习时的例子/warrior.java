
public class warrior extends hero2{			//warrior �̳��� hero2
											//extends���̳У�
											//�̳���hero2
											//˽�еķ��������죬�����޷��̳�
		private int pina;       //սʿ ��ͨ������

		
		
		
		public warrior(){
			super();	//���๹��Ĭ�ϵ��ø��๹��
	//		System.out.println(/**"�������࣡warrior.java"*/);
		}
		
		public warrior(String nickname,  int pina, int maxlife, int currlife){
			setNickname(nickname);
			setPina(pina);
		}
		
		/**
		 * ��д���෽��
		 */
//		public void move(){
//			System.out.println(getNickname()+"�ƶ����ȣ�");	//��д���෽��
//		}
//		
//		
		@Override	//��д
		public void move() {
		
		System.out.println("սʿ�ƶ�����");
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
