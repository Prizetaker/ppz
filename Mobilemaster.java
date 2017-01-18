package dnp.First.Homework;

//Опишите класс Phone (одним из свойств должен быть его номер). Также опишите
//класс Network (сеть мобильного оператора). Телефон должен иметь метод
//регистрации в сети мобильного оператора. Также у телефона должен быть метод call
//(номер другого телефона), который переберет все телефоны, зарегистрированные в
//сети. Если такой номер найден, то осуществить вызов, если нет - вывести сообщение
//о неправильности набранного номера.

public class Mobilemaster {
	static Network kyivstar = new Network ("Kyivstar");
	static Network lifecell = new Network ("Lifecell");
	static Network vodafone = new Network ("Vodafone");
	static Phone first = new Phone (111111111111L);
	static Phone second = new Phone (222222222222L);
	static Phone third = new Phone (333333333333L);
	static Phone fourth = new Phone (444444444444L);
	static Phone fifth = new Phone (555555555555L);
	static Phone sixth = new Phone (666666666666L);
	static Phone seventh = new Phone (777777777777L);
	static Phone eighth = new Phone (888888888888L);
	static Phone nineth = new Phone (999999999999L);
	
public static void main(String[] args) {
	
	first.register(kyivstar);
	second.call(first);
	second.register(kyivstar);
	second.call(first);
	third.register(kyivstar);
	third.register(kyivstar);
	fourth.register(lifecell);
	fifth.register(lifecell);
	System.out.println(fifth);
	sixth.register(lifecell);
	seventh.register(vodafone);
	eighth.register(vodafone);
	second.call(nineth);
	nineth.register(vodafone);
	second.call(nineth);
}
}
