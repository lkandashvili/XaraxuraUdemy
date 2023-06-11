package org.example;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone2, Fred2, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=100}
                Flinstone3, Fred3, 1/1/1900, Programmer, {locpd=2300,yoe=8,iq=105}
                Flinstone4, Fred4, 1/1/1900, Programmer, {locpd=1630,yoe=3,iq=115}
                Flinstone5, Fred5, 1/1/1900, Programmer, {locpd=5,yoe=10,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble2, Barney2, 2/2/1905, Manager, {orgSize=100,dr=4}
                Rubble3, Barney3, 2/2/1905, Manager, {orgSize=200,dr=2}
                Rubble4, Barney4, 2/2/1905, Manager, {orgSize=500,dr=8}
                Rubble5, Barney5, 2/2/1905, Manager, {orgSize=175,dr=20}
                Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
                Flinstone2, Wilma2, 3/3/1910, Analyst, {projectCount=4}
                Flinstone3, Wilma3, 3/3/1910, Analyst, {projectCount=5}
                Flinstone4, Wilma4, 3/3/1910, Analyst, {projectCount=6}
                Flinstone5, Wilma5, 3/3/1910, Analyst, {projectCount=9}
                Rubble, Betty, 4/4/1915, CEO, {avgStockPrice=300}
                """;

        Matcher peopleMat = Employee.PEOPLE_PAT.matcher(peopleText);


        int totalSalaries = 0;
        IEmployee employee = null;

        List<IEmployee> employees = new ArrayList<>();

        while (peopleMat.find()) {
            employee = Employee.createEmployee(peopleMat.group());
            employees.add(employee);

//            if (employee instanceof Programmer coder) {
//                System.out.println(coder);
//
//            } else if (employee instanceof Manager managr) {
//                System.out.println(managr);
//
//            } else if (employee instanceof Analyst analy) {
//                System.out.println(analy);
//
//            } else if (employee instanceof CEO ceo) {
//                System.out.println(ceo);
//
//            } else {
//                System.out.println("Default output");
//            }

//            System.out.println(employee);
//            totalSalaries+= employee.getSalary();
        }

        for (IEmployee worker : employees) {
            System.out.println(employee);
            totalSalaries += worker.getSalary();
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.printf("The total payout should be %s%n", currencyInstance.format(totalSalaries));

//        Kuta klazo = new Kuta("kazaishvili","lasha-giorgi", LocalDate.of(2002,4,2));
//        System.out.println(klazo.firstName());

//        Flyer flyer = new CEO("");
//        flyer.fly();

//        Programmer coder = new Programmer("");
//        coder.cook("klazo");
    }
}
