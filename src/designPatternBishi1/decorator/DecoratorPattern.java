package designPatternBishi1.decorator;

//�ڲ�Ӱ���������������£��Զ�̬��͸���ķ�ʽ�������������ְ��
//�����ܲ��ü̳еķ�ʽ��ϵͳ������չ���߲��ü̳в�����ϵͳ��չ��ά��ʱ����ʹ��װ��ģʽ�����ܲ��ü̳е������Ҫ�����ࣺ
//��һ����ϵͳ�д��ڴ�����������չ��Ϊ֧��ÿһ����չ������չ֮�����Ͻ��������������࣬ʹ��������Ŀ�ʱ�ը��������
//�ڶ�������Ϊ���Ѷ���Ϊ���ܱ��̳У���Java�����е�final�ࣩ��

public class DecoratorPattern {

	public static void main(String[] args) {
		ABattercake aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + ", ���ۼ۸�: " + aBattercake.cost());
        
        //����һ���Ӽ����ļ��
        ABattercake aBattercake1 = new Battercake();
        aBattercake1 = new EggDecorator(aBattercake);
        System.out.println(aBattercake1.getDesc() + ", ���ۼ۸�: " + aBattercake1.cost());

        //����һ�������������ļ��
        ABattercake aBattercake2 = new Battercake();
        aBattercake2 = new EggDecorator(aBattercake2);
        aBattercake2 = new EggDecorator(aBattercake2);
        System.out.println(aBattercake2.getDesc() + ", ���ۼ۸�: " + aBattercake2.cost());
        
        //����һ��������������һ���㳦�ļ��
        ABattercake aBattercake3 = new Battercake();
        aBattercake3 = new EggDecorator(aBattercake3);
        aBattercake3 = new EggDecorator(aBattercake3);
        aBattercake3 = new SausageDecorator(aBattercake3);
        System.out.println(aBattercake3.getDesc() + ", ���ۼ۸�: " + aBattercake3.cost());
	}
}
