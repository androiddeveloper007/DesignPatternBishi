package designPatternBishi1.decorator;

//�㳦װ�������뼦��װ�������ƣ��̳��˳���װ���࣬���ڸ���Ļ����ϼ���һ���㳦��ͬʱ�۸����� 2 ��Ǯ
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }
    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " ��һ���㳦";
    }
    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}