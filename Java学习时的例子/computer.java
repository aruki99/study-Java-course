public class computer {
	
	//��̬��������ȭ����Ϣ
	public static final int typefist = 1;
	//��̬��������ȭ����Ϣ Ӯ�ñ���
	public static final int typewin = 2;
	//��̬��������ȭ����Ϣ ���˱���
	public static final int typelose = 3;
	//���ԣ� ���ƣ���������ȭ����ɫ���Ի�̨��
//	public static final int pyc2 = 4;
	public String name;
	public int fenshu;
	public int quan;
	
	//��ɫ��ȭʱ�ĸ��Ի�̨��
	public String[] fistwords = {
			"����\n����\n����\n����\n����",
			"�����Ѵ߻�\n����ĸ�߻�\n�����ݴ߻�\nһֱ���߻�\n��δֹͣ",
			"�ս�����\n������\n����\n��\n��",
			"�����\n���ű����\n�������\n�������˸��\n��·�ϱ����",
			};
	
	
//	public String[] pyc = {
//			"����\n����\n����\n����\n����",
//			"�����Ѵ߻�\n����ĸ�߻�\n�����ݴ߻�\nһֱ���߻�\n��δֹͣ",
//			"�ս�����\n������\n����\n��\n��",
//			"�����\n���ű����\n�������\n�������˸��\n��·�ϱ����",
//			
//	};
	
	public String[] winwords = {
			"����˭��������",
			"����˼��������Զ��򲻹���",
			"û��˼��Ӯ��̫������",
			"ף�㳬��������"
	};
	
	public String[] losewords = {
			"ͨ���ɹ��ĵ�·����û��",
			"ʧ���˳ɹ�֮ĸ",
			"����������",
			"�������� ����������������",
			"�����ˣ�"
	};
	//������ ���ú͵õ����ƣ�������˵���Ի�̨�ʣ���ȭ
	
	
	/**
	 * ���ݴ�����Ϣ�������ӡ����Ӧ���͵���Ϣ
	 * xinxitype ��Ӧ�� human�еľ�̬����
	 * */
	public void sendxinxi(int xinxitype){
		//�������1~4������
		int index = ((int)(Math.random() * 1000)) % 5;
		String xuyao = null;
		
		switch (xinxitype) {
		case typefist:
			xuyao = fistwords[index];
			break;
			
		case typewin:
			xuyao = winwords[index];
			break;
		
		case typelose:
			xuyao = losewords[index];
			break;
//		case pyc2:
//			xuyao = pyc[index]; 
		}
		System.out.println(xuyao);
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getFenshu() {
		return fenshu;
	}



	public void setFenshu(int fenshu) {
		this.fenshu = fenshu;
	}



	public int getQuan() {
		//���Ե������ȭ����ʵΪ���������1~3֮�������
		quan = ((int)(Math.random() * 30000)) % 3 + 1;
		return quan;
	}



//	public void setQuan(int quan) {
//		this.quan = quan;
//	}
		
	
	
}
