
public class fashi extends hero2{
		private int faqian; 
		
		public fashi() {
			// TODO Auto-generated constructor stub
			setNickname("����");
			setLevel(20);
			setFaqian((int) (getLevel()*1.5+20));
			setMaxlife(2000);
			setCurrlife(888);
			System.out.print("���Ƿ�ʦ��"  + getNickname() );
			System.out.println("��ǿ" + faqian);
		}

//		public fashi(String nickname) {
//			this();
//			setNickname(nickname);
//			
//		}
//		@Override
//		public String toString() {
//		// TODO Auto-generated method stub
//			StringBuffer str = new StringBuffer(getLevel());
//			str.append("/t");
//			str.append(getNickname());
//			str.append("/t");
//			str.append(getMaxlife());
//			System.out.println(str);
//			return super.toString();
//		
//		}
//		
		public void biubiu(){
			System.out.println("��ʦ" + getNickname() + "���ڴ����" + "���" +getFaqian() + "�˺�");
	}
		
		
		
		
		

		public int getFaqian() {
			return faqian;
		}

		public void setFaqian(int faqian) {
			this.faqian = faqian;
		}

		
}
