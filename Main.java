package dnp.Third.Homework;

//1)Создайте класс описывающий человека (создайте метод
//выводящий информацию о человеке)
//2)На его основе создайте класс студент (переопределите
//метод вывода информации)
//3)Создайте класс группа — который содержит массив из 10
//объектов класса студент. Реализуйте методы добавления,
//удаления студента и метод поиска студента по фамилии. В
//случае попытки добавления 11 студента создайте
//собственное исключение и обработайте его. Определите
//метод toString() для группы так, что бы он выводил список
//студентов в алфавитном порядке.


public class Main {
	public static void main(String[] args) {
        Group stock = new Group();

            stock.addSt(new Student("Антип", "Сальников", "ua", false, 22, "экономика", 4));
            stock.addSt(new Student("Bальдемар", "Децибелов", "ua", false, 22, "экономика", 5));
            stock.addSt(new Student("Сисилия", "Пятеркина", "ua", true, 19, "дизайн", 1));
            stock.addSt(new Student("Василий", "Бабайкин", "ua", false, 20, "юриспруденция", 3));
            stock.addSt(new Student("Тракторина", "Долбайлова", "ru", true, 25, "ветеринария", 5));
            stock.addSt(new Student("Дормидонт", "Проверочный", "to", false, 18, "аграрный", 1));
            stock.addSt(new Student("Яздундокта", "Редкая", "by", true, 17, "экономика", 1));
            stock.addSt(new Student("Альберт", "Гасилов", "ru", false, 21, "юриспруденция", 2));
            stock.addSt(new Student("Жозефина", "Грибова", "fr", true, 22, "искусство", 4));
            stock.addSt(new Student("Малгоржата", "Финальная", "pl", true, 18, "экономика", 2));
            
            System.out.println(stock);
            stock.checkSt("Проверочный");
            System.out.println();
            stock.checkSt("Неизвестный");
            stock.delSt(10);
            System.out.println();
            stock.addSt(new Student("Гаврила", "Новиков", "kz", false, 23, "механика", 5));
            System.out.println();
            stock.checkSt("Проверочный");
            
        } 
           
         
}
