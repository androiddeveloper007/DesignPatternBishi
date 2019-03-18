package designPatternBishi1.decorator;

//在不影响其他对象的情况下，以动态、透明的方式给单个对象添加职责。
//当不能采用继承的方式对系统进行扩展或者采用继承不利于系统扩展和维护时可以使用装饰模式。不能采用继承的情况主要有两类：
//第一类是系统中存在大量独立的扩展，为支持每一种扩展或者扩展之间的组合将产生大量的子类，使得子类数目呈爆炸性增长；
//第二类是因为类已定义为不能被继承（如Java语言中的final类）。

public class DecoratorPattern {

	public static void main(String[] args) {
		ABattercake aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + ", 销售价格: " + aBattercake.cost());
        
        //购买一个加鸡蛋的煎饼
        ABattercake aBattercake1 = new Battercake();
        aBattercake1 = new EggDecorator(aBattercake);
        System.out.println(aBattercake1.getDesc() + ", 销售价格: " + aBattercake1.cost());

        //购买一个加两个鸡蛋的煎饼
        ABattercake aBattercake2 = new Battercake();
        aBattercake2 = new EggDecorator(aBattercake2);
        aBattercake2 = new EggDecorator(aBattercake2);
        System.out.println(aBattercake2.getDesc() + ", 销售价格: " + aBattercake2.cost());
        
        //购买一个加两个鸡蛋和一根香肠的煎饼
        ABattercake aBattercake3 = new Battercake();
        aBattercake3 = new EggDecorator(aBattercake3);
        aBattercake3 = new EggDecorator(aBattercake3);
        aBattercake3 = new SausageDecorator(aBattercake3);
        System.out.println(aBattercake3.getDesc() + ", 销售价格: " + aBattercake3.cost());
	}
}
