/*
*  Описать класс с именем Worker, содержащую следующие поля:
  фамилия и инициалы работника;
  название занимаемой должности;
  год поступления на работу.
Написать программу, выполняющую следующие действия:
  ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);
  если значение года введено не в соответствующем формате выдает исключение.
  вывод на экран фамилии работника, стаж работы которого превышает введенное значение.*/

/*
 * Змінив сортування на лямбда
 * */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Worker> workers = new ArrayList<>();

        do {

            while (true) {
                System.out.println("Enter FIO (Empty string - exit)");
                String fio = sc.nextLine();
                if (fio.length() == 0)
                    break;
                System.out.println("Enter job title");
                String jobTitle = sc.nextLine();
                System.out.println("Enter year of employment (formaat: yyyy)");
                String yearOfEmployment = sc.nextLine();

                try {
                    workers.add(new Worker(fio, jobTitle, yearOfEmployment));
                } catch (WrongYearOfEmploymentException e) {
                    System.out.println(e.getMessage()); // вывести исключение, созданное в блоке try
                }
            }

            if(workers.size() == 0)
                break;

            System.out.println("_____________Before sort_____________");
            for (Worker elem : workers) {
                System.out.println(elem);
            }

            workers.sort((o1, o2) -> o1.getFio().compareTo(o2.getFio()));

            System.out.println("_____________After sort_____________");
            for (Worker elem : workers) {
                System.out.println(elem);
            }

            System.out.println("_____________Show with experience______________");

            System.out.println("Enter min work experience");
            int experience = sc.nextInt();

            LocalDate current_date = LocalDate.now();
            int current_Year = current_date.getYear();

            for (Worker elem : workers) {
                if ((current_Year - Integer.parseInt(elem.getYearOfEmployment())) > experience)
                    System.out.println(elem);
            }
        }while (false);
    }
}