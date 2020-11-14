import java.util.ArrayList;

public class ArrayQueue
{
    private ArrayList<Integer> array;

    ArrayQueue(ArrayList<Integer> array)
    {
        this.array = array;
    }

    public boolean enqueue (Integer n) //Добавление значения
    {
        return array.add(n);
    }

    public Integer element() //Получение превого значения
    {
        return array.get(0);
    }

    public Integer dequeue () //Удаляет и выводит значение
    {
        int temp = array.get(0);
        array.remove(0);
        return temp;
    }

    public int size() //Размерность
    {
        return array.size();
    }

    public boolean isEmpty()//Проверка на пустое значение
    {
        return array.isEmpty();
    }

    public void clear()//Очистка
    {
        array.clear();
    }
}
