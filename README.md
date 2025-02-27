# Основные консольные команды GIT
Для использования гита есть два варианта: через IDEA и через консоль. Далее даные команды для консольного гита. 
При использовании консоли нужно сделать следующее:

## Сдача первой домашки
1. Открыть в проводнике корневую папку с проектом 
2. Открыть меню правой кнопкой мыши и тыкнуть "Open Git Bash Here"
3. git init - инициализировать папку на компьютере, как репозиторий
4. git remote add origin "ссылка на репозиторий" - (Пример ссылки: https://github.com/RinatBeybutov/Consultations.git) связать локальную папку на компьютере с репозиторием на гитхаб
5. git checkout "branch_name" – переключиться на существующую ветку (branch_name - имя ветки на которую нужно переключиться)
6. git checkout -b "branch_name" – создать ветку и переключиться на нее
7. git add . – добавить все (точка в конце команды) новые файлы под управление git
8. git commit -m "comment" – коммит изменений (comment - комментарий к коммиту)
9. Отправка изменений в удаленный репозиторий (branch_name - имя текущей ветки):
10. git push --set-upstream origin "branch_name" – первый раз после создания ветки
11. git push – во всех остальных случаях

* команда git status выведет в консоль текущее положение проекта и файлов
* https://learngitbranching.js.org/ - тренажер с командами гита (красочный и интересный)

## Сдача второй и последующих домашек
1. git checkout master - переходим на главную ветку
2. git pull - скачиваем изменения из мастера, которые появились после выполнения merge pull request
3. git checkout -b "branch_name" – создать ветку и переключиться на нее
4. Выполняем домашку
5. git add .  - добавляем все новые файлы для отслеживания гитом
6. git commit -m "comment" - создаем коммит для всех изменений
7. git push --set-upstream origin "branch_name" – первый раз после создания ветки

## Откат коммита
Для того, чтобы откатить коммит в удаленном репозитории, нужно:
1. git reset --harf @~ - передвигаем указатель головы списка коммитов на один назад
2. git push -f - пушим это изменение в репозиторий

# Алгоритм формирования Pull Request (Как сдавать домашку)
Для того, чтобы сформировать ПР, в который бы попали коммиты только текущей работы необходимо выполнить следующие действия:
1. До выполнения работы (!), находясь в ветке master (main на GitHub) создать новую ветку под текущую работу. Это можно сделать с помощью команды “git checkout –b XXX”, где XXX название новой ветки( в идее нужно выбрать пункт checkout и ввести название новой ветки )
2. Выполнить в этой ветке работу
3. Закоммитить (команда “git commit”), запушить (команда “git push”)
4. Создать pull request на сайте странице github (Pull requests -> New pull request)
5. Послать ссылку на созданный ПР в ответе для домашней работы
6. Когда работа будет принята, смерджить ветку с master (main на GitHub) с помощью соответствующей кнопки в ПР на github (“Merge pull request”)

# Правила оформления кода:

## Именование переменных
1. Давать переменным осмысленные названия. К примеру 'int a' - плохой пример, а 'int countBanana' говорит нам о том, 
что в ней лежит количество бананов. Имена нужно давать на английском языке, а транслитом. При работе в
мультинациональной команде вашим коллегам будет непонятно, что такое "raznost" или "pervoeChislo".
2. Названия переменных должны быть в формате lowerCamelCase (пример negativeNumberGreatherThan100)
3. Названия классов должны быть в формате CamelCase (пример MyFirstApplicationConfiguration)
4. Названия констант должны быть в  формате SCREAMING_SNAKE_CASE (пример RUSSIAN_ALPHABET_LENGTH)

# Самые часто используемые горячие клавиши:
1. Ctrl + Alt + L - поправить форматирование выделенного участка кода
2. Ctrl + P - подсветить варианты входных параметров метода
3. Ctrl + Shift + / - закомментировать выделенный участок кода
4. Ctrl + D - дублировать текущую строку
5. Ctr + Shift + F	- поиск по всем файлам (переход — F4)
6. Ctr + G - переход к строке или строке:номеру_символа
7. Ctr + Alt + B - перейти к реализации метода
8. Alt + Enter - вызов меню на строке кода, затем выбор "Introduce local variable"
для создания переменной из метода

# Ссылки на сайты с алгоритмическими задачами
Имеет смысл заходить на них и решать задачи после прохождения середины курса
1. https://leetcode.com/problemset/
2. https://www.codewars.com/
3. Ссылка на что=то