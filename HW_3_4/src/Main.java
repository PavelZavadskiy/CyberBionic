/*
Создайте класс DocumentWorker. В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт", "Редактирование
документа доступно в версии Про", "Сохранение документа доступно в версии Про". Создайте производный класс
ProDocumentWorker. Переопределите соответствующие методы, при переопределении методов выводите следующие
строки: "Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
доступно в версии Эксперт". Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран "Документ сохранен
в новом формате". В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается экземпляр базового
класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться экземпляр соответствующей
версии класса, приведенный к базовому – DocumentWorker.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final String KEY_PRO = "123456";
        final String KEY_EXP = "qwerty";

        Scanner sc = new Scanner(System.in);
        String key;

        System.out.print("Добавить ключ регистрации (если ключа нет, оставьте поле пустым): ");
        key = sc.nextLine();

        DocumentWorker dw;

        if(key.equals(KEY_PRO)){
            dw = new ProDocumentWorker();
        }
        else if(key.equals(KEY_EXP)){
            dw = new ExpertDocumentWorker();
        }
        else{
            dw = new DocumentWorker();
        }

        dw.openDocument();
        dw.editDocument();
        dw.saveDocument();

        sc.close();
    }
}