Мост - структурный паттерн, разделяет один или несколько классов на абстракцию и реализацию, что позволяет изменять их
независимо друг от друга.

Основная структура:
1. Абстракция - содержит код бизнес-логики, делегирует выполнение связанному объекту реализации.
2. Реализация - задаёт общий интерфейс для всех реализаций. Все методы, которые здесь описаны, будут доступны из класса
абстракции и его подклассов.
* Интерфейсы абстракции и реализации могут как совпадать, так и быть совершенно разными. Но обычно в реализации живут
базовые операции, на которых строятся сложные операции абстракции.
3. Конкретные реализации - содержат платформозависимый код.
4. Расширенные абстрации - содержит вариации управляющей логики.
5. Клиент - работает только с объектами абстрации. Не имеет прямого доступа к реализации, кроме связывания в начале.

Мост полезен в следующих случаях:
1. Когда нужно разделить абстракцию и реализацию: Мост позволяет разделить абстракцию (высокоуровневые компоненты) от
реализации (низкоуровневые детали). Это полезно, когда есть несколько вариантов реализации для одной абстракции или 
когда изменения в реализации не должны влиять на клиентов.
2. Когда изменения в абстракции не должны влиять на реализацию и наоборот: Использование Моста позволяет изменять
абстракцию и реализацию независимо друг от друга. Например, можно добавлять новые методы в абстракцию без изменения
реализации и наоборот.
3. Когда нужно расширять классы в двух независимых измерениях: Мост позволяет создавать иерархию классов, которая может
быть расширена в двух независимых направлениях. Например, можно иметь несколько подклассов абстракции и несколько
подклассов реализации и комбинировать их в любой комбинации.
4. Когда нужно скрыть детали реализации от клиентов: Мост позволяет скрыть сложную или изменчивую реализацию от клиентов,
предоставляя им простой интерфейс для взаимодействия с абстракцией.
5. Когда нужно сократить количество подклассов: В некоторых случаях Мост может помочь избежать разрастания числа
подклассов в абстракции. Вместо создания множества подклассов для всех комбинаций абстракции и реализации, можно
использовать Мост для комбинирования их динамически.