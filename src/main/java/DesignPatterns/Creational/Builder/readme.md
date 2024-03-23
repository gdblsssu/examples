Строитель - порождающий шаблон, позволяет создавать сложные объекты пошагово.

Основная структура:
1. Строитель - интерфейс, объявляет шаги конструирования для всех видов стрителей.
2. Конкретный строитель (КС) - реализует шаги конструирования, каждый по-своему. КС могут производить различные объекты,
не имеющие общего интерфейса.
3. Продукт - создаваемый объект. Не обязаны иметь общий интерфйс, если созданы разными строителями.
4. Директор - управляет процессом построения. Обычно используется, когда создание объекта требует определенной
последовательности шагов или когда есть несколько вариантов построения объектов.
* Обычно Клиент подаёт в конструктор директора уже готовый объект-строитель, и в дальнейшем данный директор использует
только его. Но возможен и другой вариант, когда клиент передаёт строителя через параметр строительного метода директора.
В этом случае можно каждый раз применять разных строителей для производства различных представлений объектов.

Строитель полезен в следующих случаях:
1. Когда объект имеет сложную структуру: Если создаваемый объект имеет сложную структуру с большим количеством опциональных
параметров или вложенных объектов, использование Строителя позволяет упростить его создание и конфигурацию.
2. Когда требуется избежать длинных списков параметров конструктора: Использование многочисленных параметров конструктора 
может сделать код менее читаемым и управляемым. Строитель позволяет задавать параметры объекта пошагово и более читаемо.
3. Когда требуется создание различных вариантов объекта с одними и теми же шагами построения: В случаях, когда существует
несколько вариантов конфигурации объекта, но базовый процесс его создания один и тот же, шаблон Строитель может
использоваться для создания различных конфигураций с одним и тем же набором шагов.
4. Когда требуется иметь контроль над процессом создания объекта: Строитель позволяет программисту иметь полный контроль
над процессом создания объекта. Это может быть полезно, когда требуется добавить дополнительную логику или проверки
при создании объекта.