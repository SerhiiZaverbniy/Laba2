package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int count = 10;
        Abiturient[] Stud = new Abiturient[count];
        for (int i = 0; i < count; i++) {
            Abiturient X = new Abiturient();
            X.setValueId(" ");
            X.setValueName(" ");
            X.setValueSurname(" ");
            X.setValuePatronymic(" ");
            X.setValueAddress(" ");
            X.setValuePhone(" ");
            X.setValueBal(0);
            Stud[i] = X;
        }
        //Ініціалізація даних
        Stud[0].setValueId("5LL8CZ9X5");
        Stud[0].setValueSurname("Самсонов");
        Stud[0].setValueName("Борис");
        Stud[0].setValuePatronymic("Федорович");
        Stud[0].setValueAddress("вул.Зарічна 1, кв.15");
        Stud[0].setValuePhone("088-20-49-762");
        Stud[0].setValueBal(77.7);

        Stud[1].setValueId("SO670BQA5");
        Stud[1].setValueSurname("Капустин");
        Stud[1].setValueName("Всеволод");
        Stud[1].setValuePatronymic("Григорійович");
        Stud[1].setValueAddress("вул.Фруктова 144, кв.820");
        Stud[1].setValuePhone("076-13-20-829");
        Stud[1].setValueBal(59.6);

        Stud[2].setValueId("UTL99VKM5");
        Stud[2].setValueSurname("Соколов");
        Stud[2].setValueName("Віталій");
        Stud[2].setValuePatronymic("Богданович");
        Stud[2].setValueAddress("вул.Чортополохівська 45, кв.156");
        Stud[2].setValuePhone("084-99-24-466");
        Stud[2].setValueBal(82.2);

        Stud[3].setValueId("H8127YXR2");
        Stud[3].setValueSurname("Гаврилів");
        Stud[3].setValueName("Ярослав");
        Stud[3].setValuePatronymic("Вадимович");
        Stud[3].setValueAddress("вул.Дев'ятий Вал 165, кв.499");
        Stud[3].setValuePhone("064-67-85-114");
        Stud[3].setValueBal(91.0);

        Stud[4].setValueId("UC810UKG9");
        Stud[4].setValueSurname("Андрусейко");
        Stud[4].setValueName("Всеволод");
        Stud[4].setValuePatronymic("Олександрович");
        Stud[4].setValueAddress("вул.Чоботова 60, кв.986");
        Stud[4].setValuePhone("034-15-42-254");
        Stud[4].setValueBal(91.9);

        Stud[5].setValueId("NL793ELW6");
        Stud[5].setValueSurname("Тарасюк");
        Stud[5].setValueName("Юрій");
        Stud[5].setValuePatronymic("Едуардович");
        Stud[5].setValueAddress("вул.Гнатюка 13, кв.71");
        Stud[5].setValuePhone("003-84-38-273");
        Stud[5].setValueBal(98.2);

        Stud[6].setValueId("Q30GPF810");
        Stud[6].setValueSurname("Філатов");
        Stud[6].setValueName("Віталій");
        Stud[6].setValuePatronymic("Романович");
        Stud[6].setValueAddress("вул.Митрофанівська 27, кв.101");
        Stud[6].setValuePhone("061-50-88-720");
        Stud[6].setValueBal(69.7);

        Stud[7].setValueId("CQ450APK1");
        Stud[7].setValueSurname("Городецький");
        Stud[7].setValueName("Ігор");
        Stud[7].setValuePatronymic("Платонович");
        Stud[7].setValueAddress("вул.Спасоглинівська 10, кв.218");
        Stud[7].setValuePhone("083-99-25-803");
        Stud[7].setValueBal(77.5);

        Stud[8].setValueId("3RQ90PH62");
        Stud[8].setValueSurname("Шилов");
        Stud[8].setValueName("Всеволод");
        Stud[8].setValuePatronymic("Брониславович");
        Stud[8].setValueAddress("вул.Юріївська 63, кв.969");
        Stud[8].setValuePhone("063-15-69-420");
        Stud[8].setValueBal(53.0);

        Stud[9].setValueId("5CP628FK7");
        Stud[9].setValueSurname("Гайчук");
        Stud[9].setValueName("Харитон");
        Stud[9].setValuePatronymic("Володимирович");
        Stud[9].setValueAddress("вул.Богучарська 15, кв.646");
        Stud[9].setValuePhone("081-36-79-054");
        Stud[9].setValueBal(73.6);
        //a) список абітурієнтів із вказаним іменем;
        String Name = new String();
        System.out.println("Вкажіть ім'я");
        Name = in.nextLine();
        SameName(Stud, count, Name);
        //Сортування даних для зручності виконання
        boolean isSorted = false;
        Abiturient buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < count - 1; i++) {
                if (Stud[i].getValueBal() > Stud[i + 1].getValueBal()) {
                    isSorted = false;
                    buf = Stud[i];
                    Stud[i] = Stud[i + 1];
                    Stud[i + 1] = buf;
                }
            }
        }
        //b) список абітурієнтів, середній бал у яких вище заданого;
        System.out.println("Вкажіть потрібний вам середній бал");
        System.out.println("Мінімальне значення 0, максимальне 100");
        double bal = in.nextDouble();
        BalList(Stud, bal, count);
        //c) вибрати задане число n абітурієнтів, що мають найвищий
        //середній бал.
        System.out.println("Вкажіть потрібну кількість абітуріениів з найбільшим балом");
        System.out.println("Мінімальне значення 0, максимальне " + count);
        int n = in.nextInt();
        MaxList(Stud, count, n);
        return;
    }
    public static void SameName(Abiturient[] student,int n, String Name){
        for(int i=0;i<n;i++) {
            if (student[i].name.equals(Name)==true)
                System.out.println(student[i].toString());
        }
    }
    public static void BalList(Abiturient[] student,double n,int max) {
        int i = 0;
        while (student[i].getValueBal() < n){ i++;
            if (i==max){
                System.out.println("Такого немає");
                return;
            }
        }
        for (int j = i; j < max; j++) System.out.println(student[j].toString());
    }
    public static void MaxList(Abiturient[] student,int m,int n){
        for(int j=m-n;j<m;j++)System.out.println(student[j].toString());
    }
}
