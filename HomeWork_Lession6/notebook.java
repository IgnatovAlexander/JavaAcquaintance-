/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - 
сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

package HomeWork_Lession6;

import java.util.*;

public class notebook {
    String brand;
    double screenSize;
    int ram;
    int ssdSize;
    String os;
    String cpuManufacturer;

    public notebook(String brand, double screenSize, int ram, int ssdSize, String os, String cpuManufacturer) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
        this.ssdSize = ssdSize;
        this.os = os;
        this.cpuManufacturer = cpuManufacturer;
    }

    @Override
    public String toString() {
        return "notebook{" +
                "brand=" + brand +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", ssdSize=" + ssdSize +
                ", os=" + os +
                ", cpuManufacturer=" + cpuManufacturer +
                '}';
    }

    public boolean equals(Object notebooks) {
        notebook thisNotebook = (notebook) notebooks;
        return brand.equals(thisNotebook.brand) &&
                screenSize == thisNotebook.screenSize &&
                ram == thisNotebook.ram &&
                ssdSize == thisNotebook.ssdSize &&
                os.equals(thisNotebook.os) &&
                cpuManufacturer.equals(thisNotebook.cpuManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, screenSize, ram, ssdSize, os, cpuManufacturer);
    }

    public static void main(String[] args) {
        notebook notebook1 = new notebook("Asus", 14, 8, 256, "Windows", "AMD");
        notebook notebook2 = new notebook("Asus", 15.6, 16, 512, "Windows", "Intel");
        notebook notebook3 = new notebook("HP", 15.6, 16, 512, "Windows", "AMD");
        notebook notebook4 = new notebook("Lenovo", 15.6, 8, 512, "Windows", "AMD");
        notebook notebook5 = new notebook("Lenovo", 15.6, 8, 256, "Windows", "Intel");
        notebook notebook6 = new notebook("Lenovo", 15.6, 16, 512, "Windows", "Intel");
        notebook notebook7 = new notebook("Lenovo", 16, 8, 512, "Windows", "Intel");
        notebook notebook8 = new notebook("Apple", 13.3, 8, 512, "macOS", "Apple");
        notebook notebook9 = new notebook("Apple", 14.2, 16, 512, "macOS", "Apple");
        notebook notebook10 = new notebook("Apple", 16.2, 16, 512, "macOS", "Apple");

        HashSet<notebook> notebooks = new HashSet<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);
        notebooks.add(notebook7);
        notebooks.add(notebook8);
        notebooks.add(notebook9);
        notebooks.add(notebook10);

        Scanner choice = new Scanner(System.in);
        System.out.print("Выберете параметр для фильтрации: " +
                "\n 1. Марка ноутбука" +
                "\n 2. Размер экрана" +
                "\n 3. Размер оперативной памяти" +
                "\n 4. Размер жесткого диска" +
                "\n 5. Операционная система" +
                "\n 6. Производитель процессора \n");
        int num = choice.nextInt();
        parametrFilter(choiseFilter(num), notebooks, num);
        choice.close();
    }

    public static Map<String, String> choiseFilter(int number) {
        Scanner choice = new Scanner(System.in);
        Map<String, String> choiceMap = new HashMap<>();
        if (number == 3) {
            System.out.print("Введите минимальное значение ");
            String min = choice.next();
            System.out.print("Введите максимальное значение ");
            String max = choice.next();
            choiceMap.put("min", min);
            choiceMap.put("max", max);
            choice.close();
        } else if (number == 1) {
            System.out.print("\n Введите название марки: Asus, HP, Lenovo, Apple: \n");
            String brands = choice.next();
            choiceMap.put("brand", brands);
            choice.close();
        } else if (number == 5) {
            System.out.print("\n Введите название операционной системы: Windows, macOS: \n");
            String cpu = choice.next();
            choiceMap.put("cpu", cpu);
            choice.close();
        } else if (number == 5) {
            System.out.print("\n Введите название производителя процессора: Intel, AMD, Apple: \n");
            String os = choice.next();
            choiceMap.put("os", os);
            choice.close();
        } else {
            System.out.print("\n Ввведен не вверный праметр\n");
        }
        return choiceMap;
    }

    public static void parametrFilter(Map<String, String> newMap, HashSet<notebook> notebooks, int number) {
        if (number == 1) {
            for (notebook elem : notebooks) {
                for (String key : newMap.keySet()) {
                    if (elem.brand.equals(newMap.get(key))) {
                        System.out.println("\n" + elem);
                    }
                }
            }

        } else if (number == 2) {
            for (notebook elem : notebooks) {
                double minimum = Double.parseDouble(newMap.get("min"));
                double maximum = Double.parseDouble(newMap.get("max"));
                if (elem.screenSize >= minimum) {
                    if (elem.screenSize <= maximum) {
                        System.out.println("\n" + elem);
                    }
                }
            }

        } else if (number == 3) {
            for (notebook elem : notebooks) {
                double minimum = Double.parseDouble(newMap.get("min"));
                double maximum = Double.parseDouble(newMap.get("max"));
                if (elem.ram >= minimum) {
                    if (elem.ram <= maximum) {
                        System.out.println("\n" + elem);
                    }
                }
            }

        } else if (number == 4) {
            for (notebook elem : notebooks) {
                double minimum = Double.parseDouble(newMap.get("min"));
                double maximum = Double.parseDouble(newMap.get("max"));
                if (elem.ssdSize >= minimum) {
                    if (elem.ssdSize <= maximum) {
                        System.out.println("\n" + elem);
                    }
                }
            }

        } else if (number == 5) {
            for (notebook elem : notebooks) {
                for (String key : newMap.keySet()) {
                    if (elem.os.equals(newMap.get(key))) {
                        System.out.println("\n" + elem);
                    }
                }
            }

        } else if (number == 6) {
            for (notebook elem : notebooks) {
                for (String key : newMap.keySet()) {
                    if (elem.cpuManufacturer.equals(newMap.get(key))) {
                        System.out.println("\n" + elem);
                    }
                }
            }
        }
    }
}
