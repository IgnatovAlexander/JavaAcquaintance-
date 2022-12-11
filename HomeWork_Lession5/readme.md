## Решение задач к семинару. Java: знакомство и как пользоваться базовым API (семинары) ##
## Урок 3. Хранение и обработка данных ч2: множество коллекций Map ##

### Задача 1: Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. ###

Программа состоит из одного главного модуля. В структуру HashMap заносятся номера телефонов и имена. Номера телефонов выступают ключом, т.к. уникальны всегда. Имена владельцев - значение ключа, т.к. могут повторяться. Модуль выводит в консоль наш справочник.

### Задача 2: Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. ###

Программа состоит из одного модуля, имеющего три блока кода:

1. Создание ArrayList с поочередным добавлением новых людей.
2. Создание HashMap. Каждое значение ArrayList заносится в двумерный массив, разбивается по пробелу. Первый элемент массива - ключ. Значением является количество повторов. Если в HashMap уже имеется строка из ArrayList, значит ключ HashMap переписывается с добавлением +1 к значению. Если нет значения, что ключ добавляется в HashMap со значением 1.
3. Вывод в консоль полученного HashMap с обратной сортировкой по значению.