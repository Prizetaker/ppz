package dnp.First.Homework;

public class Phone {
private Long number;
private boolean status; //зарегистрирован в сети - тру

public Phone() {
	super();
}

public Phone(Long number) {
	super();
	this.number = number;
}

public void call (Phone phone){
	if (status){
		if (phone.status)
		System.out.println("соединение с "+phone.number+" удалось");
	else 
		System.out.println("абонент "+phone.number+" недоступен");
	}
else 
	System.out.println("нужно зарегистрировать");
}
//добавляем номер в сеть
public void register (Network net){
	if (net.addNumber(number)){
		status=true;
	System.out.println(this.number+" успешно зарегистрирован в " + net.getOperatorName());}
	else
	System.out.println(this.number+" уже зарегистрирован");	
}

@Override
public String toString() {
	return "Телефон [номер=" + number + ", статус="+ status + "]";
}

}
