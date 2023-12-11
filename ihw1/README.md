# Cinema

Сеанс идентифицируется по своей дате, фильм - по имени.

Запись в базе данных о фильме содержит имя фильма и его описание.

Запись в базе данных о сеансе содержит его дату, фильм и места в зале:

1. если место не куплено, что оно отмечено ⨯
2. если место куплено, но человек ещё его не занял, то отмечено ✓
3. если место куплено и человек его занял, то отмечено •

Все сохранённые данные находятся в папке data.
Данные хранятся в формате json.

show команды выводят "null", если искомой записи нет.

## Команды

Зафиксировать продажу билета на сеанс

```zsh
cinema sell <telephon number> <date> <x seat coordinate> <y seat coordinate>
```

Зафиксировать возврат билета на сеанс

```zsh
cinema revert <date> <x seat coordinate> <y seat coordinate>
```

Назначить сеанс

```zsh
cinema assign <date> <film name>
```

Отменить сеанс

```zsh
cinema remove session <date>
```

Удалить фильм из базы данных

```zsh
cinema remove film <film name>
```

Добавить фильм в базу данных

```zsh
cinema add <film name>
```

Изменить свойство фильма

```zhs
cinema edit <film name> <field name> <content>
```

Вывести сеанс

```zsh
cinema show session <date>
```

Вывести все сеансы

```zsh
cinema show sessions <date>
```

Вывести фильм

```zsh
cinema show film <film name>
```

Вывести все фильмы

```zsh
cinema show films
```

Вывести номер телефона человека, купившего место на сеанс.
Выводится "null", если место ещё не куплено.

```zsh
cinema show seat <date> <x seat coordinate> <y seat coordinate>
```

Зафиксировать то, что человек пришёл на сеанс

```zsh
cinema occupy <date> <x seat coordinate> <y seat coordinate>
```
