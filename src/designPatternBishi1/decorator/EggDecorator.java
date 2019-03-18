package designPatternBishi1.decorator;

//����װ�������̳��˳���װ���࣬����װ�����ڸ���Ļ�����������һ��������ͬʱ�۸���� 1 ��Ǯ
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " ��һ������";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
    
    public void egg() {
        System.out.println("������һ������");
    }
}